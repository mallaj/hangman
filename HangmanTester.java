/*
 * Hangman Tester Class.
 * By Janak Mall and Papa Sarpong. 
 */

import java.util.Scanner;           //Import Scanner for user interaction. 
public class HangmanTester {
 
public static void main(String[] args) {               //This is the main method from where the code begins. 
        Scanner keyboard = new Scanner(System.in);           // We create a keyboard object to get info from the user. 
       
        System.out.println("                                Hangman Game!");
 
        while (Hangman.count < 7 && Hangman.star.contains("*")) {               //While loop, until when the code has to run and what steps to follow. 
           // System.out.println("                                             Hangman Game!  ");
            System.out.println("Guess a letter from the a-z");
            
            System.out.println(" ");
            System.out.println(Hangman.star);
            String guess = keyboard.next();
            Hangman.checkAlreadyEntered(guess);
        }
        keyboard.close();
        Hangman.drawHangman();
}
 
}