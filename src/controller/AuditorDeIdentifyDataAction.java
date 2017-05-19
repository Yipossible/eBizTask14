package controller;

import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.genericdao.DAOException;

import databean.AllDataBean;
import model.AllDataDAO;
import model.Model;
import viewbean.NEWAllDataViewBean;

public class AuditorDeIdentifyDataAction extends Action {

	private AllDataDAO allDataDAO;
	
	public AuditorDeIdentifyDataAction(Model model) {
		allDataDAO = model.getAllDataDAO();
	}
	public String getName () {return "auditordeIdentification.do";}
	
	public String getAgeRange(String s) {
		int age = 2017 - Integer.valueOf(s.substring(1,5));
		int a = age / 10; 
		int lowerbound = a * 10;
		int upperbound = (a+1) *10;
		return "Age[" + lowerbound + "," + upperbound + "]";
	}
	
	public String perform (HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
        request.setAttribute("errors",errors);
        System.out.println("enter perform");
        try {
        AllDataBean[] allDataBeans = allDataDAO.match();
        if (allDataBeans.length == 0 || allDataBeans == null) {
        	errors.add("All Data information NOT Available.");
        	return "auditordeIdentification.jsp";
        }
        
        System.out.println("retrieve raw data");
        List<NEWAllDataViewBean> list = new ArrayList<NEWAllDataViewBean>();
        System.out.println("created list");
        for (int i = 0; i < allDataBeans.length; i ++) {
        	NEWAllDataViewBean viewBean = new NEWAllDataViewBean();
        	System.out.println("viewbean generated");
        	//suppressed
        	viewBean.setInsurance_member_id("*");
        	viewBean.setGrocery_member_id("*");
        	viewBean.setPlan_number("*");
        	viewBean.setAddress("*");
        	viewBean.setCredit_card("*");
        	viewBean.setCoupon_code("*");
        	viewBean.setFirstname("*");
        	viewBean.setLastname("*");
        	viewBean.setSsn("*");
        	viewBean.setId("*");
        	viewBean.setCity("*");
        	System.out.println("suppression performed");
        	
        	//special case;
        	viewBean.setAd_keywords("*");
        	
        	//default
        	viewBean.setGender(allDataBeans[i].getGender());
        	viewBean.setState(allDataBeans[i].getState());
        	viewBean.setEthnicity(allDataBeans[i].getEthnicity());
        	System.out.println("default performed");
        	
        	//generalizations
        	viewBean.setZip(allDataBeans[i].getZip().substring(0, 2) + "XXX");
        	System.out.println("ZIP generalization");
        	System.out.println(allDataBeans[i].getDob());
        	System.out.println(getAgeRange(allDataBeans[i].getDob()));
        	viewBean.setDob(getAgeRange(allDataBeans[i].getDob()));
        	System.out.println("DOB generalization");
        	System.out.println("generalization performed");
        	
        	list.add(viewBean);
        	System.out.println("new view bean created " + i);
        }
        
        request.setAttribute("newDataList", list);
			

        	
		} catch (Exception e) {
			errors.add(e.getMessage());
			return "auditordeIdentification.jsp";
        }
    
       
		
		
		
		
		return "auditordeIdentification.jsp";
	}
}
