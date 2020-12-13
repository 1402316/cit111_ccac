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
public class Burger {

    //member variables
    public int percRemaining = 100;
    public boolean bacon;
    public boolean veggieBurger;
    public String doneness;

    //Eat function
    public void eatBurger(int percentEaten) {
        percRemaining = percRemaining - percentEaten;
    }

    //Add/remove vegetable patty
    public void toggleVeggie() {
        if (veggieBurger == true) {
            veggieBurger = false;
        } else {
            veggieBurger = true;
        }
    }

    //Add/remove bacon
    public void toggleBacon() {
        if (bacon == true) {
            bacon = false;
        } else {
            bacon = true;
        }
    }

    //Change burger doneness
    public void chooseDoneness(String newDoneness) {
        doneness = newDoneness;
    }
}
