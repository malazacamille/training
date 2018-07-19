package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.bean.Employee;
import com.training.bean.EmployeeDepartment;
import com.training.mapper.EmployeeMapper;

	
@Service
public class EmployeeDAOImpl  {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	
	public List<Employee> selectAll() {
		List<Employee> employeeList = employeeMapper.selectAll();
		
		return employeeList;
	}

	/*public Employee selectById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> selectByDepartment(String departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int employeeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deactivate(int employeeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int activate(int employeeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<EmployeeDepartment> selectByDepartmentDetailed(String departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmployeeDepartment> selectByIdWithDept(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmployeeDepartment> selectAllWithDept() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
