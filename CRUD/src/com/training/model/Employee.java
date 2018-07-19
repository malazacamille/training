package com.training.model;

public class Employee {
	private int employeeId;
	private String Name;
	private String Address;
	private String Status;
	private Department Department;
	
	public Department getDepartment() {
		return Department;
	}
	public void setDepartment(Department department) {
		this.Department = department;
	}
		
	public Employee(){
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return  employeeId + "," + Name+","+ Address + "," + Status;
	}
	
}

