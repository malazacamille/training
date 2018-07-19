
public class MainCar {
	
	public static void main(String [] args) {
		Cars myCar = new CarImpl();
		
		Cars myLog = new CarLoggerA(new CarImpl());
		
		myLog.drive();
	}
}
