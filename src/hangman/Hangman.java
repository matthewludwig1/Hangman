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
       
       int randomCategory = (int)(Math.random() * categories.length -1);
       int randomSelection = (int)(Math.random() * randomCategory);
       
        // create a boolean condition if the guess is false of corect
        for (int numGuesses = 7; numGuesses > 0; numGuesses--) { // updates the number of guess
            // if the guess is wrong, decrease the number of guesses
            String guess = JOptionPane.showInputDialog("Number of remaining guesses: " +(numGuesses)
                    + " \n Guess a Letter:");
        }
        
    }
    
}
/*
Displaying dashes for the string arrays:
use if(charAt(i) == '') function
*/
