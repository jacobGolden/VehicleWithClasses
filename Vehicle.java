/************************
 * Vehicle.java
 * Author: Jacob Golden
 ************************/

public class Vehicle {

	// //instance variables
	private String name;
	protected int milesTraveled;
	
	// //Constructors
	public Vehicle(String name, int milesTraveled) {
		this.name = name;
		this.milesTraveled = milesTraveled;
	}
	
	// //service methods
	public int getMilesTraveled() {
		return milesTraveled;
	}
	
	//get name
	public String getName() {
		return name;
	}
	
	//set name
	public String setName(String name) {
		this.name = name;
		return name;
	}
	
	//go one hour
	protected void goOneHour() {
		milesTraveled += 7;
	}
	
	//go numHours
	public void go(int numHours) {
		for (int i = 0; i < numHours; i++)
	         goOneHour();
	}
	
	//unfinished toString method
	public String toString() {
		String str = new String();
		str = "Vehicle " + getName() + " has traveled " + getMilesTraveled() + " miles.";
		return str;
	}
}//end class Vehicle
