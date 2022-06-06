package com.projetKahla.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetKahla.demo.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);
	
}
