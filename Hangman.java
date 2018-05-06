/* 
 * 
 * Hangman Class.
 * By Janak Malla and Papa Sarpong.
 * 
 */



import java.util.ArrayList;
import java.util.List;
 
public class Hangman {                                          //This is the my Hangman Class.
 
    public static String[] wordBank = {"hello", "computer", "pen", "building", "game", "airplane" };  //An array to hold words.
    public static String word = wordBank[(int) (Math.random() * wordBank.length)]; 
   
    public static String star = new String(new char[word.length()]).replace("\0", "*"); // this converts every letter of the word into stars.
    public static int count = 0;              //this is to see the number of counts.
   
    static char[] enteredLetters = new char[star.length()];  //This stores the entered letters. 
    
   
    public static void checkAlreadyEntered(String guessL) {     //This checks if the entered letter is not repeating or not. 
        
        if( new String(enteredLetters).contains(String.valueOf(guessL)) ) {
            System.out.println("You have already entered these letter- " + new String(enteredLetters) );
        } else {
            hangGuess(guessL);
        }
       
        enteredLetters = (new String(enteredLetters)+guessL).toCharArray();
    }
   
    public static void hangGuess(String guessL) {  
        //this is my second method which takes in the guesses letter to compare.
       
        String newStar = "";
        for (int loop = 0; loop < word.length(); loop++) {     //for loop, compares if the entered letter is actually in the word or not. And removes the strs and replaces it with the letter 
            if (word.charAt(loop) == guessL.charAt(0)) {
                newStar += guessL.charAt(0);
            } else if (star.charAt(loop) != '*') {
                newStar += word.charAt(loop);
            } else {
                newStar += "*";
            }
        }
 
        if (star.equals(newStar)) {
            count++;
            drawHangman();
        } else {
            star = newStar;
        }
        if (star.equals(word)) {
            System.out.println("Correct! You win! The word was " + "------->>>>>[" + word +"]");
        }
    }
 
    public static void drawHangman() {                 // This is my third method to give details about the game.
        if (count == 1) {
            System.out.println("Wrong letter, try again!");
            System.out.println("You have 6 guesses remaining! ");
           // System.out.println();
            //System.out.println();
            //System.out.println();
            //System.out.println();
            //System.out.println("___|___");
            //System.out.println();
        }
        if (count == 2) {
            System.out.println("Wrong letter, try again!");
            System.out.println("You have 5 guesses remaining! ");
    
        }
        if (count == 3) {
            System.out.println("Wrong letter, try again!");
            System.out.println("You have 4 guesses remaining! ");
         
        }
        if (count == 4) {
            System.out.println("Wrong letter, try again!");
            System.out.println("You have 3 guesses remaining! ");
          
        }
        if (count == 5) {
            System.out.println("Wrong letter, try again!");
            System.out.println("You have 2 guesses remaining! ");
        
        }
        if (count == 6) {
            System.out.println("Wrong letter, try again!");
            System.out.println("You have 1 guesses remaining! ");
        
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("You have 0 guesses remaining! ");
           
            System.out.println("GAME OVER! The word was -------->" + word);
        }
    }
}