package db.exercicios7.model.dao;

import java.util.List;

import db.exercicios7.model.entities.Department;

public interface DepartmentDao {
	void insert(Department dep);

	void update(Department dep);

	void deleteById(Integer id);

	Department findById(Integer id);

	List<Department> findAll();

}
