package com.training.spring.web.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Employee {

	   @NotEmpty(message="Enter first name.")
	   private String firstName;

	   @NotEmpty(message="Enter last name.")
	   private String lastName;

	   @Email(message="Enter a valid email.")
	   private String email;

	   @NotEmpty(message="Enter your designation.")
	   private String designation;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", designation="
				+ designation + "]";
	}

	   
	}