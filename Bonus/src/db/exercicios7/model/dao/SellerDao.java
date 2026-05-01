package db.exercicios7.model.dao;

import java.util.List;

import db.exercicios7.model.entities.Department;
import db.exercicios7.model.entities.Seller;

public interface SellerDao {
	void insert(Seller sel);

	void update(Seller sel);

	void deleteById(Integer id);

	Seller findById(Integer id);

	List<Seller> findAll();
	
	List<Seller> findByDepartment(Department department);
}
