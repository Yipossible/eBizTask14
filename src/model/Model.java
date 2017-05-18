package model;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;

public class Model {
	private AllDataDAO allDataDAO;

	
    private boolean requireSSL;

    public Model(ServletConfig config) throws ServletException {
        requireSSL = new Boolean(config.getInitParameter("requireSSL"));
        try {
            String jdbcDriver = config.getInitParameter("jdbcDriverName");
            String jdbcURL    = config.getInitParameter("jdbcURL");
            
            ConnectionPool pool = new ConnectionPool(jdbcDriver, jdbcURL);
            allDataDAO  = new AllDataDAO("allData", pool);

           
        } catch (DAOException e) {
            throw new ServletException(e);
        }
    }
    




	public void setRequireSSL(boolean requireSSL) {
		this.requireSSL = requireSSL;
	}

	public boolean getRequireSSL() {
        return requireSSL;
    }
}