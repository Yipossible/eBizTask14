package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import viewbean.NEWAllDataViewBean;

public class AuditorDeIdentifyDataAction extends Action {
	//Delimiters which has to be in the CSV file
	private static final String COMMA_DELIMITER = ";";
	private static final String LINE_SEPARATOR = "\n";    
	//File header
	private static final String HEADER = "insurance_member_id;grocery_member_id;plan_number;dob;address;credit_card;ad_keywords;coupon_code;firstname;lastname;gender;ethnicity;ssn;zip;id;city;state";
	
	//Initialize Mysql Connection
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_NAME = "test";
    private static final String TABLE_NAME = "alldata";
    private static final String URL = "jdbc:mysql://ec2-184-72-75-223.compute-1.amazonaws.com/" + DB_NAME + "?useSSL=false";
    private static final String DB_USER = "front";
    private static final String DB_PWD = "";
    private static Connection connSQL;
	
	public String getName() {
	    return "auditordeIdentification.do";
	}
	
	public String getAgeRange(String s) {
		int age = 2017 - Integer.valueOf(s.substring(1,5));
		int a = age / 10; 
		int lowerbound = a * 10;
		int upperbound = (a + 1) *10;
		return "Age[" + lowerbound + "," + upperbound + "]";
	}
	
	private static void initializeConnection() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        connSQL = DriverManager.getConnection(URL, DB_USER, DB_PWD);
    }
	
	public String perform (HttpServletRequest request, HttpServletResponse response) {
		List<String> errors = new ArrayList<String>();
        request.setAttribute("errors", errors);
        
        try {
            initializeConnection();
            List<NEWAllDataViewBean> list = new ArrayList<NEWAllDataViewBean>();
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            
            System.out.println("Connectiong to MySQL...");
            Statement stmt = null;
            try {
                initializeConnection();
                stmt = connSQL.createStatement();
                String sql = "SELECT * FROM " + TABLE_NAME;
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    NEWAllDataViewBean viewBean = new NEWAllDataViewBean();
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
                    viewBean.setAd_keywords("*");
                    //default
                    viewBean.setGender(rs.getString(10));
                    viewBean.setState(rs.getString(16));
                    viewBean.setEthnicity("XXX");
                    //generalizations
                    viewBean.setZip("XXXX");
                    viewBean.setDob(getAgeRange(rs.getString(7)));
                    
                    String s;  
                    StringBuffer sb = new StringBuffer(40); 
                    sb.append(viewBean.getInsurance_member_id());
                    sb.append(viewBean.getGrocery_member_id());
                    sb.append(viewBean.getPlan_number());
                    sb.append(viewBean.getAddress());
                    sb.append(viewBean.getCredit_card());
                    sb.append(viewBean.getCoupon_code());
                    sb.append(viewBean.getFirstname());
                    sb.append(viewBean.getLastname());
                    sb.append(viewBean.getSsn());
                    sb.append(viewBean.getId());
                    sb.append(viewBean.getCity());
                    sb.append(viewBean.getAd_keywords());
                    sb.append(viewBean.getGender());
                    sb.append(viewBean.getState());
                    sb.append(viewBean.getEthnicity());
                    sb.append(viewBean.getZip());
                    sb.append(viewBean.getDob());
                    s = sb.toString();
                    if(!map.containsKey(s)) {
                        map.put(s, 1);
                    } else {
                        map.put(s, map.get(s)+1);
                    }
                    list.add(viewBean);
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            int min = Integer.MAX_VALUE;
            Set<String> key = map.keySet();
            for (Object k : key) {
            	min = Math.min(min, map.get(k));
            }
            int max = Integer.MIN_VALUE;
            for (Object k : key) {
            	max = Math.max(max, map.get(k));
            }
            request.setAttribute("kamin", min);
            request.setAttribute("kamax", max);
            request.setAttribute("dataCount", 10000);
            
            // export csv file
            
            File result = File.createTempFile("result", ".csv");
            
            FileWriter fileWriter = new FileWriter(result);
			//Adding the header
    		fileWriter.append(HEADER);
    		fileWriter.append(LINE_SEPARATOR);
    		//Iterate the empList
    		Iterator<NEWAllDataViewBean> datalist = list.iterator();
    		while (datalist.hasNext()) {
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
    		System.out.println("csv file created");
    		fileWriter.flush();
			fileWriter.close();
			
			response.setContentType("text/csv");

	        // Make sure to show the download dialog
	        response.setHeader("Content-disposition","attachment; filename = result.csv");
	        
			OutputStream out = response.getOutputStream();
            FileInputStream in = new FileInputStream(result);
            byte[] buffer = new byte[4096];
            int length;
            while ((length = in.read(buffer)) > 0){
                out.write(buffer, 0, length);
            }
            in.close();
            out.flush();
            out.close();
        } catch (Exception e) {
            errors.add(e.getMessage());
            return "auditorReview.jsp";
    	}
		return "auditorReview.jsp";
	}
}
