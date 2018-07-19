package com.training.model;

public class Department {
	private int departmentId;
	private String department;
	private int employeeId;
	public int getDepartmentId() {
		return departmentId;
	}
	public Department(int departmentId, String department, int employeeId) {
		super();
		this.departmentId = departmentId;
		this.department = department;
		this.employeeId = employeeId;
	}
	public Department(){
		
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return  + departmentId + ","
				+ department + "," + employeeId;
	}
	
}
