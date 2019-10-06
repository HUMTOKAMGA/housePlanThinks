package com.hpt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hpt.model.UserMo;
import com.hpt.service.UserService;

@RestController
public class UserCtrl {

	@Autowired
	private UserService userService;
	
	/**
	 * function get all users
	 * @return all users
	 */
	@RequestMapping("/hpt/users")
	public List<UserMo> getAllUsers(){
		return userService.getAllUsers();
	}
	
	/**
	 * function get a user using an Id
	 * @param userId
	 * @return one user
	 */
	@RequestMapping("/hpt/users/{userId}")
	public Optional<UserMo> getUser(@PathVariable int userId){
		return userService.getUser(userId);
	}
	
	/**
	 * function add a user
	 * @param userMo
	 */
	@RequestMapping(method = RequestMethod.POST, value="/hpt/users")
	public void addUser(@RequestBody UserMo userMo){
		userService.addUser(userMo);
	}
	
	/**
	 * function update a user using an  Id
	 * @param userMo
	 * @param userId
	 */
	@RequestMapping(method = RequestMethod.PUT, value="/hpt/users/{userId}")
	public void updateUser(@RequestBody UserMo userMo, @PathVariable int userId){
		userService.updateUser(userId, userMo);
	}
	
	/**
	 * function delete a user
	 * @param userId
	 */
	@RequestMapping(method = RequestMethod.DELETE, value="/hpt/users/{userId}")
	public void deleteUser(@PathVariable int userId){
		userService.deleteUser(userId);
	}
}
