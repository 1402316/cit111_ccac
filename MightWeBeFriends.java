/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

public class MightWeBeFriends {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //used for reading user text input
        String userText;
        
        //used for text replacement
        String userName = "Jim";
        String wrongName = "Jim";
        
        //next prompt that is to be asked of the user
        String nextPrompt = "intro";
        
        //used for reading user binary input
        int userNum;
        
        //user's point total
        int points = 0;
        
        //while true, while loop continues
        boolean loop = true;

        //Whil lop goes through a series if if statements until it finds the one that matches the current progress of the quiz, asks he appropriate question, then loops again for the next question
        while (loop) {
            //Intro + Are you an honest person?
            if (nextPrompt == "intro") {
                System.out.println("Welcome to my Friendship Quiz!");
                System.out.println("*****************************************************");
                System.out.println("First Question: Are you an honest person?:");
                System.out.println("Enter 0 for Yes");
                System.out.println("Enter 1 for No");
                userNum = scanner.nextInt();

                //honest
                if (userNum == 0) {
                    points += 5;
                    nextPrompt = "honest";
                    //not honest
                } else {
                    points -= 5;
                    System.out.println("At least you were honest");
                    nextPrompt = "id";
                }
                //If honest, ask if lying
            } else if (nextPrompt == "honest") {
                System.out.println("*****************************************************");
                System.out.println("That's exactly what a liar would say. Are you lying to me?:");
                System.out.println("Enter 0 for Yes");
                System.out.println("Enter 1 for No");
                userNum = scanner.nextInt();

                //If lying
                if (userNum == 0) {
                    System.out.println("At least you were honest");
                    nextPrompt = "id";
                    //if truly honest
                } else {
                    nextPrompt = "doubleHonest";
                }
                //Claims honest twice
            } else if (nextPrompt == "doubleHonest") {
                System.out.println("*****************************************************");
                System.out.println("Okay then Honest Abe, if you're so honest then tell me what number I'm thinking of:");
                System.out.println("Enter 0 for 7");
                System.out.println("Enter 1 for This is a multiple choice quiz, I can see the answer is 7");
                System.out.println("Enter 2 for What does this have to do with honesty?");
                userNum = scanner.nextInt();

                //if user guesses number
                if (userNum == 0) {
                    points += 10;
                    System.out.println("No, 8 actually. But points for trying.");
                    //if user doesnt play along
                } else {
                    points -= 10;
                    System.out.println("Wow, SOMEONES fun at parties...");
                }
                nextPrompt = "id";

                //Ask user for basic personal information
                //Gender (for literally no reason)
            } else if (nextPrompt == "id") {
                System.out.println("*****************************************************");
                System.out.println("Anyways, I never asked anything about you. Do you more closely identify as a Male or Female?");
                System.out.println("Enter 0 for Male");
                System.out.println("Enter 1 for Female");
                userNum = scanner.nextInt();

                //name
                System.out.println("*****************************************************");
                System.out.print("Great! That one's my favorite! So, what's your name?: ");
                userName = scanner.next();

                //reassign name
                System.out.println("*****************************************************");
                System.out.println("Nice to meet you " + userName + ", but that's kind of hard to pronounce. Do you mind if I call you Jim?");
                System.out.println("Enter 0 for Yeah, sure");
                System.out.println("Enter 1 for You already have my name saved, just use it???");
                System.out.println("Enter 2 for That is my name");
                userNum = scanner.nextInt();

                //if user allows new name
                if (userNum == 0) {
                    points += 5;
                    System.out.println("Great! I can work with that!");
                    //user doesn't play along
                } else if (userNum == 1) {
                    points -= 5;
                    System.out.println("That sounds like a you problem, Jimbo :/");
                    //if user is actually named Jim, assign alternate name
                } else {
                    System.out.println("*****************************************************");
                    System.out.println("Oh, did I say Jim? I meant Kevin.");
                    System.out.println("Enter 0 for Yeah, sure");
                    System.out.println("Enter 1 for Please don't");
                    wrongName = "Kevin";
                    userNum = scanner.nextInt();

                    //if user allows new name
                    if (userNum == 0) {
                        points += 5;
                        System.out.println("Great! I can work with that!");
                        //if user doesn't play along
                    } else if (userNum == 1) {
                        points -= 5;
                        System.out.println("That sounds like a you problem, Kevmeister :/");
                    }
                }
                nextPrompt = "games";

                //Friendship quiz questions: games
            } else if (nextPrompt == "games") {
                System.out.println("*****************************************************");
                System.out.println("Anyways " + wrongName + ", we should get on to the real quiz now. Do you like Video Games?");
                System.out.println("Enter 0 for Yes");
                System.out.println("Enter 1 for No");
                userNum = scanner.nextInt();

                //If user likes games, ask about more games
                if (userNum == 0) {
                    points += 5;
                    System.out.println("*****************************************************");
                    System.out.println("Sweet! Do you like Leaue of Legends?");
                    System.out.println("Enter 0 for Yes");
                    System.out.println("Enter 1 for No");
                    userNum = scanner.nextInt();

                    if (userNum == 0) {
                        points += 5;
                        System.out.println("Nice! ");
                    }
                    System.out.println("*****************************************************");
                    System.out.println("How about Monster Hunter?");
                    System.out.println("Enter 0 for Yes");
                    System.out.println("Enter 1 for No");
                    userNum = scanner.nextInt();

                    if (userNum == 0) {
                        points += 5;
                        System.out.println("Awesome! ");
                    }
                    //if user doesnt like games
                } else if (userNum == 1) {
                    points -= 10;
                }

                System.out.println("*****************************************************");
                System.out.println("Do you like Rap, Hip Hop or R&B? ");
                System.out.println("Enter 0 for Yes");
                System.out.println("Enter 1 for No");
                userNum = scanner.nextInt();

                //if user likes similar genres, ask abou tspecific artists
                if (userNum == 0) {
                    points += 5;
                    System.out.println("*****************************************************");
                    System.out.println("Sweet! Do you like any of Tyler, The Creator's music?");
                    System.out.println("Enter 0 for Yes");
                    System.out.println("Enter 1 for No");
                    userNum = scanner.nextInt();

                    if (userNum == 0) {
                        points += 5;
                        System.out.println("Dope!");
                    }

                    System.out.println("*****************************************************");
                    System.out.println("How about Frank Ocean's?");
                    System.out.println("Enter 0 for Yes");
                    System.out.println("Enter 1 for No");
                    userNum = scanner.nextInt();

                    if (userNum == 0) {
                        points += 5;
                        System.out.println("Alright! ");
                    }

                //if user doesn't like same music, subtract points
                } else if (userNum == 1) {
                    points -= 5;
                }

                //Does user like me?
                System.out.println("*****************************************************");
                System.out.println("Do you... do you like me?");
                System.out.println("Enter 0 for Yes");
                System.out.println("Enter 1 for No");
                userNum = scanner.nextInt();

                //If user liks me
                if (userNum == 0) {
                    points += 10;
                    nextPrompt = "likes";
                //if user dislikes me
                } else if (userNum == 1) {
                    points -= 10;
                    nextPrompt = "typo";
                }
                
                //If user said they like me, evalute if they got enough points to be friends
            } else if (nextPrompt == "likes") {
                //If they did get enough points
                if (points >= 15) {
                    System.out.println("I'm so happy! You passed the test, " + userName + "! I'm sure we'll make the best of friends :D");
                 //if they didn't get enough points
                } else {
                    System.out.println("That's too bad, you seem a bit lame for my taste. You failed, " + wrongName + ". Get lost <3");
                }
                //stop while loop
                loop = false;
            //If user doesn't like me, ask if they like memes
            } else if (nextPrompt == "typo") {
                System.out.println("*****************************************************");
                System.out.println("Th-that was a typo, I meant *memes... haha");
                System.out.println("Enter 0 for Yes");
                System.out.println("Enter 1 for No");
                userNum = scanner.nextInt();

                //give or subtract poitns based on answer, then evalute if user has enough points to be friends
                //if user lieks memes
                if (userNum == 0) {
                    points += 5;
                    //If user can be friends
                    if (points >= 15) {
                        System.out.println("Cool, me too! M-maybe we could hang out and look at some memes... like, together sometime, idk. Anyways, I'm sure we'd make great friends :D");
                        System.out.println("And sorry about that freak typo, my cousin must have hit something on the keyboard lol haha...");
                    //if user can't be friends
                    } else {
                        System.out.println("Cool, cool... umm... anyways, I think I'm gonna go, I don't really think this is really gonna work out tbh... later " + wrongName);
                    }
                    //If user doesn't like memes, 
                } else if (userNum == 1) {
                    points -= 5;
                    //if user can be friends
                    if (points >= 15) {
                        System.out.println("Yeah, I'd never look at stupid memes, they're so lame haha... But anyways, I think we could like... be friends or whatever, you seem pretty cool haha");
                        //if user can't be friends
                    } else {
                        System.out.println("Oh, okay... Well in that case, I think I'm gonna go, I don't think this is gonna work out...");
                        System.out.println("NO I'M NOT CRYING, YOU ARE!");
                    }
                }
                //stop while loop
                loop = false;
            }
        }
    }//Close Main
}
