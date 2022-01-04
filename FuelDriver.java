
/**
 * FuelDriver - Write a description here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Standard import for the Scanner class
import java.util.*;
public class FuelDriver {
    

    public static void main (String [] args) {

        // do NOT change the main method!

       

        // initialize a new fuel tank object

        FuelTank tank1 = new FuelTank ("Diesel", 55.0);

       

        // first try to use some fuel and then add a liter

        tank1.consume(2.0);

        tank1.fill(1.0);

        System.out.print ("Starting out.....");

        System.out.println (tank1);

       

        // fill 'er up (and then some)!

        tank1.fill(60);

        System.out.print ("Filled up........");

        System.out.println (tank1);      

       

        // use some litres

        tank1.consume(13.6);

        System.out.print ("Consumed some....");

        System.out.println (tank1);

    }

}

