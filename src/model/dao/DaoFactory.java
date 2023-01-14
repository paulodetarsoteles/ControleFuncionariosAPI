package model.dao;

import model.entities.impl.SellerDaoJdbc;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJdbc(); 
	}
}
