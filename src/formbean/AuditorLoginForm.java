package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class AuditorLoginForm extends FormBean{
	private String auditor_username;
	private String password;
	
	public String getAuditor_username() {
		return auditor_username;
	}
	public void setAuditor_username(String auditor_username) {
		this.auditor_username = auditor_username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<String> getValidationErrors() {
    	List<String> errors = new ArrayList<String>();
    	
    	if (auditor_username.length() ==0 || auditor_username == null) {
    		errors.add("Please input a valid user name for Auditor Log in.");
    	}
    	
    	if (password.length() == 0 || password ==  null){
    		errors.add("Please input a valid password.");
    	}
    	
    	return errors;
	}
	

}
