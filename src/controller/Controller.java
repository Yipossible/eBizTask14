package controller;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;

import databean.AuditorBean;
import databean.CustomerMonitorAction;
import model.AllDataDAO;
import model.AuditorDAO;
import model.CustomerAcctDAO;
import model.DiseaseDAO;
import model.GroceryStoreDAO;
import model.InsuranceCompanyDAO;
import model.InsuranceHealthDAO;
import model.Model;



public class Controller extends HttpServlet {

    private static final long serialVersionUID = 1L;

    Model model;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    
    model = new Model(getServletConfig());
    	
    AllDataDAO allDataDAO = model.getAllDataDAO();
    DiseaseDAO diseaseDAO = model.getDiseaseDAO();
    GroceryStoreDAO groceryStoreDAO = model.getGroceryStoreDAO();
    InsuranceCompanyDAO insuranceCompanyDAO = model.getInsuranceCompanyDAO();
    InsuranceHealthDAO insuranceHealthDAO = model.getInsuranceHealthDAO();
    AuditorDAO auditorDAO = model.getAuditorDAO();
    CustomerAcctDAO customerAcctDAO = model.getCustomerAcctDAO();
    
    
    
    
    try { 
        if ( model.getAuditorDAO().getAuditor().length == 0){    
        	AuditorBean auditorBean = new AuditorBean();
        	
        	auditorBean.setAuditor_username("HealthyChoice");
        	auditorBean.encodePassword("safe");
            auditorDAO.create(auditorBean);
        }
    } catch (RollbackException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    
    
    

        Action.add(new CustomerRegisterAction(model));
        Action.add(new AuditorLoginAction(model));
        Action.add(new AuditorDeIdentifyDataAction(model));
        Action.add(new AuditorReviewAction(model));
        Action.add(new CustomerEnrollAction());
        Action.add(new CustomerMonitorAction()); 
//    	Action.add(new GetDirectionAction());
//    	Action.add(new RouteDetailsAction());
    	
    	
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String nextPage = performTheAction(request);
            sendToNextPage(nextPage, request, response);
        } catch (Exception e) {
            String error = e.getMessage();
            if (error == null || error.isEmpty()) error = "Unknown error!";
            request.setAttribute("error", error);
            sendToNextPage("error.jsp", request, response);
        }
    }

    /*
     * Extracts the requested action and (depending on whether the user is
     * logged in) perform it (or make the user login).
     *
     * @param request
     *
     * @return the next page (the view)
     */
    private String performTheAction(HttpServletRequest request) throws ServletException {
        String servletPath = request.getServletPath();
        String action = getActionName(servletPath);
        request.setAttribute("activeLink", action);
        System.out.println("perform action: " + action);
        return Action.perform(action, request);
    }

    /*
     * If nextPage is null, send back 404 If nextPage ends with ".do", redirect
     * to this page. If nextPage ends with ".jsp", dispatch (forward) to the
     * page (the view) This is the common case
     */
    private void sendToNextPage(String nextPage, HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {
        if (nextPage == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND,
            request.getServletPath());
            return;
        }

        if (nextPage.endsWith(".do")) {
            response.sendRedirect(nextPage);
            return;
        }

        if (nextPage.endsWith(".jsp")) {
            prepareLinks(request);
            RequestDispatcher d = request.getRequestDispatcher("WEB-INF/"
                    + nextPage);
            d.forward(request, response);
            return;
        }

        throw new ServletException(Controller.class.getName()
                + ".sendToNextPage(\"" + nextPage + "\"): invalid extension.");
    }

    /*
     * Returns the path component after the last slash removing any "extension"
     * if present.
     */
    private String getActionName(String path) {
        // We're guaranteed that the path will start with a slash
        int slash = path.lastIndexOf('/');
        return path.substring(slash + 1);
    }

    private void prepareLinks(HttpServletRequest request) {
        Map<String, String> links = new LinkedHashMap<String, String>();
        if (request.getAttribute("auditor") != null) {
            //links.put("auditorLogin.do", "Auditor Login");
            links.put("auditordeIdentification.do", "Generate Data");

        } else if (request.getAttribute("customer") != null) {
            links.put("customerRegister.do", "Customer Register");}
        else {
        	links.put("customerRegister.do", "Customer Register");
        	links.put("auditorLogin.do", "Auditor Login");
        }

        request.setAttribute("links", links);
    }
}
