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
public class Donut {

    //member variables
    private int percRemaining = 100;
    public boolean sprinkles;
    public boolean icing;
    public String flavor;
    public String name;

        //Eat function
    public void bite(int percentEaten) {
        percRemaining = percRemaining - percentEaten;
    }

        //Add/remove sprinkles
    public void toggleSprinkles() {
        if (sprinkles == true) {
            sprinkles = false;
        } else {
            sprinkles = true;
        }
    }

        //Add/remove icing
    public void toggleIcing() {
        if (icing == true) {
            icing = false;
        } else {
            icing = true;
        }
    }

        //change flavor
    public void chooseFlavor(String newFlavor) {
        flavor = newFlavor;
    }

        //return remaining percentage of donut
    public int getRemaining() {
        return percRemaining;
    }
}
