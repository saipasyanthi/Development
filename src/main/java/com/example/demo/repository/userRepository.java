package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;


  @Repository
  public interface userRepository extends JpaRepository<User,Long> {

	  
	 
  
		/*
		 * @Query("SELECT u FROM User u WHERE u.emailid = ?1") User
		 * findUserByEmail(String email);
		 */
  }
 

