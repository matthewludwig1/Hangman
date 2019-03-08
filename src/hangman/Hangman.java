/*
    Matthew Ludwig
    7 March 2019
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
       char guess;
       String input;
       String[] shows = {"The Walking Dead", "Family Guy", "American Dad", "Family"
               + "Feud"};
       String[] videoGames = {"Half Life", "Minecraft","Super Smash Bros", "Pokemon"};
       String[] sportsTeams = {"Maple Leafs", "Yankees", "Canadiens" , "Raptors"};
       String[] animals = {"Dog", "Cat", "Horse", "Moose"};
       String[] foods = {"Pizza", "Yogurt", "Apple", "Lasagna"};
       String[][] categories = {shows, videoGames, sportsTeams, animals, foods};
       int randomWord = (int)Math.random()* categories.length -1;
       System.out.println("Category: ");
       System.out.println("Number of Words: ");
       
       for (int i = 0; i < categories.length; i++) { // display hyphens (does not work)
           for (int j = 0; j < categories[i].length; i++ ) {
               if (categories[i][j].charAt(i)== ' ') {
                   System.out.println(" ");
               }
               else {
                   System.out.println("-"); 
               }
                   
           }
       }
       
      
    }   
}
/*
TO DO:
if the character is guessed correctly, show the letter on the screen
else if the character is guessed incorrectly, display another part of the body.
    Also decrement the number of guesses remaining
*/


/*
Displaying dashes for the string arrays:
use if(charAt(i) == '') function
*/
