package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "last_name")
	private String lastname;
	
	@Column(name = "email_id")
	private String email_id;
	
	public User() {
		
	}
	
	public User(String firstname, String lastname, String email_id) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.email_id = email_id;
}
	public long getID() {
		return id;
	}
	
	public void setID(long id) {
		
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	
	public void setEmail(String email) {
	this.email_id = email;	
	}
	
	public String getEmail() {
		return email_id;
	}
}