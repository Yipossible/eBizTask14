package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import formbean.CustomerEnrollForm;
import formbean.CustomerRegisterForm;
import model.Model;

public class CustomerEnrollAction extends Action{
	private FormBeanFactory<CustomerEnrollForm> formBeanFactory = FormBeanFactory.getInstance(CustomerEnrollForm.class);
	
	public String getName() {return "customerEnroll.do";}
	
	public String perform (HttpServletRequest request){
		List<String> errors = new ArrayList<String>();
        request.setAttribute("errors",errors);
        String message = null;
        try {
			
		
		CustomerEnrollForm form = formBeanFactory.create(request);
		
		if(!form.isPresent()) {return "customerEnroll.jsp";}
		errors.addAll(form.getValidationErrors());
		if(errors.size() > 0) {return "customerEnroll.jsp";}
		
		request.setAttribute("errrors", errors);
		
		if(form.getButton().equals("NO")) {
			message = "You've chosen NOT to enrolled in our program. See you next time!";
		} 
		
		if (form.getButton().equals("YES")) {
			message = "Thanks for enrolling in our program with your data authorization";
		}
		
		request.setAttribute("message", message);
		
		
		
		
        } catch (Exception e) {
			// TODO: handle exception
		}
		
		return "customerEnroll.jsp";
	}
}
