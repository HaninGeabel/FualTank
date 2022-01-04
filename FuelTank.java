
/**
 * FuelTank - Write a description here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Standard import for the Scanner class
import java.util.*;
public class FuelTank {
    
        private String fuelType = " "; 
        private   double capacity =0;           
        private  double fuelLevel = 0;  
        
        
        
    public FuelTank(){
        
    }
    public FuelTank(String fuelType, double capacity ){
        this.fuelType =fuelType;
        this.capacity =capacity;
    }
    public void setFuelType( String fuelType){
        this.fuelType =fuelType;
    }
    public void setCapacity( double capacity){
        this.capacity =capacity;
    }
    public void setFuelLevel( double fuelLevel){
        this.fuelType =fuelType;
    }
    public String getFuelType(){
        return fuelType;
    }
    public double getCapacity(){
        return capacity;
    }
    public double getFuelLevel(){
        return fuelLevel;
    }
    
    public void fill (double amount){
         fuelLevel = fuelLevel + amount;
         if (fuelLevel>capacity){
            fuelLevel=capacity;
         }
    }
    public void consume(double decrement){
         fuelLevel = fuelLevel - decrement;
         if (fuelLevel<0){
            fuelLevel=0;
         }
    }
    public String toString(){
      return ("Type: "+ fuelType +", Level: " + fuelLevel + " of " +capacity +"L" +"(" + (int)(Math.round((fuelLevel/ capacity)*100)) +"%)");
    }
    

}