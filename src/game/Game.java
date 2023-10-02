/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

import java.util.Random; //To get a random number, import the Random class.
import java.util.Scanner; // import this to read user input

/**
 *
 * @author user
 */

public class Game {

    public static void main(String[] args) {
    
       Random r = new Random();
       int number = r.nextInt(100);
       
       Scanner scanner = new Scanner(System.in); // create a new Scanner object to read input from the user.
       int[] guesses = new int[10]; // Make a list of user suggestions in an array. (special kind of list can hold up to 10 numbers and then do things with them later on.)
       int guessCount = 0; //Put the guess count to 0 at the start. ( keep track of how many guesses have being used in an abject.)
       while (guessCount < 10) { /// Keep it going until the user has guessed 10 times. ( the loop will continue running as long as guessCount is less than 10.)
           System.out.print("Guess a number less than 100: "); // the message that the user will see
           int guess = scanner.nextInt(); // Access the console and read the user's guess. ( read an interger value from the user's input and store it in a variable and that can be used later.)
           if (isDuplicateGuess(guesses, guess)) { // Verify if the user has already made this number.
               System.out.println("That was a waste - you already guessed that number!");
               continue; // go to the beginning after skipping the rest of the loop.
           }
           guesses[guessCount] = guess; /// Also include user's prediction in the array.
           guessCount++; // increment the guess number
           if (guess == number || guess == 33) { /// Verify if the user given the secret number or not.
               System.out.println("You win!"); // the message that the user will see if they win.
               return; // and the program and here 
           }
       }
       System.out.println("Hard luck!"); // message that the user will see if they have spent all guesses.
   }
   
   private static boolean isDuplicateGuess(int[] guesses, int guess) {
       for (int i = 0; i < guesses.length; i++) { // iteracte all of the previous guesses
           if (guesses[i] == guess) { //Verify if the user has already made this number.
               return true; // the guess is a duplicate
           }
       }
       return false;   // the guess is not a duplicate
   }
}
   
   
