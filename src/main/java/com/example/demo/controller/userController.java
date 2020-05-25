package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
import com.example.demo.repository.userRepository;
import com.example.demo.service.UserDetailServiceImpl;


@RestController
@RequestMapping("/health")
@Validated
@CrossOrigin
public class userController {

	@Autowired
    private UserDetailServiceImpl userService;
	
	
	  @GetMapping("/getlist") 
	  public List<User> getUsers() 
	  { 
		  return 	 userService.listAll();
	  }
	  	  
	  @PostMapping("/createUser") 
	  public void add(@RequestBody User user)
	  {
		   userService.save(user);
	  }
		/*
		 * @GetMapping("/login/{id}") public Optional<User> getUserById(@PathVariable
		 * Long id ) { return userService.getUserById(id); }
		 */
		/*
		 * @GetMapping("/user/{id}") User getEmployeeById(@PathVariable
		 * 
		 * @Min(value = 1, message = "id must be greater than or equal to 1")
		 * 
		 * @Max(value = 1000, message = "id must be lower than or equal to 1000") Long
		 * id) { return userDao.findById(id).orElseThrow(() -> new
		 * RecordNotFoundException("Employee id '" + id + "' does no exist")); }
		 * 
		 * @PutMapping("/employees/{id}") User updateEmployee(@RequestBody User
		 * user, @PathVariable Long id) {
		 * 
		 * return userDao.findById(id).map(user -> {
		 * user.setFirstName(newEmployee.getFirstName());
		 * user.setLastName(newEmployee.getLastName());
		 * user.setEmail(newEmployee.getEmail()); return repository.save(user);
		 * }).orElseGet(() -> { newEmployee.setId(id); return
		 * repository.save(newEmployee); }); }
		 * 
		 * @DeleteMapping("/user/{id}") void deleteEmployee(@PathVariable Long id) {
		 * userDao.deleteById(id); }
		 */

}
