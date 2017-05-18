package databean;

import org.genericdao.PrimaryKey;

@PrimaryKey("insurance_health_id")
public class InsuranceHealthBean {
	private String insurance_health_id;
	private String insurance_id; 
	private String disease_id;
	private String perscription_id;
	public String getInsurance_health_id() {
		return insurance_health_id;
	}
	public void setInsurance_health_id(String insurance_health_id) {
		this.insurance_health_id = insurance_health_id;
	}
	public String getInsurance_id() {
		return insurance_id;
	}
	public void setInsurance_id(String insurance_id) {
		this.insurance_id = insurance_id;
	}
	public String getDisease_id() {
		return disease_id;
	}
	public void setDisease_id(String disease_id) {
		this.disease_id = disease_id;
	}
	public String getPerscription_id() {
		return perscription_id;
	}
	public void setPerscription_id(String perscription_id) {
		this.perscription_id = perscription_id;
	}

	
}
