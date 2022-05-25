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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
	@Autowired
	private  UserRepository userRepository; 	


	@GetMapping("/Users")
    @ResponseBody
    public List<UserImpl> getUsers() { 
        return userRepository.findAll();
    }	
		
    @GetMapping("/{userId}")
    @ResponseBody
    public Optional<UserImpl> getUser(@PathVariable long userId) {
    	  return userRepository.findById(userId);
    }
	 
	 @GetMapping("pseudo/{pseudo}")
	    @ResponseBody
	    public List<UserImpl> getUserbypseudo(@PathVariable(value = "pseudo") String pseudo) {
	    	  return userRepository.findbypseudo(pseudo);
	}	 
	 
	@PostMapping("/user")
	@ResponseBody
		public void addUser (@RequestBody UserImpl user){
			UserImpl user1 =new UserImpl("rfff", "rrrr", "hhhh", "ggggg", "dssss", "ttttttt", "frffff", 1);
			 userRepository.save(user1);		
		} 
/**	 @DeleteMapping	("user/{userId}")	 
		public void deleteUser (@RequestBody long userId){
		 Optional<UserImpl> user1 = userRepository.findById(userId);
			userRepository.delete(user1.get());		
		}  */
		@DeleteMapping("/user/user/{userId}")	   
	    public void getUsers(@PathVariable long userId) { 
	         userRepository.deleteById(userId);
	    }	
}