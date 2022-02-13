/************************
 * Bike.java
 * CS257 LAB6
 * Author: Jacob Golden
 * Date: 2/17/2020
 ************************/

public class Bike extends WheeledVehicle {

	// //instance variables
	private double wheelSize = 26.0;
	
	// //constructors
	public Bike(String name, int milesTraveled) {
		//inherited name, miles traveled, two wheels
		super(name, milesTraveled, 2);
	}
	
	// //service methods
	
	//get wheel size
	public double getWheelSize() {
		return wheelSize;
	}
	
	//set wheel size
	public double setWheelSize(double wheelSize) {
		this.wheelSize = wheelSize;
		return wheelSize;
	}
	
	
	//unfinished toString method
	@Override
	public String toString() {
		String str = new String();
		str = "Bike " + super.toString();
		str += ", and has a wheel size of " + getWheelSize() + " inches.";
		return str;
	}
	
	
}//end class Bike
