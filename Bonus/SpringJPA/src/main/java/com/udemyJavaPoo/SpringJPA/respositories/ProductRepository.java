package com.udemyJavaPoo.SpringJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyJavaPoo.SpringJPA.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
