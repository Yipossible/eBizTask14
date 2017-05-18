package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;


import databean.DiseaseBean;

public class DiseaseDAO extends GenericDAO<DiseaseBean>{
	public DiseaseDAO(String tableName, ConnectionPool connectionPool) throws DAOException {
		super(DiseaseBean.class, tableName, connectionPool);
	}
}
