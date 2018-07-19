package com.training.dao;

import java.util.List;

import com.training.model.Employee;

public interface EmployeeDAO1 {


	public abstract List<Employee> getAllEmployeeRecords();

	public abstract void insert(Employee employee);

	public abstract void update(Employee employee);

	public abstract void delete(Employee employee);

}