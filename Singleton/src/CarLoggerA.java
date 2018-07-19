
public class CarLoggerA extends CarLogger{

	public CarLoggerA(Cars decoratedCars) {
		super(decoratedCars);
		// TODO Auto-generated constructor stub
	}
	
		@Override
	  public void drive() {
		decoratedCars.drive();	       
		beforeDrive(decoratedCars);
		afterDrive(decoratedCars);
	   }

	   private void beforeDrive(Cars decoratedCars){
	      System.out.println("Before Drive");
	   }
	   private void afterDrive(Cars decoratedCars){
		      System.out.println("After Drive");
		   }
}
