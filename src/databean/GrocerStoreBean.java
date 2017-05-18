package databean;

import org.genericdao.PrimaryKey;

@PrimaryKey("grocery_id")
public class GrocerStoreBean {
	private String grocery_id; 
	private String grocery_member_id; 
	private String firstname;
	private String lastname;
	private String gender;
	private String dob; 
	private String address; 
	private String credit_card;
	private String ad_keywords; 
	private String coupon_code; 
	private String ssn; 
	private String ethnicity;
	private String zip; 
	private String city; 
	private String state;
	public String getGrocery_id() {
		return grocery_id;
	}
	public void setGrocery_id(String grocery_id) {
		this.grocery_id = grocery_id;
	}
	public String getGrocery_member_id() {
		return grocery_member_id;
	}
	public void setGrocery_member_id(String grocery_member_id) {
		this.grocery_member_id = grocery_member_id;
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
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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

	
}
