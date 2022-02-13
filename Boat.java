/************************
 * Boat.java
 * Author: Jacob Golden
 ************************/

public class Boat extends Vehicle {

	// //instance variables
	//all inherited from parent class Vehicle
	
	// //constructors
	public Boat(String name) {
		//passed in name, milesTraveled = 0
		super(name, 0);
	}
	
	//go one hour
	@Override
	protected void goOneHour() {
		milesTraveled += 6;
	}
	
	//drift
	public void drift() {
		milesTraveled += 2;
	}
	
	//unfinished toString method
	@Override
	public String toString() {
		String str = new String();
		str = "Boat " + super.toString();
		return str;
	}
}//end class Boat
