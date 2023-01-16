package model.dao;

import db.DB;

import model.entities.impl.SellerDaoJdbc;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJdbc(DB.getConnection()); 
	}
}
