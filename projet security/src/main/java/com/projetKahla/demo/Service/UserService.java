package com.projetKahla.demo.Service;

import java.util.List;

import com.projetKahla.demo.Entity.Role;
import com.projetKahla.demo.Entity.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username,String roleName);
	User getUser(String username);
	List<User> getUsers();
}
