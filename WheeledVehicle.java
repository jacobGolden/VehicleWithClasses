/************************
 * WheeledVehicle.java
 * Author: Jacob Golden
 ************************/

public class WheeledVehicle extends Vehicle {

	// //instance variables
	private int numWheels;
	protected boolean hasFlat = false;
	
	// //constructors
	public WheeledVehicle(String name, int milesTraveled, int numWheels) {
		//inherited name and milesTraveled from superclass
		super(name, milesTraveled);
		//passed in number of wheels
		this.numWheels = numWheels;
	}
	
	//get numWheels
	public int getNumWheels() {
		return numWheels;
	}
	
	//go one hour
	@Override
	protected void goOneHour() {
		//if wheeled vehicle has a flat
		if(hasFlat == true) {
			System.out.println("You aren't going anywhere with that flat tire...");
		}
		//if wheeled vehicle has no flat
		else {
			super.goOneHour();
		}	
	}
	
	//fix-a-flat
	public void fixFlat() {
		hasFlat = false;
	}
	
	//unfinished toString method
	@Override
	public String toString() {
		String str = new String();
		str = "Wheeled Vehicle " + super.toString();
		str += " and has " + numWheels + " wheels.";
		return str;
	}
	
}//end class WheeledVehicle
