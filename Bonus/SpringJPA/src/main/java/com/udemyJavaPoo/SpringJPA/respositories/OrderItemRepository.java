package com.udemyJavaPoo.SpringJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyJavaPoo.SpringJPA.entities.OrderItem;
import com.udemyJavaPoo.SpringJPA.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK>{

}
