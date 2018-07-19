package idv.camille;

public class MainClass {
	
	public static void main (String [] args) {
		//Setter
		SecondService secondservice = 
				new SecondService();
		secondservice.setAService(new Van());
		secondservice.exec();
		//Constructor
		ThirdService thirdservice = 
				new ThirdService(new Jeep());
		thirdservice.test();
		//interface
		FirstService firstservice = 
				new FirstService();
		firstservice.test();
	}
	
}
