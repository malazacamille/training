

import java.util.ArrayList;
import java.util.Scanner;

import com.training.dao.EmployeeDAO;
import com.training.model.Employee;
import com.training.utils.MyBatisConnectionFactory;

public class Process {
	static Scanner input = new Scanner(System.in);
	public void  CreateEmployee(){
		EmployeeDAO empCRUD= new EmployeeDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		Employee emp = new Employee();
		
		System.out.print("Input Name:");
		String name = input.nextLine();
		System.out.println();
		System.out.print("Input Address:");
		String address = input.nextLine();
		
		emp.setName(name);
		emp.setAddress(address);
		emp.setStatus("A");
		
		empCRUD.insert(emp);
		
		
	}
	public void retrieveEmployee() {
		EmployeeDAO empCRUD =new EmployeeDAO (MyBatisConnectionFactory.getSqlSessionFactory());
		ArrayList<Employee> EmployeeList=(ArrayList<Employee>) empCRUD .getAllEmployeeRecords();
		System.out.println("Employee ID     Name        Address        Status");
		for(int i=0; i<EmployeeList.size();i++) {
			String arr= EmployeeList.get(i).toString();
			String[] arrEmp = arr.split(",");
			System.out.println(arrEmp[0]+"             "+arrEmp[1]+"    "+arrEmp[2]+"        "+arrEmp[3]);
			
		
		}
	}
	public void updateEmployee(){
		EmployeeDAO empCRUD= new EmployeeDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		Employee emp = new Employee();
		
		System.out.println("Input Employee ID you want to update:");
		int id = input.nextInt();
		System.out.println("Update Name:");
		String name = input.next();
		System.out.println("Update Address:");
		String address = input.next();
		
		emp.setName(name);
		emp.setAddress(address);
		emp.setEmployeeId(id);
		
		empCRUD.update(emp);
		
		
	}
	public void deleteEmployee() {
		EmployeeDAO empCRUD= new EmployeeDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		Employee emp = new Employee();
		
		System.out.println("Input Employee ID you want to delete:");
		int id = input.nextInt();
		
		emp.setEmployeeId(id);
		emp.setStatus("D");
		
		empCRUD.delete(emp);
		
		
	}
}
