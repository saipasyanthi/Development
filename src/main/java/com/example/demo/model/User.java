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
    private String emailid;
    private String role;
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
    
    public void setconfirmpassword(String confirmpassword) {
    	this.confirmpassword=confirmpassword;
    }
    @Column(name="password")
    public String getconfirmpassword() {
    	return confirmpassword;
    }
    
    public void setPhonenumber(int phonenumber) {
    	this.phonenumber=phonenumber;
    }
    @Column(name="phonenumber")
    public int getPhonenumber()
    {
    	return phonenumber;
    }
    public void setEmailid(String emailid)
    {
    	this.emailid=emailid;
    }
    @Column(name="emailid")
    public String getEmailid() {
    	return emailid;
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
 
    public User(Integer userId, String username, String password, String emailid, String role, int phonenumber ) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.emailid=emailid;
        this.role=role;
        this.phonenumber=phonenumber;
    }

}
