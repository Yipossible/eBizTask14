package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class CustomerRegisterForm extends FormBean {
	private String fname;
	private String lname;
	private String birth_month;
	private String birth_day;
	private String birth_year;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String phone_number;
	private String email;
	private boolean isEntrolled;
	private String password;
	private String confirm_password;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getBirth_month() {
		return birth_month;
	}
	public void setBirth_month(String birth_month) {
		this.birth_month = birth_month;
	}
	public String getBirth_day() {
		return birth_day;
	}
	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}
	public String getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEntrolled() {
		return isEntrolled;
	}
	public void setEntrolled(boolean isEntrolled) {
		this.isEntrolled = isEntrolled;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	
	 public List<String> getValidationErrors() {
		 List<String> errors = new ArrayList<String>();
	    
		 if (fname == null || fname.length() == 0) {errors.add("First name is required.");}
		 if (lname == null || lname.length() == 0) {errors.add("Last name is required.");}
		 if (birth_month == null || birth_month.length() == 0) {errors.add("Birth month is required.");}
		 if (birth_day == null || birth_day.length() == 0) {errors.add("Birth date is required.");}
		 if (birth_year == null || birth_year.length() == 0) {errors.add("Birth year is required.");}
		 if (address1 == null || address1.length() == 0) {errors.add("Street address is required.");}
		 if (city == null || city.length() == 0) {errors.add("City info is required.");}
		 if (state == null || state.length() == 0) {errors.add("State info is required.");}
		 if (zip == null || zip.length() == 0) {errors.add("Zip code is required.");}
		 if (phone_number == null || phone_number.length() == 0) {errors.add("Phone number is required.");}
		 if (email == null || email.length() == 0) {errors.add("Email is required.");}
		 if (password == null || password.length() == 0) {errors.add("Please enter your password");}
		 if (confirm_password == null || confirm_password.length() == 0) {errors.add("Please confirm your password");}
		 
		 if (!password.equals(confirm_password)) {errors.add("Passwords don't match");}
		 return errors;
	 }
}
