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
public class Salad {

    //member variables
    public int percRemaining = 100;
    public boolean containsNuts;
    public boolean vegetarian;
    public String lettuceType;

        //Eat function
    public void eatSalad(int percentEaten) {
        percRemaining = percRemaining - percentEaten;
    }

        //Add/remove nuts
    public void toggleNuts() {
        if (containsNuts == true) {
            containsNuts = false;
        } else {
            containsNuts = true;
        }
    }

        //Add/remove meat
    public void toggleMeat() {
        if (vegetarian == true) {
            vegetarian = false;
        } else {
            vegetarian = true;
        }
    }

        //change lettuce type
    public void changeLettuce(String newLettuce) {
        lettuceType = newLettuce;
    }
}
