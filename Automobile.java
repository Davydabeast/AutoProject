//Name: David Livadhi
//Date: 1/29/18
//Program Name: Automobile class
import java.util.Random;
public class Automobile
{
   private int numOfWheels;
   private String Color;
   private int Year;
   private String lPlate;
   public Automobile(int wheels, String aColor, int aYear)
   {
      numOfWheels = wheels;
      Color = aColor;
      Year = aYear;
      lPlate = null;
   }
   public int getWheels()
   {
      return numOfWheels;
   }
   public String getColor()
   {
      return Color;
   }
   public int getYear()
   {
      return Year;
   }
   public String getPlate()
   {
      return lPlate;
   }
   public void makePlate()
   {
      Random gen = new Random();
      for(int i = 0; i<3; i++)
      {
         String abc = "abcdefghijklmnopqrstuvwxyz";
         int pos = gen.nextInt(26);
         String cchar = abc.substring(pos, pos + 1);
         lPlate += cchar;
      }
      for(int i = 0; i<3; i++)
      {
         int pos = gen.nextInt(10);
         lPlate += pos;
      }
      
      
      
   }
   public String toString()
   {
      return ("The automobile has  " + numOfWheels + " wheels and its color is " + Color + " it was made in the year " + Year + "The license plate is " + lPlate); 
   }
}