package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.genericdao.DuplicateKeyException;
import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databean.CustomerAcctBean;
import formbean.CustomerRegisterForm;
import model.CustomerAcctDAO;
import model.Model;

public class CustomerRegisterAction extends Action{
	private FormBeanFactory<CustomerRegisterForm> formBeanFactory = FormBeanFactory.getInstance(CustomerRegisterForm.class);
	private CustomerAcctDAO customerAcctDAO;
	public CustomerRegisterAction(Model model) {
		customerAcctDAO = model.getCustomerAcctDAO();
	}
	
	public String getName() {return "customerRegister.do";}
	
	public String perform(HttpServletRequest request, HttpServletResponse response) {
		List<String> errors = new ArrayList<String>();
        request.setAttribute("errors",errors);
        
        try {
			CustomerRegisterForm customerRegisterForm = formBeanFactory.create(request);
			if (!customerRegisterForm.isPresent()) {return "customerRegister.jsp";}
			errors.addAll(customerRegisterForm.getValidationErrors());
			if (errors.size() > 0) {return "customerRegister.jsp";}
			
			CustomerAcctBean newCustomer = new CustomerAcctBean();
			newCustomer.setFname(customerRegisterForm.getFname());
			newCustomer.setLname(customerRegisterForm.getLname());
			newCustomer.setBirth_day(customerRegisterForm.getBirth_day());
			newCustomer.setBirth_month(customerRegisterForm.getBirth_month());
			newCustomer.setBirth_year(customerRegisterForm.getBirth_year());
			newCustomer.setAddress1(customerRegisterForm.getAddress1());
			newCustomer.setAddress2(customerRegisterForm.getAddress2());
			newCustomer.setCity(customerRegisterForm.getCity());
			newCustomer.setState(customerRegisterForm.getState());
			newCustomer.setZip(customerRegisterForm.getZip());
			newCustomer.setPhone_number(customerRegisterForm.getPhone_number());
			newCustomer.setEmail(customerRegisterForm.getEmail());
			newCustomer.encodePassword(customerRegisterForm.getPassword());
			customerAcctDAO.create(newCustomer);
			
			request.setAttribute("message", "Account Successfully Created");
        	
        	
		} catch(DuplicateKeyException e) {
            errors.add("Account with this email already exists.");
            return "customerRegister.jsp";
        } catch (RollbackException e) {
            errors.add(e.getMessage());
            return "customerRegister.jsp";
        } catch (FormBeanException e) {
            errors.add(e.getMessage());
            return "customerRegister.jsp";
        }
		return "customerEnroll.jsp";
	}
	
}
