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
public class DonutLand_Refactored {

    public static void main(String[] args) {
        final int smallBite = 12;
        final int mediumBite = 25;
        //final int largeBite = 34;

        Donut_Refactored firstDonut = new Donut_Refactored();
        Donut_Refactored secondDonut = new Donut_Refactored();

        firstDonut.name = "Chloe";
        secondDonut.name = "Crusoe";

        printObjectData(firstDonut);
        printObjectData(secondDonut);

        System.out.println("Eating Chloe...");
        System.out.println("Taking kiloBite...");
        System.out.println("Nommy nom nom!");
        System.out.println("Thank you, Chloe!");
        firstDonut.bite(smallBite);
        printObjectData(firstDonut);

        System.out.println("Eating Crusoe...");
        System.out.println("Taking megaBite...");
        System.out.println("Nommy nom nom!");
        System.out.println("Thank you, Crusoe!");
        secondDonut.bite(mediumBite);
        printObjectData(secondDonut);
    }

    private static void printObjectData(Donut_Refactored donut) {
        System.out.println("|----------STATS----------|");
        System.out.println("   NAME: " + donut.name);
        System.out.println("   PERCENT REMAINING: " + donut.getRemaining());
        System.out.println("|-------------------------|");
    }
}
