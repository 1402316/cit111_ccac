/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekB1_scope;

/**
 *
 * @author Rashad
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package weekB1_scope;
import java.util.Random;

/**
 *
 * @author Rashad
 */
public class OrderTabulator {

    //Initialize varibles holding count of sliders
    private static int pizzaOrdered = 0;
    private static int roastOrdered = 0;

    //method which processes and adds to count of roast beef slider orders
    public static void orderRoastSliders(int orders) {
        System.out.println("Cookin' up " + orders + " roast beef sliders");
        roastOrdered += orders;
    }
    //method which processes and adds to count of pizza slider orders
    public static void orderPizzaSliders(int orders) {
        System.out.println("Cookin' up " + orders + " pizza sliders");
        pizzaOrdered += orders;
    }

        //method which prints the total of each slider type which has been ordered
    public static void printOrderTotals() {
        System.out.println("");
        System.out.println("********ORDER TOTALS********");
        System.out.println("Total Pizza Sliders Ordered: " + pizzaOrdered);
        System.out.println("Total Roast Beef Sliders Ordered: " + roastOrdered);
        System.out.println("***************************");
        System.out.println("");
    }

    public static void main(String[] args) {
        printOrderTotals();
        orderPizzaSliders(1);
        orderRoastSliders(2);
        printOrderTotals();
        orderPizzaSliders(4);
        orderRoastSliders(2);
        printOrderTotals();
        orderPizzaSliders(3);
        orderRoastSliders(6);
        printOrderTotals();
        orderPizzaSliders(17);
        orderRoastSliders(38);
        printOrderTotals();
    }
}
