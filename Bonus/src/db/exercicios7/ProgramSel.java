package db.exercicios7;

import java.util.Date;
import java.util.List;

import db.exercicios7.model.dao.DaoFactory;
import db.exercicios7.model.dao.SellerDao;
import db.exercicios7.model.entities.Department;
import db.exercicios7.model.entities.Seller;

public class ProgramSel {
	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== Test 1 - Seller FindByID ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== Test 2 - Seller FindByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> listSellersByDep = sellerDao.findByDepartment(department);
		listSellersByDep.forEach(System.out::println);

		System.out.println("\n=== Test 3 - Seller FindAll ===");
		List<Seller> listSellersAll = sellerDao.findAll();
		listSellersAll.forEach(System.out::println);

		System.out.println("\n=== Test 4 - Seller Insert ===");
		Seller sellerInsert = new Seller(null, "Daves", "Daves@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(sellerInsert);
		System.out.println("Inserted! New id = " + sellerInsert.getId());
		
		System.out.println("\n=== Test 5 - Seller update ===");
		Seller sellerUpdate = sellerDao.findById(1);
		sellerUpdate.setName("Martha Waine");
		sellerDao.update(sellerUpdate);
		System.out.println("Updated!");
		
		System.out.println("\n=== Test 6 - Seller deleteById ===");
		sellerDao.deleteById(22);
		System.out.println("Deleted!");
	}
}
