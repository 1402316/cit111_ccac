/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;

import java.util.Scanner;

/**
 *
 * @author Rashad
 */
public class UnitConverter {
    public static void main(String[] args){
        //Initialize neccessary assets
        Scanner scanner = new Scanner(System.in);
        double answer = 0;
        double user;
        int select;
        
        //Introduction and user interface
        System.out.println("---------------------------------------------");
        System.out.println("Select the Conversion You Would like to do:");
        System.out.println("---------------------------------------------");
        System.out.println("1.MPH to KPH");
        System.out.println("2.Gallons to Liters");
        System.out.println("3.Lbs to Kg:");
        System.out.println("---------------------------------------------");
        System.out.println("(Type the number you of the conversion and press enter:");
        //Ask user to select conversion and take number to determine selection
        select =  scanner.nextInt();
        
        //use swutch to direct user to input prompt for the selecter conversion
        switch (select) {
            //MPH to KPH
            case 1:
                System.out.println("---------------------------------------------");
                System.out.println("Enter the MPH to be Converted:");
                user = scanner.nextInt();
                System.out.println("---------------------------------------------");
                //restate input, call method and use its return as output
                System.out.println(user+"MPH is equivalent to "+milesToKilos(user)+"KPH");
                break;
                //Gallons to liters
            case 2:
                System.out.println("---------------------------------------------");
                System.out.println("Enter the Gallons to be Convered:");
                user = scanner.nextInt();
                System.out.println("---------------------------------------------");
                //restate input, call method and use its return as output
                System.out.println(user+" Gallons is equivalent to "+gallonsToLiters(user)+" Liters");
                break;
                //pounds to kilograms
            case 3:
                System.out.println("---------------------------------------------");
                System.out.println("Enter the Pounds to be Converted:");
                user = scanner.nextInt();
                System.out.println("---------------------------------------------");
                //restate input, call method and use its return as output
                System.out.println(user+"lbs is equivalent to "+poundsToKilos(user)+"kg");
                break;
        }
    }
//MPH to KPH convversion method
    public static double milesToKilos(double milesPerHour){
        double kph = milesPerHour*1.609;
        return (kph);
    }
    
    //Gallons to liters conversion method
    public static double gallonsToLiters(double gallons){
        double liters = gallons*3.78541;
        return liters;
    }
    
    //pounds to kilos conversion method
    public static double poundsToKilos(double pounds){
        double kg = pounds*0.453592;
        return kg;
    }
    
}
