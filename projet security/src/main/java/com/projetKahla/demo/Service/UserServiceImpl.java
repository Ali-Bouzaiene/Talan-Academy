package com.projetKahla.demo.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.projetKahla.demo.Entity.Role;
import com.projetKahla.demo.Entity.User;
import com.projetKahla.demo.Repository.RoleRepo;
import com.projetKahla.demo.Repository.UserRepo;
@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {
	
	private final  UserRepo userRepo;
	private final  RoleRepo roleRepo;
	private final PasswordEncoder passwordEncoder;
	

	public UserServiceImpl(UserRepo userRepo, RoleRepo roleRepo, PasswordEncoder passwordEncoder) {
		
		this.userRepo = userRepo;
		this.roleRepo = roleRepo;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public User saveUser(User user) {	
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {		
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		User user=userRepo.findByUsername(username);
		Role role=roleRepo.findByName(roleName);
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
	 @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        User user = userRepo.findByUsername(username);
	        if (user == null) {
	            throw new UsernameNotFoundException("User not found");
	        }
	        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
	        authorities.add(new SimpleGrantedAuthority(user.getName()));
	        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
	    }

}
