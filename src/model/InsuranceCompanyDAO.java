package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;

import databean.InsuranceCompanyBean;

public class InsuranceCompanyDAO extends GenericDAO<InsuranceCompanyBean>{
	public InsuranceCompanyDAO(String tableName, ConnectionPool connectionPool) throws DAOException {
		super(InsuranceCompanyBean.class, tableName, connectionPool);
	}
}
