package com.training.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.training.bean.Employee;


public interface EmployeeMapper {

	
	public List<Employee> selectAll();
}
