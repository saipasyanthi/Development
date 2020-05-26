package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.User;
import com.example.demo.repository.userRepository;
import com.example.demo.service.UserDetailServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	UserDetailServiceImpl UserService;
	
	@MockBean
	userRepository repo; 

	@Test
	public void saveuserTest() {
		
		User user=new User(1,"ANU","SRI", "SR", "AA", "Sri", "Sri", (double) 121212);
	    when(repo.save(user)).thenReturn(user);
	// when(user.getPhonenumber()>25).thenReturn(false);
	// System.out.println("model"+user); 
	//System.out.println("service"+UserService.save(user)); 
	 assertEquals(user,UserService.save(user));
	// verify(UserService).save(user);
	 //controller validations
	 //
	 
	 //junit lo parametrs validate return 
	 
	}

}
