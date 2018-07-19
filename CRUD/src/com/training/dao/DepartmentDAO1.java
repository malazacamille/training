package com.training.dao;

import java.util.List;

import com.training.model.Department;

public interface DepartmentDAO1 {

	public abstract List<Department> getAllDepartmentRecords();

	public abstract void insert(Department Department);

	public abstract void update(Department Department);

	public abstract void delete(Department Department);

}