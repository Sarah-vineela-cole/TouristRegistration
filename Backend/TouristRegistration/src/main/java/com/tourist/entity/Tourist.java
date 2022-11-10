package com.tourist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tourist")
public class Tourist {

	
	@Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
	private int  id;
	private String  firstname;
	private String lastname;
	private String gender;
	private int age;
	private String fromplace;
	private int numberofdays;
	
	public Tourist(int id, String firstname, String lastname, String gender, int age, String fromplace,int numberofdays) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
		this.fromplace = fromplace;
		this.numberofdays = numberofdays;
	}
public Tourist() {
	
}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFromplace() {
		return fromplace;
	}

	public void setFromplace(String fromplace) {
		this.fromplace = fromplace;
	}

	public int getNumberofdays() {
		return numberofdays;
	}

	public void setNumberofdays(int numberofdays) {
		this.numberofdays = numberofdays;
	}
}

	