package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;
import org.genericdao.RollbackException;

import databean.AuditorBean;


public class AuditorDAO extends GenericDAO<AuditorBean>{
	public AuditorDAO(String tableName, ConnectionPool connectionPool) throws DAOException {
		super(AuditorBean.class, tableName, connectionPool);
	}
	
	public AuditorBean[] getAuditor() throws RollbackException {
		AuditorBean[] auditors = match();
		return auditors;
	}
}
