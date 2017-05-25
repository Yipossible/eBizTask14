package model;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;

public class Model {
	private AllDataDAO allDataDAO;
	private DiseaseDAO diseaseDAO;
	private GroceryStoreDAO groceryStoreDAO;
	private InsuranceCompanyDAO insuranceCompanyDAO;
	private InsuranceHealthDAO insuranceHealthDAO;
	private AuditorDAO auditorDAO;
	private CustomerAcctDAO customerAcctDAO;

	
    private boolean requireSSL;

    public Model(ServletConfig config) throws ServletException {
        requireSSL = new Boolean(config.getInitParameter("requireSSL"));
        try {
            String jdbcDriver = config.getInitParameter("jdbcDriverName");
            String jdbcURL    = config.getInitParameter("jdbcURL");
            
            ConnectionPool pool = new ConnectionPool(jdbcDriver, jdbcURL);
            allDataDAO  = new AllDataDAO("allData", pool);
            try {
				if(allDataDAO.getCount() == 0) {
					System.out.println("No data in SQL");
					allDataDAO.createDefaultData();
					System.out.println("All Data created");
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException();
			}
            
            diseaseDAO = new DiseaseDAO("disease_id", pool);
            groceryStoreDAO = new GroceryStoreDAO("grocery_store", pool);
            insuranceCompanyDAO = new InsuranceCompanyDAO("insurance_company", pool);
            insuranceHealthDAO = new InsuranceHealthDAO("insurance_health", pool);
            auditorDAO = new AuditorDAO("auditor", pool);
       
        } catch (DAOException e) {
            throw new ServletException(e);
        }
    }

	public CustomerAcctDAO getCustomerAcctDAO() {
		return customerAcctDAO;
	}

	public void setCustomerAcctDAO(CustomerAcctDAO customerAcctDAO) {
		this.customerAcctDAO = customerAcctDAO;
	}

	public AllDataDAO getAllDataDAO() {
		return allDataDAO;
	}

	public void setAllDataDAO(AllDataDAO allDataDAO) {
		this.allDataDAO = allDataDAO;
	}

	public DiseaseDAO getDiseaseDAO() {
		return diseaseDAO;
	}
	
	public void setDiseaseDAO(DiseaseDAO diseaseDAO) {
		this.diseaseDAO = diseaseDAO;
	}

	public GroceryStoreDAO getGroceryStoreDAO() {
		return groceryStoreDAO;
	}

	public void setGroceryStoreDAO(GroceryStoreDAO groceryStoreDAO) {
		this.groceryStoreDAO = groceryStoreDAO;
	}

	public InsuranceCompanyDAO getInsuranceCompanyDAO() {
		return insuranceCompanyDAO;
	}

	public void setInsuranceCompanyDAO(InsuranceCompanyDAO insuranceCompanyDAO) {
		this.insuranceCompanyDAO = insuranceCompanyDAO;
	}

	public InsuranceHealthDAO getInsuranceHealthDAO() {
		return insuranceHealthDAO;
	}

	public void setInsuranceHealthDAO(InsuranceHealthDAO insuranceHealthDAO) {
		this.insuranceHealthDAO = insuranceHealthDAO;
	}

	
	public AuditorDAO getAuditorDAO() {
		return auditorDAO;
	}

	public void setAuditorDAO(AuditorDAO auditorDAO) {
		this.auditorDAO = auditorDAO;
	}

	public void setRequireSSL(boolean requireSSL) {
		this.requireSSL = requireSSL;
	}

	public boolean getRequireSSL() {
        return requireSSL;
    }
}