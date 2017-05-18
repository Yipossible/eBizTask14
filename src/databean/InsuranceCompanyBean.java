package databean;

import org.genericdao.PrimaryKey;

@PrimaryKey("insurance_id")
public class InsuranceCompanyBean {

	private String insurance_id;
	private String insurance_member_id; 
	private String plan_number;
	private String firstname;
	private String lastname;
	private String gender;
	private String dob;
	private String address;
	private String zip;
	private String ethnicity;
	private String ssn;
	private String city; 
	private String state;
	public String getInsurance_id() {
		return insurance_id;
	}
	public void setInsurance_id(String insurance_id) {
		this.insurance_id = insurance_id;
	}
	public String getInsurance_member_id() {
		return insurance_member_id;
	}
	public void setInsurance_member_id(String insurance_member_id) {
		this.insurance_member_id = insurance_member_id;
	}
	public String getPlan_number() {
		return plan_number;
	}
	public void setPlan_number(String plan_number) {
		this.plan_number = plan_number;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
