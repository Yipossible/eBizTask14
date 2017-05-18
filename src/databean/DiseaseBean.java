package databean;

import org.genericdao.PrimaryKey;

@PrimaryKey("disease_id")
public class DiseaseBean {
	
	private String disease_id;
	private String disease_name;
	
	public String getDisease_id() {
		return disease_id;
	}
	public void setDisease_id(String disease_id) {
		this.disease_id = disease_id;
	}
	public String getDisease_name() {
		return disease_name;
	}
	public void setDisease_name(String disease_name) {
		this.disease_name = disease_name;
	}
	
	

}
