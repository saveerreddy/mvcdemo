package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int personId;	
 private String Firstname;
 private String Lastname;
 private String Email;
 private String phone;
 
 public int getPersonId()
 {
		return personId;
 }
 public void setPersonId(int personId)
 {
		this.personId = personId;
 }
 
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
 
 
}
