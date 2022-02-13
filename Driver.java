// Driver.java
// CS257 Lab 6 Application Program
// Kevin Sahr, 2/9/16

public class Driver
{
   public static void main (String [] args)
   {
      final int numHours = 200;

      // create some vehicles
      Car c = new Car("Corvette", 2000);
      Boat b = new Boat("Mayflower");
      Vehicle v = new Vehicle("Vehicle", 100);
      WheeledVehicle w = new WheeledVehicle("Semi", 1000, 18);
      Bike s = new Bike("Schwinn", 25);

      System.out.println("** newly created:");
      System.out.println("   " + c);
      System.out.println("   " + b);
      System.out.println("   " + v);
      System.out.println("   " + w);
      System.out.println("   " + s);

      System.out.println("\n** traveling " + numHours + " hours:");
      c.go(numHours);
      b.go(numHours);
      v.go(numHours);
      w.go(numHours);
      s.go(numHours);

      System.out.println("\n** after traveling:");
      System.out.println("   " + c);
      System.out.println("   " + b);
      System.out.println("   " + v);
      System.out.println("   " + w);
      System.out.println("   " + s);

      System.out.println("\n** drifting the boat:");
      b.drift();
      System.out.println("** after drift: ");
      System.out.println("   " + b);

      System.out.println("\n** fixing flats:");
      c.fixFlat();
      w.fixFlat();
      s.fixFlat();

      System.out.println("** after fixing flats:");
      System.out.println("   " + c);
      System.out.println("   " + w);
      System.out.println("   " + s);

      System.out.println("\n** traveling another " + numHours + " hours:");
      c.go(numHours);
      b.go(numHours);
      v.go(numHours);
      w.go(numHours);
      s.go(numHours);

      System.out.println("\n** after traveling:");
      System.out.println("   " + c);
      System.out.println("   " + b);
      System.out.println("   " + v);
      System.out.println("   " + w);
      System.out.println("   " + s);

      System.out.println("\n** fixing flats:");
      c.fixFlat();
      w.fixFlat();
      s.fixFlat();

      System.out.println("** after fixing flats:");
      System.out.println("   " + c);
      System.out.println("   " + w);
      System.out.println("   " + s);

   } // main

} // Driver
