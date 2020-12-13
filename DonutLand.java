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
public class DonutLand {
    public static void main(String[] args){
        final int firstBiteSize = 12;
        
        Donut firstDonut = new Donut();
        
        //firstDonut = new Donut();
        
        firstDonut.name = "Chloe";
        
        System.out.println("When first created, " + firstDonut.name + "'s\n" + 
                "percent remaining is " + firstDonut.getRemaining());
        printDivider();
        
        System.out.println("Calling bite and passing in\n" + 
                "a bite size of " + firstBiteSize);
        printDivider();
        
        firstDonut.bite(firstBiteSize);
        
        System.out.println("After being eaten, " + firstDonut.name + "'s\n" +
                "percent remaining is " + firstDonut.getRemaining());
    }
    private static void printDivider(){
        System.out.println("............................................");
    }
}
