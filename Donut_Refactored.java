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
public class Donut_Refactored {

    //member variables
    private int percRemaining = 100;
    public String name;

    public void bite(int percentEaten) {
        System.out.println("Inside bite method");
        percRemaining = percRemaining - percentEaten;
    }

    public int getRemaining() {
        System.out.println("Inside getRemaining method");
        return percRemaining;
    }
}
