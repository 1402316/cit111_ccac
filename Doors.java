/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rashad
 */
public class Doors {

    //Create string which can be utilized inside main and methods
    public static String answer;

    public static void main(String[] args) {
        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        //Title Screen
        System.out.println("WELCOME TO THE GAME FO THE CENTURY");
        System.out.println("-------GRAND PRIVE OR GOATS-------");
        System.out.println("");
        System.out.println("**********     **********     **********");
        System.out.println("*  **    *     *  ***   *     * ***    *");
        System.out.println("*   *    *     * *   *  *     *    *   *");
        System.out.println("*   *    *     *     *  *     * *****  *");
        System.out.println("*   *    *     *    *   *     *    *   *");
        System.out.println("*  ***   *     * ****** *     * ***    *");
        System.out.println("**********     **********     **********");
        System.out.println("");
        System.out.println("Enter the ONE DOOR number you'd liek to open - 1, 2, or 3:");

        //Read user door selection
        int door = scanner.nextInt();

        //Select approrpiate result based on user selection
        switch (door) {
            case 1:
                getRandomSum();
                break;
            case 2:
                loseRandomSum();
                break;
            case 3:
                //Get user input for varied responses of selected method
                System.out.println("Do You Consent to the Terms of Service to Receive Your Reward? (y/n)");
                answer = scanner.next();
                eraseSelectedSum(answer);
                break;
        }
    }

    //Awards player large(imaginary) sum of money
    public static void getRandomSum() {
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100, r);
        System.out.println("Congratulations! You just won");
        System.out.println("$" + bigInt + " (Imaginary) Dollars!");
    }

    //Gives user absurd amounts of debt
    public static void loseRandomSum() {
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100, r);
        System.out.println("Congratulations! You just incurred");
        System.out.println("$" + bigInt + " Dollars of REAL Debt!");
    }

    //Associates user with complete and utter destabilization of the US economy
    public static void eraseSelectedSum(String answer) {
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100, r);

        //If user agrees to ToS, congratulate them for their choice
        if (answer.equals("y")) {
            System.out.println("Congratulations! You Just Agreed to the Erasure of");
            System.out.println("$" + bigInt + " Dollars from US Circularion! You're a Felon!");

        //If user doesn't agree to ToS, associate them anyways
        } else {
            System.out.println("Too Bad! You Signed Away the Right to Consent Upon Door Selection! And Thus You're Now Affilated with ");
            System.out.println("the Irreversible Erasure of $" + bigInt + " Dollars in US Circularion! You're Offically a Felon!");
        }
    }
}
