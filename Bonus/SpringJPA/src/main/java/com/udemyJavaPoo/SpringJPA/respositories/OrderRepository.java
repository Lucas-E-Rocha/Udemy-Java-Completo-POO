package com.udemyJavaPoo.SpringJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyJavaPoo.SpringJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
