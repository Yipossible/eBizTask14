package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;
import org.genericdao.RollbackException;
import org.genericdao.Transaction;


import databean.AllDataBean;


public class AllDataDAO  extends GenericDAO<AllDataBean>{
	public AllDataDAO(String tableName, ConnectionPool connectionPool) throws DAOException {
		super(AllDataBean.class, tableName, connectionPool);
	}
	
	public void createDefaultData() throws RollbackException {
		try {
			Transaction.begin();
			String csvFile = "/home/ubuntu/all.csv";
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ";";

	        br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                AllDataBean alldata = new AllDataBean();
                String[] data = line.split(cvsSplitBy);
                alldata.setInsurance_member_id(data[0]);
                alldata.setGrocery_member_id(data[1]);
                alldata.setPlan_number(data[2]);
                alldata.setDob(data[3]);
                alldata.setAddress(data[4]);
                alldata.setCredit_card(data[5]);
                alldata.setAd_keywords(data[6]);
                alldata.setCoupon_code(data[7]);
                alldata.setFirstname(data[8]);
                alldata.setLastname(data[9]);
                alldata.setGender(data[10]);
                alldata.setEthnicity(data[11]);
                alldata.setSsn(data[12]);
                alldata.setZip(data[13]);
                alldata.setId(data[14]);
                alldata.setCity(data[15]);
                alldata.setState(data[16]);
                super.create(alldata);
            }
			br.close();
			Transaction.commit();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (Transaction.isActive()) Transaction.rollback();
		}	
	}
	
}
