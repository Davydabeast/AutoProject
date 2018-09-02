//Name: David Livadhi
//Date: 1/29/18
//Program Name: Car class
public class Car extends Automobile
{
   private int numDoors;
   private String Fuel;
   private String Roof;
   public Car(int wheels, String color, int year, int doors, String fuel, String roof)
   {
      super(wheels, color, year);
      numDoors = doors;
      Fuel = fuel;
      Roof = roof;
   }
   public int getDoors()
   {
      return numDoors;
   }
   public String getFuel()
   {
      return Fuel;
   }
   public String getRoof()
   {
      return Roof;
   }
   public String toString()
   {
       return ("The car has  " + super.getWheels() + " wheels and its color is " + super.getColor() + " it was made in the year " + super.getYear() + "It has " + numDoors + " doors and a " + Roof + " roof" );
   }
}