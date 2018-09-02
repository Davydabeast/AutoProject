//Name: David Livadhi
//Date: 1/29/18
//Program Name: Automobile Tester
import java.util.Random;
import java.util.Scanner;
public class Autotester
{
   public static void main(String[] args)
   {
      Random gen = new Random();
      Scanner in = new Scanner(System.in);
      int i = 0;
      
      do
      {
         int num = gen.nextInt(3) + 1;
         switch (num)
         {
            case 1: 
            {
               System.out.println("How many wheels does your Automobile have?");
               int wheels = in.nextInt();
               System.out.println("What year is your automobile?");
               int year = in.nextInt();
               in = new Scanner(System.in);
               System.out.println("What color is your automobile?");
               String color = in.nextLine();
               Automobile DavidsTransport = new Automobile(wheels, color, year);
               DavidsTransport.makePlate();
               System.out.println(DavidsTransport.toString());
               i++;
            }
            case 2: 
            {
               System.out.println("How many wheels does your Automobile have?");
               int wheelsC = in.nextInt();
               System.out.println("What year is your automobile?");
               int yearC = in.nextInt();
               System.out.println("How many doors does your car have?");
               int doors = in.nextInt();
               in = new Scanner(System.in);
               System.out.println("What color is your automobile?");
               String colorC = in.nextLine();
               System.out.println("What type of roof does your car have?");
               String roof = in.nextLine();
               System.out.println("What type of fuel does your car use?");
               String fuel = in.nextLine();
               Car DavesCivic = new Car(wheelsC, colorC, yearC, doors, fuel, roof);
               System.out.println(DavesCivic.toString());
               i++;
            }
            case 3: 
            {
               System.out.println("How many wheels does your MotorCycle have have?");
               int wheelsM = in.nextInt();
               System.out.println("What year is your motorcycle?");
               int yearM = in.nextInt();
               System.out.println("What gear is your motorcycle in?");
               int gear = in.nextInt();
               in = new Scanner(System.in);
               System.out.println("What color is your motorcycle?");
               String colorM = in.nextLine();
               Motorcycle DavesMoto = new Motorcycle(wheelsM, colorM, yearM, gear);
               System.out.println(DavesMoto.toString());
               i++;
            }

         }
      }
      while(i < 5); 
   } 
}