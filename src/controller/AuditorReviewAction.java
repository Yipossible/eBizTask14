package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybeans.form.FormBeanFactory;

import formbean.AuditorSelectDBForm;
import viewbean.NEWAllDataViewBean;

public class AuditorReviewAction extends Action {
	private FormBeanFactory<AuditorSelectDBForm> formBeanFactory = FormBeanFactory.getInstance(AuditorSelectDBForm.class);
	   //Initialize Mysql Connection
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_NAME = "test";
    private static final String TABLE_NAME = "alldata";
    private static final String URL = "jdbc:mysql://ec2-184-72-75-223.compute-1.amazonaws.com/" + DB_NAME + "?useSSL=false";
    private static final String DB_USER = "front";
    private static final String DB_PWD = "";
    private static Connection connSQL;
	
	public String getName() {
	    return "auditorReview.do";
	}
	
   private static void initializeConnection() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        connSQL = DriverManager.getConnection(URL, DB_USER, DB_PWD);
    }
	
	public String perform(HttpServletRequest request, HttpServletResponse response) {
		List<String> errors = new ArrayList<String>();
        request.setAttribute("errors", errors);
        System.out.println("enter Auditor Review perform action");

        try {
            initializeConnection();
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
		return "auditorReview.jsp";
	}

	public String getAgeRange(String s) {
		int age = 2017 - Integer.valueOf(s.substring(1,5));
		int a = age / 10; 
		int lowerbound = a * 10;
		int upperbound = (a+1) *10;
		return "Age[" + lowerbound + "," + upperbound + "]";
	}
	
	public List<NEWAllDataViewBean> ViewAllData() {
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
		System.out.println("Method data loaded");
		list.add(method);
		
		//show data before
		NEWAllDataViewBean data_before = new NEWAllDataViewBean();
		Statement stmt = null;
		try {
            initializeConnection();
            stmt = connSQL.createStatement();
            String sql = "SELECT * FROM " + TABLE_NAME + " LIMIT 2";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                data_before.setAd_keywords(rs.getString(2));
                data_before.setAddress(rs.getString(3));
                data_before.setCity(rs.getString(4));
                data_before.setCoupon_code(rs.getString(5));
                data_before.setCredit_card(rs.getString(6));
                data_before.setDob(rs.getString(7));
                data_before.setEthnicity(rs.getString(8));
                data_before.setFirstname(rs.getString(9));
                data_before.setGender(rs.getString(10));
                data_before.setGrocery_member_id(rs.getString(1));
                data_before.setId(rs.getString(11));
                data_before.setInsurance_member_id(rs.getString(12));
                data_before.setLastname(rs.getString(13));
                data_before.setPlan_number(rs.getString(14));
                data_before.setSsn(rs.getString(15));
                data_before.setState(rs.getString(16));
                data_before.setZip(rs.getString(17));
                System.out.println("raw data loaded");
                list.add(data_before);
                
                //show data after
                NEWAllDataViewBean data_after = new NEWAllDataViewBean();
                data_after.setAd_keywords("XXX");
                data_after.setAddress("XXX");
                data_after.setCity("XXX");
                data_after.setCoupon_code("XXX");
                data_after.setCredit_card("XXX");
                data_after.setDob(getAgeRange(rs.getString(7)));
                data_after.setEthnicity("XXX");
                data_after.setFirstname("XXX");
                data_after.setGender(rs.getString(10));
                data_after.setGrocery_member_id("XXX");
                data_after.setId("XXX");
                data_after.setInsurance_member_id("XXX");
                data_after.setLastname("XXX");
                data_after.setPlan_number("XXX");
                data_after.setSsn("XXX");
                data_after.setState(rs.getString(16));
                data_after.setZip("XXXXX");
                System.out.println("DI data loaded");
                list.add(data_after);
                
                //show code compliance
                NEWAllDataViewBean code = new NEWAllDataViewBean();
                code.setAd_keywords("HIPPA $ 164.514 (b)(2)");
                code.setAddress("HIPPA $ 164.514 (b)(2)");
                code.setCity("HIPPA $ 164.514 (b)(2)");
                code.setCoupon_code("HIPPA $ 164.514 (b)(2)");
                code.setCredit_card("HIPPA $ 164.514 (b)(2)");
                code.setDob("HIPPA $ 164.514 (b)(2), OECD Safe Harbor");
                code.setEthnicity("HIPPA $ 164.514 (b)(2)");
                code.setFirstname("HIPPA $ 164.514 (b)(2)");
                code.setGender("HIPPA $ 164.514 (b)(2)");
                code.setGrocery_member_id("HIPPA $ 164.514 (b)(2)");
                code.setId("HIPPA $ 164.514 (b)(2)");
                code.setInsurance_member_id("HIPPA $ 164.514 (b)(2)");
                code.setLastname("HIPPA $ 164.514 (b)(2)");
                code.setPlan_number("HIPPA $ 164.514 (b)(2)");
                code.setSsn("HIPPA $ 164.514 (b)(2)");
                code.setState("HIPPA $ 164.514 (b)(2)");
                code.setZip("HIPPA $ 164.514 (b)(2), OECD Safe Harbor");
                System.out.println("HIPPA $ 164.514 (b)(2)");
                list.add(code);
                return list;
            } else {
                System.out.println("no data available");
                return list;
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
		return list;
	}
}
