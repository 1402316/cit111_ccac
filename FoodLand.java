/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Rashad
 */
public class FoodLand {

    public static void main(String[] args) {
        //Initialize Salad
        Salad mySalad = new Salad();
        mySalad.vegetarian = false;
        mySalad.containsNuts = false;
        mySalad.lettuceType = "Ceasar";
        printSaladData(mySalad);

        //Initialize Burger
        Burger myBurger = new Burger();
        myBurger.bacon = false;
        myBurger.veggieBurger = false;
        myBurger.doneness = "Well Done";
        printBurgerData(myBurger);

        //Initialize Donut
        Donut myDonut = new Donut();
        myDonut.icing = false;
        myDonut.sprinkles = false;
        myDonut.flavor = "Strawberry";
        printDonutData(myDonut);

        //Toggle Salad Properties
        mySalad.toggleMeat();
        mySalad.toggleNuts();
        mySalad.changeLettuce("Romane");
        mySalad.eatSalad(25);
        printSaladData(mySalad);

        //Toggle Burger Properties
        myBurger.toggleBacon();
        myBurger.toggleVeggie();
        myBurger.chooseDoneness("Medum-Well");
        myBurger.eatBurger(50);
        printBurgerData(myBurger);

        //Toggle Donut Properties
        myDonut.toggleIcing();
        myDonut.toggleSprinkles();
        myDonut.chooseFlavor("Blueberry");
        myDonut.bite(33);
        printDonutData(myDonut);
    }

    //Donut status method
    private static void printDonutData(Donut donut) {
        System.out.println("|-------DONUT STATS-------|");
        System.out.println("   Icing: " + donut.icing);
        System.out.println("   Sprinkles: " + donut.icing);
        System.out.println("   Flavor: " + donut.flavor);
        System.out.println("   PERCENT REMAINING: " + donut.getRemaining());
        System.out.println("|-------------------------|");
    }

    //Burger status method
    private static void printBurgerData(Burger burger) {
        System.out.println("|-------BURGER STATS-------|");
        System.out.println("   Bacon: " + burger.bacon);
        System.out.println("   Veggie Burger: " + burger.veggieBurger);
        System.out.println("   Doneness: " + burger.doneness);
        System.out.println("   PERCENT REMAINING: " + burger.percRemaining);
        System.out.println("|--------------------------|");
    }

    //Salad status method
    private static void printSaladData(Salad salad) {
        System.out.println("|-------SALAD STATS-------|");
        System.out.println("   Contains Nuts: " + salad.containsNuts);
        System.out.println("   Vegetarian: " + salad.vegetarian);
        System.out.println("   Lettuce Type: " + salad.lettuceType);
        System.out.println("   PERCENT REMAINING: " + salad.percRemaining);
        System.out.println("|-------------------------|");
    }
}
