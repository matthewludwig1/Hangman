/*
    Matthew Ludwig
    18 March 2019
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
      
       String category = categories[(int)Math.random()][(int)Math.random()];
       String word = categories[Integer.parseInt(category)][(int)Math.random()];
       System.out.println("Category: " + category);
       System.out.println("Number of Words: ");
       
       String shownWord = " ";
       for (int i = 0; i < categories.length; i++) { // display hyphens
           shownWord += "-";
       }
        System.out.println(shownWord); // only displays a fixed amount of hyphens

    }
}

/*
TO DO:
if the character is guessed correctly, show the letter on the screen
else if the character is guessed incorrectly, display another part of the body.
    Also decrement the number of guesses remaining
*/


