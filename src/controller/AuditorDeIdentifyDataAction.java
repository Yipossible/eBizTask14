package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import databean.AllDataBean;
import model.AllDataDAO;
import model.Model;
import viewbean.NEWAllDataViewBean;

public class AuditorDeIdentifyDataAction extends Action {
	//Delimiters which has to be in the CSV file
	private static final String COMMA_DELIMITER = ";";
	private static final String LINE_SEPARATOR = "\n";    
	    //File header
	private static final String HEADER = "insurance_member_id;grocery_member_id;plan_number;dob;address;credit_card;ad_keywords;coupon_code;firstname;lastname;gender;ethnicity;ssn;zip;id;city;state";
	
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
	
	public String perform (HttpServletRequest request){
		List<String> errors = new ArrayList<String>();
        request.setAttribute("errors",errors);
        HttpSession session = request.getSession();
        
        
        System.out.println("enter perform");
        try{
        AllDataBean[] allDataBeans = allDataDAO.match();
        if (allDataBeans.length == 0 || allDataBeans == null) {
        	errors.add("All Data information NOT Available.");
        	return "auditorReview.jsp";
        }
        
        System.out.println("retrieve raw data");
        List<NEWAllDataViewBean> list = new ArrayList<NEWAllDataViewBean>();
        System.out.println("created list");
        for (int i = 0; i < allDataBeans.length; i ++) {
        	NEWAllDataViewBean viewBean = new NEWAllDataViewBean();
        	//System.out.println("viewbean generated");
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
        	//System.out.println("suppression performed");
        	
        	//special case;
        	viewBean.setAd_keywords("*");
        	
        	//default
        	viewBean.setGender(allDataBeans[i].getGender());
        	viewBean.setState(allDataBeans[i].getState());
        	viewBean.setEthnicity(allDataBeans[i].getEthnicity());
        	//System.out.println("default performed");
        	
        	//generalizations
        	viewBean.setZip(allDataBeans[i].getZip().substring(0, 2) + "XXX");
        	//System.out.println("ZIP generalization");
        	//System.out.println(allDataBeans[i].getDob());
        	//System.out.println(getAgeRange(allDataBeans[i].getDob()));
        	viewBean.setDob(getAgeRange(allDataBeans[i].getDob()));
        	//System.out.println("DOB generalization");
        	//System.out.println("generalization performed");
        	
        	list.add(viewBean);
        	System.out.println("new view bean created " + i);
        }
        
//        request.setAttribute("newDataList", list);
        
     
        
        
        
        System.out.println("list created and added to request");

    
       
        
        // export csv file
        FileWriter fileWriter = null;
       
			fileWriter = new FileWriter("/Users/yiwang/Desktop/NewAllData.csv");
			//Adding the header
    		fileWriter.append(HEADER);
    		//fileWriter.append(COMMA_DELIMITER);
    		fileWriter.append(LINE_SEPARATOR);
    		//Iterate the empList
    		Iterator<NEWAllDataViewBean> datalist = list.iterator();
    		while(datalist.hasNext())
    		{
    			NEWAllDataViewBean e = (NEWAllDataViewBean)datalist.next();
    			fileWriter.append(e.getInsurance_member_id());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getGrocery_member_id());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getPlan_number());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getDob());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getAddress());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getCredit_card());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getAd_keywords());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getCoupon_code());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getFirstname());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getLastname());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getGender());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getEthnicity());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getSsn());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getZip());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getId());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getCity());
    			fileWriter.append(COMMA_DELIMITER);
    			fileWriter.append(e.getState());
    			fileWriter.append(COMMA_DELIMITER);

    			fileWriter.append(LINE_SEPARATOR);
    		}
    		System.out.println("Write to CSV file Succeeded!!!");
    		
        	
        	
    			fileWriter.flush();
    			fileWriter.close();
        } catch(Exception ee)
    	{
    		ee.printStackTrace();
    	}

		
		
		return "auditorReview.jsp";
	}
}
