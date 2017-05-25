package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.MatchArg;
import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databean.AuditorBean;
import formbean.AuditorLoginForm;
import model.AuditorDAO;
import model.Model;

public class AuditorLoginAction extends Action{
	private FormBeanFactory<AuditorLoginForm> formBeanFactory = FormBeanFactory.getInstance(AuditorLoginForm.class);
	private AuditorDAO auditorDAO;
	
	public AuditorLoginAction(Model model) {
		auditorDAO = model.getAuditorDAO();
	}

	public String getName(){return "auditorLogin.do";}
	
	public String perform(HttpServletRequest request){
		
		HttpSession session = request.getSession();
		List<String> errors = new ArrayList<String>();
        
		try {
			AuditorLoginForm auditorLoginForm = formBeanFactory.create(request);
			request.setAttribute("auditorLoginForm", auditorLoginForm);
			
			if (!auditorLoginForm.isPresent()) {return "auditorLogin.jsp";}
			errors.addAll(auditorLoginForm.getValidationErrors());
			if (errors.size() > 0) {return "auditorLogin.jsp";}
			
			AuditorBean[] auditors = auditorDAO.match(MatchArg.equals("auditor_username", auditorLoginForm.getAuditor_username()));
			if (auditors.length == 0 || auditors[0] == null) {
				errors.add("No Auditor with such username: " + auditorLoginForm.getAuditor_username() + " exists.");
				return "auditorLogin.jsp";
			} else {
				if(!auditors[0].checkPassword(auditorLoginForm.getPassword())) {
					errors.add("Incorrect Password");
					return "auditorLogin.jsp";
				}
			}
			
			session.setAttribute("auditor", auditors[0].getAuditor_username());
			
			return "auditorReview.jsp";
			
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "auditorLogin.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "auditorLogin.jsp";
		} 
		
	}
}
