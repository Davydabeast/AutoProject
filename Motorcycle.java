//Name: David Livadhi
//Date: 1/29/18
//Program Name: MotorCycle class
public class Motorcycle extends Automobile
{
   private int gear;
   public Motorcycle(int wheels, String color, int year, int aGear)
   {
      super(wheels, color, year);
      gear = aGear;
   }
   public void upShift()
   {
      gear++;
   }
   public void downShift()
   {
      if(gear>=1)
      {
         gear--;
      } 
   }
   public int currentGear()
   {
      return gear;
   }
   public String toString()
   {
      return ("The Motorcycle has  " + super.getWheels() + " wheels and its color is " + super.getColor() + " it was made in the year " + super.getYear() + " The current gear is " + gear); 
   }
}