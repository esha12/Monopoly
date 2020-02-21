/*
 * this class is used to run the program
 */

/**
 *
 *  @author esha_umbarkar
 * Project 2: Monopoly
 * 2/27/18
 */
public class Tester {
    public static void main(String[] args) {
        PMonopoly test = new PMonopoly(); //creates new PMonopoly game
        test.playerSetup(); //sets up the players and initializes basic things
        GuiGameboard game = new GuiGameboard(); //initializes the gui board
    }
}
 