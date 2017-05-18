package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;


import databean.GrocerStoreBean;

public class GroceryStoreDAO extends GenericDAO<GrocerStoreBean>{
	public GroceryStoreDAO(String tableName, ConnectionPool connectionPool) throws DAOException {
		super(GrocerStoreBean.class, tableName, connectionPool);
	}
}
