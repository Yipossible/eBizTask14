package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class AuditorSelectDBForm extends FormBean{
	private String database;

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}
	
	public List<String> getValidationErrors() {
		 List<String> errors = new ArrayList<String>();
		 
		 if(database.length() == 0 || database == null) {
			 errors.add("Please choose a database.");
		 }
		 
		 return errors;
	}    
}
