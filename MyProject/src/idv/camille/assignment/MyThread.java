package idv.camille.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread{
	final static List<Employee> employeeList = new ArrayList<Employee>();
	public void run(){
		for(int i=1; i<=10; i++){
		
		Employee emp = new Employee();
		emp.setFirstName("EmployeeFirstName"+i);
		emp.setLastName("EmployeeLastName"+i);
		emp.setAddress("EmployeeAddress" + i);
		emp.setAge(20+i);
		employeeList.add(emp);
		System.out.println("Created Employee: " + i);
		System.out.println(emp);
		}
		System.out.println(employeeList.toString());
}
}
