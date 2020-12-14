/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit111Final;
import java.util.Scanner;

/**
 *
 * @author Rashad
 */
public class hangmanLand {

    public static void main(String[] args) {
        //initiallize variables
        hangman main = new hangman();
        Scanner userInputScanner = new Scanner(System.in);

        //run all preperatory functions
        boolean gameEnd = false;
        main.fails = 0;
        main.fillWordList();
        main.initializeWord();
        main.loadAlphabet();
        main.changeHangmanStatus();
        
        //System.out.println(main.selectedWord);
        
        //gameplay loop
      while(!gameEnd){
          System.out.println("----------------------------------------------------------");
          //System.out.println(gameEnd);
          main.showHangman();
          main.showWordStatus();
          main.showRemainingLetters();
          System.out.print("Guess a Letter: ");
          main.guessLetter(userInputScanner.next());
          main.changeHangmanStatus();
          gameEnd = main.checkGameOver();
          //System.out.println(gameEnd);
      }
    }
}

