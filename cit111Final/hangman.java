/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit111Final;

/**
 *
 * @author Rashad
 */
public class hangman {
    //initiallize member variables
    public int fails;
    public String selectedWord;
    public String[] possibleWords = new String[10];
    public String[] remainingLetters = new String[26];
    public String[] hangmanPicture = new String[6];
    String[] wordStatus = new String[10];

    //initiallize possible word pool 
    public void fillWordList() {
        possibleWords[0] = "AZURE";
        possibleWords[1] = "FJORD";
        possibleWords[2] = "GAZEBO";
        possibleWords[3] = "GNARLY";
        possibleWords[4] = "SPHINX";
        possibleWords[5] = "ZEPHYR";
        possibleWords[6] = "ONYX";
        possibleWords[7] = "BLITZ";
        possibleWords[8] = "VIXEN";
        possibleWords[9] = "MATRIX";
    }

    //Select word to be used for the game
    public void initializeWord() {
        //get random integer from 0-9 to determine which option from the
        //possibel word array to use, and set the mystery word
        int random = (int) (Math.random() * 10);
        selectedWord = possibleWords[random];

        //make correct number of blanks for display
        for (int i = 0; i < selectedWord.length(); i++) {
            wordStatus[i] = "_";
        }
    }

    //Load array of letters to be used
    public void loadAlphabet() {
        remainingLetters[0] = "A";
        remainingLetters[1] = "B";
        remainingLetters[2] = "C";
        remainingLetters[3] = "D";
        remainingLetters[4] = "E";
        remainingLetters[5] = "F";
        remainingLetters[6] = "G";
        remainingLetters[7] = "H";
        remainingLetters[8] = "I";
        remainingLetters[9] = "J";
        remainingLetters[10] = "K";
        remainingLetters[11] = "L";
        remainingLetters[12] = "M";
        remainingLetters[13] = "N";
        remainingLetters[14] = "O";
        remainingLetters[15] = "P";
        remainingLetters[16] = "Q";
        remainingLetters[17] = "R";
        remainingLetters[18] = "S";
        remainingLetters[19] = "T";
        remainingLetters[20] = "U";
        remainingLetters[21] = "V";
        remainingLetters[22] = "W";
        remainingLetters[23] = "X";
        remainingLetters[24] = "Y";
        remainingLetters[25] = "Z";
    }

    //update the hangman visual display
    public void changeHangmanStatus() {
        switch (fails) {
            case 0:
                hangmanPicture[0] = "";
                hangmanPicture[1] = "";
                hangmanPicture[2] = "";
                hangmanPicture[3] = "";
                hangmanPicture[4] = "";
                hangmanPicture[5] = "-------";
                break;
            case 1:
                hangmanPicture[0] = "|---|";
                hangmanPicture[1] = "|";
                hangmanPicture[2] = "|";
                hangmanPicture[3] = "|";
                hangmanPicture[4] = "|";
                hangmanPicture[5] = "-------";
                break;
            case 2:
                hangmanPicture[0] = "|---|";
                hangmanPicture[1] = "|   o";
                hangmanPicture[2] = "|";
                hangmanPicture[3] = "|";
                hangmanPicture[4] = "|";
                hangmanPicture[5] = "-------";
                break;
            case 3:
                hangmanPicture[0] = "|---|";
                hangmanPicture[1] = "|   o";
                hangmanPicture[2] = "|   |";
                hangmanPicture[3] = "|";
                hangmanPicture[4] = "|";
                hangmanPicture[5] = "-------";
                break;
            case 4:
                hangmanPicture[0] = "|---|";
                hangmanPicture[1] = "|   o";
                hangmanPicture[2] = "|  /|";
                hangmanPicture[3] = "|";
                hangmanPicture[4] = "|";
                hangmanPicture[5] = "-------";
                break;
            case 5:
                hangmanPicture[0] = "|---|";
                hangmanPicture[1] = "|   o";
                hangmanPicture[2] = "|  /|\\";
                hangmanPicture[3] = "|";
                hangmanPicture[4] = "|";
                hangmanPicture[5] = "-------";
                break;

            case 6:
                hangmanPicture[0] = "|---|";
                hangmanPicture[1] = "|   o";
                hangmanPicture[2] = "|  /|\\";
                hangmanPicture[3] = "|  /";
                hangmanPicture[4] = "|";
                hangmanPicture[5] = "-------";
                break;

            case 7:
                hangmanPicture[0] = "|---|";
                hangmanPicture[1] = "|   o";
                hangmanPicture[2] = "|  /|\\";
                hangmanPicture[3] = "|  / \\";
                hangmanPicture[4] = "|";
                hangmanPicture[5] = "-------";
                break;
        }
    }

    //Display current hangman progress
    public void showHangman() {
        for (int i = 0; i < 6; i++) {
            System.out.println(hangmanPicture[i]);
        }
    }

    //Display current progress on word
    public void showWordStatus() {
        for (int i = 0; i < selectedWord.length(); i++) {
            System.out.print(wordStatus[i] + " ");
        }
        System.out.println("");
    }

    //Show what letters have been used so far
    public void showRemainingLetters() {
        for (int i = 0; i < 26; i++) {
            System.out.print(remainingLetters[i] + " ");
        }
        System.out.println("");
    }

    //check to see if the game has ended
    public Boolean checkGameOver() {
        boolean gameOver = false;
        boolean blankPresent = false;

        //check to see if there are blanks remaining in mystery word, and if
        //so note that player hasnt won yet
        for (int i = 0; i < selectedWord.length(); i++) {
            if (wordStatus[i].equals("_")) {
                blankPresent = true;
            }
        }
        
        //check to see if the player has guessed incorrectly 7 times, and if
        //so, the game is over
        if (fails == 7) {
            System.out.println("Game Over!");
            System.out.println("The Word Was "+selectedWord);
            showHangman();
            gameOver = true;
        }
        
        //check to see if the player has changed all blanks to correct letters,
        //and if so, game ends
        if (blankPresent == false){
            showWordStatus();
            System.out.println("Congratulations! You Win!");
            gameOver = true;
        }
        
        //tell main that game has ended
        return gameOver;
    }

    //logic and outcomes for guessing letters
    public void guessLetter(String guess) {
        //variables for determining if the guessed letter was applicable
        boolean validGuess = false;
        boolean correctGuess = false;
        
        //convert input to uppercase for the sake of simplicity
        guess = guess.toUpperCase();

        //validGuess = false;
        //correctGuess = false;
        
        //check for multiple letter input
        if (guess.length() == 1) {
            //check for already guessed letters
            for (int i = 0; i < 26; i++) {
                if (guess.equals(remainingLetters[i])) {
                    validGuess = true;
                    remainingLetters[i] = "-";
                }
            }
            //check for match if prior conditions are met
            if (validGuess) {
                //check through each letter of the final word to see if the
                //guessed letter was correct, adn if it is change the blank
                for (int i = 0; i < selectedWord.length(); i++) {
                    if (guess.equals(String.valueOf(selectedWord.charAt(i)))) {
                        wordStatus[i] = guess;
                        correctGuess = true;
                    }
                }
                //notify if guess is correct
                if (correctGuess) {
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Correct!");
                    //notify if guess is incorrect
                } else {
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Wrong!");
                    fails++;
                }
                //invalid guess responses
                //input is a letter that was already used
            } else {
                System.out.println("----------------------------------------------------------");
                System.out.println("Select a Letter You Haven't Already "
                        + "Guessed");
            }
            //input was not a singular letter
        } else {
            System.out.println("----------------------------------------------------------");
            System.out.println("Enter Exactly 1 Character to Guess");
        }
    }
}
