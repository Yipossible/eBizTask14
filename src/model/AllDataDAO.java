package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;

import databean.AllDataBean;


public class AllDataDAO  extends GenericDAO<AllDataBean>{
	public AllDataDAO(String tableName, ConnectionPool connectionPool) throws DAOException {
		super(AllDataBean.class, tableName, connectionPool);
	}
}
