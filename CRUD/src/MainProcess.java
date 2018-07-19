/*
import java.util.Scanner;



public class MainProcess {
	public static void main (String args[]) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		do{
		System.ouat.println("Choose Letter:");
		System.out.println("C - Create New Employee");
		System.out.println("R - Retrive All Employee");
		System.out.println("U - Update Employee");
		System.out.println("D - Delete Employee");
		System.out.println("S - Stop the Process");
		System.out.println("**************************************************");
		String process = input.nextLine();
		
		Process process1 = new Process();
		
		switch(process) {
		case "C" :
		case "c" :
			process1.CreateEmployee();
			break;
		case "R" :
		case "r" :
			process1.retrieveEmployee();
			break;
		case "U" :
		case "u" :
			process1.updateEmployee();
			break;
		case "D" :
		case "d" :
			process1.deleteEmployee();
			break;
		case "S" :
		case "s" :
			System.out.println("Terminated");
			System.exit(0);
		default:
			System.out.println("Invalid Input. Try Again");
			break;
		}
		}while(true);
		
		
	
		
		
	}
}
*/