package com.projetKahla.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetKahla.demo.Entity.Role;
import com.projetKahla.demo.Entity.User;
import com.projetKahla.demo.Repository.RoleRepo;
import com.projetKahla.demo.Repository.UserRepo;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RoleRepo roleRepo;

	@Override
	public User saveUser(User user) {		
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {		
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String username, String rolename) {
		User user=userRepo.findByUsername(username);
		Role role=roleRepo.findByName(rolename);
		user.getRoles().add(role);
	}

	@Override
	public User getUser(String username) {		
		return userRepo.findByUsername(username);
	}

	@Override
	public List<User> getUsers() {		
		return userRepo.findAll();
	}

}
