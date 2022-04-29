package com.demo.jpa.mapstruct.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int userAge;
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User() {

	}

	public User(String firstName, String lastName, int userAge, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userAge = userAge;
		this.city = city;
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

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getUserAge() {
		return userAge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userAge=" + userAge
				+ ", city=" + city + "]";
	}

}
