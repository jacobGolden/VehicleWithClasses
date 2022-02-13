/************************
 * Car.java
 * Author: Jacob Golden
 ************************/

import java.util.Random;

public class Car extends WheeledVehicle {

	// //instance variables
	private int lastOilChange;
	private final int OIL_CHANGE_DUE = 3000;
	
	// //constructors
	public Car(String name, int milesTraveled) {
		super(name, milesTraveled, 4);
		lastOilChange = milesTraveled;
	}
	
	// //service methods
	
	//change oil
	public void changeOil() {
		System.out.println(getName() + ": oil changed at " + getMilesTraveled() + " miles.");
		lastOilChange = getMilesTraveled();
	}
	
	//go one hour
	@Override
	public void goOneHour() {
		if(hasFlat == true) {
			return;
		}
		else {
			//increase milesTraveled by 65
			milesTraveled += 65;
			
			//chance for flat tire
			flatChance();
			
			//if car gets a flat
			if(hasFlat == true) {
				System.out.println(getName() + ": flat tire at " + getMilesTraveled() + " miles.");
			}
			
			//if (milesTraveled - lastOilChange) >= 3000, invoke changeOil()
			if(getMilesTraveled() - lastOilChange >= OIL_CHANGE_DUE) {
				changeOil();
			}
		}
	}//end goOneHour()
	
	//unfinished toString method
	@Override
	public String toString() {
		String str = new String();
		str = "Car " + super.toString() + " Last Oil Change: " + lastOilChange;
		return str;
	}
	
	// //support methods
	
	//check to see if car has a flat
	private void flatChance() {
		Random rnd = new Random();
		int isFlatCondition = 5;
		int flatChanceUpBound = 10;
		int flatChanceLowBound = 1;
		int flatChance = flatChanceLowBound + rnd.nextInt(flatChanceUpBound - flatChanceLowBound);
		if(flatChance == isFlatCondition) {
			hasFlat = true;
		}
	}//end flatChance
}//end class Car
