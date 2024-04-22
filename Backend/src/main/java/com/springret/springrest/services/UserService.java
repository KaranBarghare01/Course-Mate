package com.springret.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springret.springrest.entities.User;

@Service
public class UserService {

	List<User> userList = new ArrayList<>();
	
	public UserService() {
		userList.add(new User("abc","abc","abc@gmail.com"));
		userList.add(new User("xyz","xyz","xyz@gmail.com"));
	}
	
	public List<User> getAllUsers(){
		
		return this.userList;
	}
	
	public User getUser(String username) {
		
		return this.userList.stream()
				.filter((user)->user.getUserName().equals(username))
				.findAny()
				.orElse(null);
	}
	
	public User addUser(User user) {
		
		this.userList.add(user);
		return user;
	}
}
