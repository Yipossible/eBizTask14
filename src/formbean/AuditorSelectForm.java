package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class AuditorSelectForm extends FormBean{

	private String insurance_member_id;
	private String grocery_member_id;
	private String plan_number;
	private String dob;
	private String address;
	private String credit_card;
	private String ad_keywords;
	private String coupon_code;
	private String firstname;
	private String lastname;
	private String gender;
	private String ethnicity;
	private String ssn;
	private String zip;
	private String id;
	private String city;
	private String state;
	
	public String getInsurance_member_id() {
		return insurance_member_id;
	}
	public void setInsurance_member_id(String insurance_member_id) {
		this.insurance_member_id = insurance_member_id;
	}
	public String getGrocery_member_id() {
		return grocery_member_id;
	}
	public void setGrocery_member_id(String grocery_member_id) {
		this.grocery_member_id = grocery_member_id;
	}
	public String getPlan_number() {
		return plan_number;
	}
	public void setPlan_number(String plan_number) {
		this.plan_number = plan_number;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCredit_card() {
		return credit_card;
	}
	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}
	public String getAd_keywords() {
		return ad_keywords;
	}
	public void setAd_keywords(String ad_keywords) {
		this.ad_keywords = ad_keywords;
	}
	public String getCoupon_code() {
		return coupon_code;
	}
	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	 public List<String> getValidationErrors() {
		 List<String> errors = new ArrayList<String>();
	    
		 if (insurance_member_id == null || insurance_member_id.length() == 0) {errors.add("First name is required.");}
		 if (grocery_member_id == null || grocery_member_id.length() == 0) {errors.add("First name is required.");}
		 if (plan_number == null || plan_number.length() == 0) {errors.add("First name is required.");}
		 if (dob == null || dob.length() == 0) {errors.add("First name is required.");}
		 if (credit_card == null || credit_card.length() == 0) {errors.add("First name is required.");}
		 if (ad_keywords == null || ad_keywords.length() == 0) {errors.add("First name is required.");}
		 if (coupon_code == null || coupon_code.length() == 0) {errors.add("First name is required.");}
		 if (firstname == null || firstname.length() == 0) {errors.add("First name is required.");}
		 if (lastname == null || lastname.length() == 0) {errors.add("First name is required.");}
		 if (address == null || address.length() == 0) {errors.add("Street address is required.");}
		 if (city == null || city.length() == 0) {errors.add("City info is required.");}
		 if (state == null || state.length() == 0) {errors.add("State info is required.");}
		 if (zip == null || zip.length() == 0) {errors.add("Zip code is required.");}
		 if (id == null || id.length() == 0) {errors.add("Zip code is required.");}
		 if (gender == null || gender.length() == 0) {errors.add("Zip code is required.");}
		 if (ethnicity == null || ethnicity.length() == 0) {errors.add("Zip code is required.");}
		 if (ssn == null || ssn.length() == 0) {errors.add("Zip code is required.");}
		 
		 
		 return errors;
	 }

}
