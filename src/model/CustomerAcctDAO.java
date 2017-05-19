package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;

import databean.CustomerAcctBean;


public class CustomerAcctDAO extends GenericDAO<CustomerAcctBean>{
	public CustomerAcctDAO(String tableName, ConnectionPool connectionPool) throws DAOException {
		super(CustomerAcctBean.class, tableName, connectionPool);
	}
}
