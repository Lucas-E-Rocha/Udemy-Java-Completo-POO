package com.udemyJavaPoo.SpringJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyJavaPoo.SpringJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
