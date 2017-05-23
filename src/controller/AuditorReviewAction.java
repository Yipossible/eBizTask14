package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanFactory;

import databean.AllDataBean;
import formbean.AuditorSelectDBForm;
import model.AllDataDAO;
import model.DiseaseDAO;
import model.GroceryStoreDAO;
import model.InsuranceCompanyDAO;
import model.InsuranceHealthDAO;
import model.Model;
import viewbean.NEWAllDataViewBean;

public class AuditorReviewAction extends Action {
	
	private AllDataDAO allDataDAO;
	private DiseaseDAO diseaseDAO;
	private InsuranceCompanyDAO insuranceCompanyDAO;
	private InsuranceHealthDAO insuranceHealthDAO;
	private GroceryStoreDAO groceryStoreDAO;
	private FormBeanFactory<AuditorSelectDBForm> formBeanFactory = FormBeanFactory.getInstance(AuditorSelectDBForm.class);
	
	public AuditorReviewAction(Model model) {
		allDataDAO = model.getAllDataDAO();
		diseaseDAO = model.getDiseaseDAO();
		insuranceCompanyDAO = model.getInsuranceCompanyDAO();
		insuranceHealthDAO = model.getInsuranceHealthDAO();
		groceryStoreDAO = model.getGroceryStoreDAO();
	}
	
