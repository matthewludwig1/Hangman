/*
    Matthew Ludwig
    5 March 2019
    This program compares the users guess to a radomly selected phrase in various
    categories
 */

package hangman2;

/**
 *
 * @author malud0519
 */

import javax.swing.*;
public class Hangman2 {

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
            for (int i = 0; i< categories.length; i++) { // iterates over categories array
                
                int randomCategory = (int)(Math.random() * categories.length -1);
                int randomSelection = (int)(Math.random() * randomCategory);
                String dash = "-";
                for (int j = 0; j < categories[i].length; j++) {  //iterates over the elements in the specific category
                    
                    if(!categories[i][j].equals("")) { // probably wrong
                        System.out.println("-");
                    }
                    else {
                        System.out.println("");
                    }
                    
                    if(categories[i][j].equals(guess.charAt(j))) {  //Could change to the math random int function above
                        
                    }
                
                }
            }
            
        }
        
    }
    
}
/*
Displaying dashes for the string arrays:
use if(charAt(i) == '') function
*/
