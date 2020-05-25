package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.userRepository;

@Service
public class UserDetailServiceImpl {
	
	@Autowired
	private userRepository userDao;
	
	  public List<User> listAll() { return userDao.findAll(); }
	  
	  public User save(User user) {
		  
		return userDao.save(user);			
	  
	  }
		/*
		 * public Optional<User> getUserById(Long id) { return userDao.findById(id); }
		 */
	  


}
