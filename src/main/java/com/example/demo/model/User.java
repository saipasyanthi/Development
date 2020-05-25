package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	
	private Integer userId;
	private String username;
    private String password;
    private int phonenumber;
    private String emailId;
    private String role;
   // private String confirmpassword;
    
    
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
       
    public void setPhonenumber(int phonenumber) {
    	this.phonenumber=phonenumber;
    }
    @Column(name="phonenumber")
    public int getPhonenumber()
    {
    	return phonenumber;
    }
    public void setEmailid(String emailId)
    {
    	this.emailId=emailId;
    }
    @Column(name="emailid")
    public String getEmailid() {
    	return emailId;
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
 
    public User(Integer userId, String username, String password, String emailId, String role, int phonenumber ) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.emailId=emailId;
        this.role=role;
        this.phonenumber=phonenumber;
    }

}
