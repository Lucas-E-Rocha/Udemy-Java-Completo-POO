package db.exercicios7.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import db.exercicios7.model.dao.SellerDao;
import db.exercicios7.model.entities.Department;
import db.exercicios7.model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

	private Connection conn;

	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Seller sel) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO SELLER"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES"
					+ "(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, sel.getName());
			st.setString(2, sel.getEmail());
			st.setDate(3, new java.sql.Date(sel.getBirthDate().getTime()));
			st.setDouble(4, sel.getBaseSalary());
			st.setInt(5, sel.getDepartment().getId());
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					sel.setId(id);
				}
				DB.closeResultSet(rs);
			} else throw new DbException("Unexpected error! No rows affected!");

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void update(Seller sel) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
					+ "WHERE id = ?");

			st.setString(1, sel.getName());
			st.setString(2, sel.getEmail());
			st.setDate(3, new java.sql.Date(sel.getBirthDate().getTime()));
			st.setDouble(4, sel.getBaseSalary());
			st.setInt(5, sel.getDepartment().getId());
			
			st.setInt(6, sel.getId());
			
			st.executeUpdate();

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"DELETE FROM seller "
					+ "WHERE id = ?");

			st.setInt(1, id);

			st.executeUpdate();

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"Select seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentID = department.Id "
					+ "WHERE seller.Id = ?");

			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Department dep = instantiateDepartment(rs);

				Seller seller = instantiateSeller(dep,rs);

				return seller;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

	}

	private Seller instantiateSeller(Department dep, ResultSet rs) throws SQLException {
		Seller seller = new Seller();
		seller.setId(rs.getInt(1));
		seller.setName(rs.getString(2));
		seller.setEmail(rs.getString(3));
		seller.setBirthDate(rs.getDate(4));
		seller.setBaseSalary(rs.getDouble(5));
		seller.setDepartment(dep);
		return seller;
	}

	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt(6));
		dep.setName(rs.getString(7));
		return dep;
	}

	@Override
	public List<Seller> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"Select seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentID = department.Id "
					+ "ORDER by Name");

			rs = st.executeQuery();
			
			Map<Integer, Department> map = new HashMap<>();
			
			List<Seller> listSeller = new ArrayList<>();
			while(rs.next()) {
				
				Department dep = map.get(rs.getInt("DepartmentId"));
				
				if(dep == null) {
					dep = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}
				
				Seller seller = instantiateSeller(dep,rs);
				listSeller.add(seller);
			}
				return listSeller;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Seller> findByDepartment(Department department) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"Select seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentID = department.Id "
					+ "WHERE Department.Id = ? "
					+ "ORDER by Name");

			st.setInt(1, department.getId());
			rs = st.executeQuery();
			
			Map<Integer, Department> map = new HashMap<>();
			
			List<Seller> listSeller = new ArrayList<>();
			while(rs.next()) {
				
				Department dep = map.get(rs.getInt("DepartmentId"));
				
				if(dep == null) {
					dep = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}
				
				Seller seller = instantiateSeller(dep,rs);
				listSeller.add(seller);
			}
				return listSeller;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

}
