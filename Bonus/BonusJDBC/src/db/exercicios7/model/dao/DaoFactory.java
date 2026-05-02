package db.exercicios7.model.dao;

import db.DB;
import db.exercicios7.model.dao.impl.DepartmentDaoJDBC;
import db.exercicios7.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
