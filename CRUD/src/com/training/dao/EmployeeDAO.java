package com.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.training.model.Employee;

public class EmployeeDAO implements EmployeeDAO1{
	private static SqlSessionFactory sqlSessionFactory=null;
	
	public EmployeeDAO(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory=sqlSessionFactory;
	}
	
	@Override
	public ArrayList<Employee> getAllEmployeeRecords() {
		// TODO Auto-generated method stub
		ArrayList<Employee> EmployeeList=null;
		SqlSession session=sqlSessionFactory.openSession();
		try{
			EmployeeList=(ArrayList<Employee>) session.selectList("Employee.retrieveAllResults");
			//EmployeeList=session.selectList("Employee.selectAll");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			session.close();
		}
			/*System.out.println("selectAll() -->"+EmployeeList);*/
			return EmployeeList;
	}

	@Override
	public void insert(Employee employee) {
		SqlSession session=sqlSessionFactory.openSession();
		try{
			session.insert("Employee.insertEmployee", employee);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			session.commit();
			session.close();
		}
		System.out.println("Inserted");
		
	}

	@Override
	public void update(Employee employee) {
		SqlSession session=sqlSessionFactory.openSession();
		int result = 0;
		try{
			result = session.insert("Employee.updateEmployee", employee);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			if(result <= 0) {
				System.out.println("Update failed");
			}else {
				System.out.println("Updated");
			}
			session.commit();
			session.close();
		}
	
		
	}

	@Override
	public void delete(Employee employee) {
		SqlSession session=sqlSessionFactory.openSession();
		int result = 0;
		try{
			result = session.insert("Employee.deleteEmployee", employee);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			if(result <= 0) {
				System.out.println("Delete failed");
			}
			else {
				System.out.println("Deleted");
			}
			session.commit();
			session.close();
		}
		
		
	}

}
