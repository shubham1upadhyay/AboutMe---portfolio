package com.example.demoPortfolio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="message")
public class Visitors {

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	     
	    @Column(nullable = false, unique = true, length = 45)
	    private String email;
	     
	    @Column(nullable = false, length = 64)
	    private String name;
	     
	    @Column(name = "subject", nullable = false, length = 200)
	    private String subject;
	     
	    @Column(name = "message", nullable = false, length = 1000)
	    private String message;
	    
	    //SETTERS
	    
	    public void setName(String name)
	    {
	    	this.name = name;
	    }
	    public void setEmail(String email)
	    {
	    	this.email = email;
	    }
	    public void setSubject(String subject)
	    {
	    	this.subject = subject;
	    }
	    public void setMessage(String message)
	    {
	    	this.message = message;
	    }
	    
	    //GETTERS
	    
	    public String getName(String name)
	    {
	    	return name;
	    }
	    public String getEmail(String email)
	    {
	    	return email;
	    }
	    public String getSubject(String subject)
	    {
	    	return subject;
	    }
	    public String getMessage(String message)
	    {
	    	return message;
	    }
	    
}
