/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Rashad
 */
public class RoadTrip {
    public static void main(String[] args){
        
        final double nedMPG = 32.0;
        final double aveGasPrice = 2.65;
               
        //declaring and initializeing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5;
        int currentPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double currentCash = 300.0;
        double distanceTo = 1806.0;
        boolean destinationReached = false;
        
        double legDistance;
        
        //Roadtrip Simulation
        System.out.println("***Road Trip Simpulator 2020***");
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName + ", and you are to treat him with respect.");
        System.out.println("Distance to Destination: " + distanceTo);
        System.out.println("Full Car? " + carFull + "; Current Odometer: " + tripOdometer);
        System.out.println("I have $" + currentCash + " to spend of this trip");
        System.out.println("String trip with " + currentPassengers + " Passenger(s)");
        System.out.println("Destination Reached?: " + destinationReached);
        System.out.println("*******************************************");
        System.out.println("");
        
        //Calculate leg distance and store in legDistance
        System.out.println("Beginning Leg 1:");
        double OneQuarter = .25;
        legDistance = distanceTo * OneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        //Increment trip odometer by leg distance
        tripOdometer = tripOdometer + legDistance;
        
        //Subtrace leg distance from DistanceTo destination
        distanceTo = distanceTo - legDistance;
        
        // "see" hitch hiker heading West
        System.out.println("Oh, look! A person who wants to go west, too!");
        
        //Check if there is room in the car, if so, pick up hitch hiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher");
            currentPassengers++;
        }
        
        //Calculate price of gas for first leg and store
        double gasPriceForLeg = (legDistance / nedMPG) * aveGasPrice;
        //deduct $ spent on gas from remaining money
        currentCash -= gasPriceForLeg;
                
        //Reprint Varible Status
        System.out.println("");
        System.out.println("--> End of Leg 1 Stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName + ", and you are to treat him with respect.");
        System.out.println("Distance to Destination: " + distanceTo);
        System.out.println("Full Car? " + carFull + "; Current Odometer: " + tripOdometer);
        System.out.println("I have $" + currentCash + " left");
        System.out.println(currentPassengers + " Current Passenger(s)");
        System.out.println("Destination Reached?: " + destinationReached);
        System.out.println("*******************************************");
        System.out.println("");
        
        //Leg 2
        //Travel 500 miles
        legDistance = 500.0;
        
        //Find pair of hitch hikers
        System.out.println("Oh, look! A pair of hitch hikers want to go west, too!");
        
        //Check if there is room in the car, if so, pick up hitch hikers
        //Add hikers and check passenger capacity
        int hikers = 2;
        currentPassengers+= hikers;
        if(currentPassengers>maxPassengers){
            carFull = true;}
        
        //Decide if there's enough room for hikers, and leave them if there's not
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher(s)"); 
        } else{
            currentPassengers-=hikers;
            System.out.println("Looks like theres not enough room...");}
        carFull = false;
        
        //Calculate price of gas for second leg (500 miles) and store
        gasPriceForLeg = (legDistance / nedMPG) * aveGasPrice;
        //deduct $ spent on gas from remaining money
        currentCash -= gasPriceForLeg;
        
        //Deduct distance travelled from total and add to odometer
        distanceTo-=legDistance;
        tripOdometer += legDistance;
        
         //Reprint Varible Status
        System.out.println("");
        System.out.println("--> End of Leg 2 Stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName + ", and you are to treat him with respect.");
        System.out.println("Distance to Destination: " + distanceTo);
        System.out.println("Full Car? " + carFull + "; Current Odometer: " + tripOdometer);
        System.out.println("I have $" + currentCash + " left");
        System.out.println(currentPassengers + " Current Passenger(s)");
        System.out.println("Destination Reached?: " + destinationReached);
        System.out.println("*******************************************");
        System.out.println("");
        
        //Set leg distance to remainder of distance to dsetination
        legDistance = distanceTo;
        
        //Find pair of hitch hikers
        System.out.println("Oh, look! Another pair of hitch hikers want to go west, too!");
        
        //Check if there is room in the car, if so, pick up hitch hikers
        //Add hikers and check passenger capacity
        hikers = 2;
        currentPassengers+= hikers;
        if(currentPassengers>maxPassengers){
            carFull = true;}
        
        //Decide if there's enough room for hikers, and leave them if there's not
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher(s)");
        } else{
            currentPassengers-=hikers;
            System.out.println("Looks like theres not enough room...");}
        carFull = false;
        
       //Calculate price of gas for last leg and store
        gasPriceForLeg = (legDistance / nedMPG) * aveGasPrice;
        //deduct $ spent on gas from remaining money
        currentCash -= gasPriceForLeg;
        
        //Arrive at destination
        distanceTo = 0;
        tripOdometer+= legDistance;
        destinationReached = true;
                
           //Reprint Varible Status
        System.out.println("");
        System.out.println("--> End of Leg 3 Stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName + ", and you are to treat him with respect.");
        System.out.println("Distance to Destination: " + distanceTo);
        System.out.println("Full Car? " + carFull + "; Current Odometer: " + tripOdometer);
        System.out.println("I have $" + currentCash + " left");
        System.out.println(currentPassengers + " Current Passenger(s)");
        System.out.println("Destination Reached?: " + destinationReached);
        System.out.println("*******************************************");
        System.out.println("");
    }
}