	public String getName() {return "auditorReview.do";}
	
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
        request.setAttribute("errors",errors);
        System.out.println("enter Auditor Review perform action");
        
		
        try {
			AuditorSelectDBForm form = formBeanFactory.create(request);
			
			switch (form.getDatabase()) {
			case "allData":
				List<NEWAllDataViewBean> list = ViewAllData();
				System.out.println(list.get(0).getAd_keywords());
				System.out.println(list.get(0).getInsurance_member_id());
				
				request.getSession().setAttribute("variable", list.get(0));
				request.getSession().setAttribute("method", list.get(1));
				request.getSession().setAttribute("dataBefore", list.get(2));
				request.getSession().setAttribute("dataAfter", list.get(3));
				request.getSession().setAttribute("code", list.get(4));
				System.out.println("all data loaded");
				break;

			default:
				break;
			}
		} catch (Exception e) {
			errors.add(e.getMessage());
			return "auditorReview.jsp";
		}
        System.out.println("print page");
		return "auditorReview.jsp";
	}

	
	public String getAgeRange(String s) {
		int age = 2017 - Integer.valueOf(s.substring(1,5));
		int a = age / 10; 
		int lowerbound = a * 10;
		int upperbound = (a+1) *10;
		return "Age[" + lowerbound + "," + upperbound + "]";
	}
	
	public List<NEWAllDataViewBean> ViewAllData() throws RollbackException {
		List<NEWAllDataViewBean> list = new ArrayList<NEWAllDataViewBean>();
		
		//get variable name
		NEWAllDataViewBean variable_name = new NEWAllDataViewBean();
		variable_name.setAd_keywords("ad_keywords");
		variable_name.setAddress("address");
		variable_name.setCity("city");
		variable_name.setCoupon_code("coupon_code");
		variable_name.setCredit_card("credit_card");
		variable_name.setDob("Date of Birth");
		variable_name.setEthnicity("ethnicity");
		variable_name.setFirstname("First Name");
		variable_name.setGender("gender");
		variable_name.setGrocery_member_id("grocer_member_id");
		variable_name.setId("id");
		variable_name.setInsurance_member_id("insurance_member_id");
		variable_name.setLastname("Last Name");
		variable_name.setPlan_number("plan_number");
		variable_name.setSsn("ssn");
		variable_name.setState("state");
		variable_name.setZip("zip");
		System.out.println("variable data loaded");
		list.add(variable_name);
		
		//de-identification method
		NEWAllDataViewBean method = new NEWAllDataViewBean();
		method.setAd_keywords("Suppressed");
		method.setAddress("Suppresed");
		method.setCity("Default");
		method.setCoupon_code("Suppressed");
		method.setCredit_card("Suppressed");
		method.setDob("Generalizaed");
		method.setEthnicity("Default");
		method.setFirstname("Suppressed");
		method.setGender("Default");
		method.setGrocery_member_id("Suppressed");
		method.setId("Suppresed");
		method.setInsurance_member_id("Suppressed");
		method.setLastname("Suppressed");
		method.setPlan_number("Suppressed");
		method.setSsn("Suppressed");
		method.setState("Default");
		method.setZip("Generalized");
		System.out.println("method data loaded");
		list.add(method);
		
		//show data before
		NEWAllDataViewBean data_before = new NEWAllDataViewBean();
		
		AllDataBean[] allDataBeans = allDataDAO.match();
        if (allDataBeans.length == 0 || allDataBeans == null) {
        	System.out.println("no data available");
        }
		
		data_before.setAd_keywords(allDataBeans[0].getAd_keywords());
		data_before.setAddress(allDataBeans[0].getAddress());
		data_before.setCity(allDataBeans[0].getCity());
		data_before.setCoupon_code(allDataBeans[0].getCoupon_code());
		data_before.setCredit_card(allDataBeans[0].getCredit_card());
		data_before.setDob(allDataBeans[0].getDob());
		data_before.setEthnicity(allDataBeans[0].getEthnicity());
		data_before.setFirstname(allDataBeans[0].getFirstname());
		data_before.setGender(allDataBeans[0].getGender());
		data_before.setGrocery_member_id(allDataBeans[0].getGrocery_member_id());
		data_before.setId(allDataBeans[0].getId());
		data_before.setInsurance_member_id(allDataBeans[0].getInsurance_member_id());
		data_before.setLastname(allDataBeans[0].getLastname());
		data_before.setPlan_number(allDataBeans[0].getPlan_number());
		data_before.setSsn(allDataBeans[0].getSsn());
		data_before.setState(allDataBeans[0].getState());
		data_before.setZip(allDataBeans[0].getZip());
		System.out.println("raw data loaded");
		list.add(data_before);
		
		//show data after
		NEWAllDataViewBean data_after = new NEWAllDataViewBean();
		data_after.setAd_keywords("XXX");
		data_after.setAddress("XXX");
		data_after.setCity(allDataBeans[0].getCity());
		data_after.setCoupon_code("XXX");
		data_after.setCredit_card("XXX");
		data_after.setDob(getAgeRange(allDataBeans[0].getDob()));
		data_after.setEthnicity(allDataBeans[0].getEthnicity());
		data_after.setFirstname("XXX");
		data_after.setGender(allDataBeans[0].getGender());
		data_after.setGrocery_member_id("XXX");
		data_after.setId("XXX");
		data_after.setInsurance_member_id("XXX");
		data_after.setLastname("XXX");
		data_after.setPlan_number("XXX");
		data_after.setSsn("XXX");
		data_after.setState(allDataBeans[0].getState());
		data_after.setZip(allDataBeans[0].getZip().substring(0, 2) + "XXX");
		System.out.println("DI data loaded");
		list.add(data_after);
		
		//show code compliance
		NEWAllDataViewBean code = new NEWAllDataViewBean();
		code.setAd_keywords("HIPPA §164.501");
		code.setAddress("HIPPA §164.502");
		code.setCity("HIPPA §164.503");
		code.setCoupon_code("HIPPA §164.504");
		code.setCredit_card("HIPPA §164.516");
		code.setDob("HIPPA §164.505");
		code.setEthnicity("HIPPA §164.506");
		code.setFirstname("HIPPA §164.507");
		code.setGender("HIPPA §164.508");
		code.setGrocery_member_id("HIPPA §164.517");
		code.setId("HIPPA §164.509");
		code.setInsurance_member_id("HIPPA §164.510");
		code.setLastname("HIPPA §164.511");
		code.setPlan_number("HIPPA §164.512");
		code.setSsn("HIPPA §164.513");
		code.setState("HIPPA §164.514");
		code.setZip("HIPPA §164.515");
		System.out.println("Legal data loaded");
		list.add(code);
		return list;
	}
}
