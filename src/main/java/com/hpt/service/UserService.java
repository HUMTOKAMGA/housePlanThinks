package com.hpt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpt.model.UserMo;
import com.hpt.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	// Get All users
	public List<UserMo> getAllUsers(){
		List<UserMo> userMo = new ArrayList<>();
		userRepo.findAll()
		.forEach(userMo::add);
		return userMo;
	}
	
	// Get user by id
	public Optional<UserMo> getUser(int userId){
		return userRepo.findById(userId);
	}
	
	// Add user
	public void addUser(UserMo userMo) {
		userRepo.save(userMo);
	}
	
	// Update article
	public void updateUser(int userId, UserMo userMo) {
		userRepo.save(userMo);
	}
	
	//Delete article by userId
	public void deleteUser(int userId) {
		userRepo.deleteById(userId);
	}
}
