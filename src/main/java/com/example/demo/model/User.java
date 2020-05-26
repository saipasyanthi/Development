package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "emp")
public class User {
	
	private Integer userId;
	private String username;
    private String password;
    private Double phoneno;
    private String email;
    private String role;
    private String newpassword;
    private String confirmpassword;
    
    
    
    @Id
    @Column(name="user_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
		this.userId = userId;
	}
    
    public void setUsername(String username) {
    	this.username=username;
    }

    @Column(name="username")
    public String getUsername() 
    {
    	return username;
    }
        
    public void setPassword(String password) {
    	this.password=password;
    } 
    @Column(name="password")
    public String getPassword() {
    	return password;
    }
    public void setnewpassword(String newpassword) {
    	this.newpassword=newpassword;
    } 
    @Column(name="newpassword")
    public String getnewpassword() {
    	return newpassword;
    }
      
    public void setconfirmpassword(String confirmpassword) {
    	this.confirmpassword=confirmpassword;
    } 
    @Column(name="confirmpassword")
    public String getconfirmpassword() {
    	return confirmpassword;
    }
      
       
    public void setphoneno(Double phoneno) {
    	this.phoneno=phoneno;
    }
    @Column(name="phoneno")
    public Double getphoneno()
    {
    	return phoneno;
    }
    public void setEmailid(String email)
    {
    	this.email=email;
    }
    @Column(name="email")
    public String getEmailid() {
    	return email;
    }
    public void setRole(String role) {
    	this.role=role;
    }
    @Column(name="role")
    public String getRole() {
    	return role;
    }
    
    public User() {
    }
 
    public User(Integer userId, String username, String password,String newpassword,String confirmpassword, String email, String role, Double phoneno ) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email=email;
        this.role=role;
        this.phoneno=phoneno;
        this.confirmpassword= confirmpassword;
        this.newpassword=newpassword;
    }

}
