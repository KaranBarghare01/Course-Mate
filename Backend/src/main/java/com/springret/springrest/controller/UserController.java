package com.springret.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springret.springrest.entities.User;
import com.springret.springrest.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public List<User> getAllUsers(){
		
		return this.userService.getAllUsers();
	}
	
	@GetMapping("/{userName}")
	public User getSingleUser(@PathVariable("userName") String username) {
		
		return this.userService.getUser(username);
	}
	
	
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
	
		return this.userService.addUser(user);
	}
}
