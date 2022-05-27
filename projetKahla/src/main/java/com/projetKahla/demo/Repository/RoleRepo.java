package com.projetKahla.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetKahla.demo.Entity.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
