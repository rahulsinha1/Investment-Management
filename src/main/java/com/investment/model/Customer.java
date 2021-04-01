package com.investment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="customer")
public class Customer {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",unique=true)
	private int id;
	@Column(name="user_name",unique=true)
	String userName;
	@Column(name="user_password",unique=false)
	String userPassword;
	@Column(name="email",unique=true)
	String email;
	@Column(name="address",unique=false)
	String address;
	@Column(name="phone",unique=true)
	int phone;
	@Column(name="token")
	String token;
	@Column(name="first_name",unique=false)
	String firstName;
	@Column(name="last_name",unique=false)
	String lastName;
	public Customer() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getToken() {
		return token;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public void setName(String name) {
		this.userName = name;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setToken(String token) {
		this.token = token;
		
	}
}
