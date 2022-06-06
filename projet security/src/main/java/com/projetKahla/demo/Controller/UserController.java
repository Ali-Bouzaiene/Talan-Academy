package com.projetKahla.demo.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.projetKahla.demo.Entity.Role;
import com.projetKahla.demo.Entity.User;
import com.projetKahla.demo.Service.UserService;



@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(){
		return ResponseEntity.ok().body(userService.getUsers());
	}
	@PostMapping ("/user/save")
	public ResponseEntity<User> saveUser(@RequestBody User user){	
		URI uri= URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
		return ResponseEntity.created(uri).body(userService.saveUser(user));		
	}
	
	@PostMapping("/Role/save")
	public ResponseEntity<Role> saveRole(@RequestBody Role role){
		URI uri= URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
		return ResponseEntity.created(uri).body(userService.saveRole(role));		
	}
	
	@PostMapping ("/role/addtouser")
	public ResponseEntity<?> addRoleToUser (@RequestBody RoleToUserForm form){
		userService.addRoleToUser(form.getUsername(), form.getRolename());
		return ResponseEntity.ok().build();
		
	}
}
   
    class RoleToUserForm{
    	private String username;
    	private String rolename;
    	
    	
		public RoleToUserForm(String username, String rolename) {
			
			this.username = username;
			this.rolename = rolename;
		}
		
		
		public RoleToUserForm() {
			
		}


		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getRolename() {
			return rolename;
		}
		public void setRolename(String rolename) {
			this.rolename = rolename;
		}
    	
    	
    	
    }