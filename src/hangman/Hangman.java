/*
    Matthew Ludwig
    5 March 2019
    This program compares the users guess to a radomly selected phrase in various
    categories
 */

package hangman;

/**
 *
 * @author malud0519
 */

import javax.swing.*;
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] shows = {"The Walking Dead", "Family Guy", "American Dad", "Family"
               + "Feud"};
       String[] videoGames = {"Half Life", "Minecraft","Super Smash Bros", "Pokemon"};
       String[] sportsTeams = {"Maple Leafs", "Yankees", "Canadiens" , "Raptors"};
       String[] animals = {"Dog", "Cat", "Horse", "Moose"};
       String[] foods = {"Pizza", "Yogurt", "Apple", "Lasagna"};
       String[][] categories = {shows, videoGames, sportsTeams, animals, foods};
       
        for (int numGuesses = 7; numGuesses > 0; numGuesses--) {
        
            String guess = JOptionPane.showInputDialog("Number of remaining guesses: " +(numGuesses)
        + " \n Guess a Letter:");
        } 
    }   
}
/*
TO DO:
Replace spaces with hyphens
if the character is guessed correctly, show the letter on the screen
else if the character is guessed incorrectly, display another part of the body.
    Also decrement the number of guesses remaining
*/


/*
Displaying dashes for the string arrays:
use if(charAt(i) == '') function
*
