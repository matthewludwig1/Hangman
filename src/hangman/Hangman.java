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
         
    }
    
}
