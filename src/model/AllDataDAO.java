package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;


public class AllDataDAO  extends GenericDAO<AllDataBean>{
	public AllDataDAO(String tableName, ConnectionPool connectionPool) throws DAOException {
		super(AllDataBean.class, tableName, connectionPool);
	}
}
