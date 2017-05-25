package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mybeans.form.FormBeanFactory;

import formbean.CustomerEnrollForm;

/**
 * @author Yi
 * Customer enroll action.
 */
public class CustomerEnrollAction extends Action {
    
	private FormBeanFactory<CustomerEnrollForm> formBeanFactory = FormBeanFactory.getInstance(CustomerEnrollForm.class);
	
	public String getName() {
	    return "customerEnroll.do";
	}
	
	public String perform (HttpServletRequest request) {
	    
		List<String> errors = new ArrayList<String>();
        request.setAttribute("errors", errors);
        String message = null;
        
        try {
		CustomerEnrollForm form = formBeanFactory.create(request);
		// check if form is submitted
		if (!form.isPresent()) {
		    return "customerEnroll.jsp";
		}
		
		// check for any error
		errors.addAll(form.getValidationErrors());
		request.setAttribute("errrors", errors);
		if (errors.size() > 0) {
		    return "customerEnroll.jsp";
		}
		
		// message when customer decline to enroll
		if(form.getButton().equals("Decline Enrollment")) {
			message = "You've chosen NOT to enroll in our program. See you next time!";
		}
		request.setAttribute("message", message);
		
        } catch (Exception e) {
			e.printStackTrace();
		}
		return "customerEnroll.jsp";
	}
}
