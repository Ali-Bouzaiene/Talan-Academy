package com.vintudRest.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
	@Autowired
	private  UserRepository userRepository; 
	
	@PostMapping("users")
	public UserImpl addUser (@RequestBody UserImpl user){
		return userRepository.save(user);		
	}

	@GetMapping
    @ResponseBody
    public List<UserImpl> all() {
        return userRepository.findAll();
    }	
		
    @GetMapping("userId")
    @ResponseBody
    public Optional<UserImpl> getUser(@PathVariable long userId) {
    	  return userRepository.findById((long) 1);
    }

	 @DeleteMapping("users/{id}")
	    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId)
	          {
	        Optional<UserImpl> user = userRepository.findById(userId);
	      

	        userRepository.deleteById(userId);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	 }
}