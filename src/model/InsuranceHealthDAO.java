package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;

import databean.InsuranceHealthBean;

public class InsuranceHealthDAO extends GenericDAO<InsuranceHealthBean>{
	public InsuranceHealthDAO(String tableName, ConnectionPool connectionPool) throws DAOException {
		super(InsuranceHealthBean.class, tableName, connectionPool);
	}
}
