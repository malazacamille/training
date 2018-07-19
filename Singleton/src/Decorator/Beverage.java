package Decorator;

public abstract class Beverage {
	String description = "Unknown Average";
	
	
	public String getDescription() {
		return description;
	}


	public abstract double cost();
}
