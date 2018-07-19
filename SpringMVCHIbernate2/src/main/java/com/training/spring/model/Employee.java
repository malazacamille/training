package com.training.spring.model;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;


public class Employee {
	
	private String employeeId;
	private String employeeName;
	private String address;
	private String city;
	private String country;
	private String departmentId;
	private String status;
	
	public Employee() {
		
	}
	
	public Employee(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public Employee(String employeeId, String employeeName, String address, 
			String city, String country, String departmentId, String status) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.departmentId = departmentId;
		this.status = status;
	}
	
	public Employee(String employeeId, String employeeName, String address, 
			String city, String country, String departmentId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.departmentId = departmentId;
	}
	
	public Employee(String employeeName, String address, 
			String city, String country, String departmentId) {
		this.employeeName = employeeName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.departmentId = departmentId;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Employee " + employeeId + " - " + employeeName + " (" + departmentId + ")\n"
				+ "Address: " + address + ", " + city + ", " + country;
	}
}
