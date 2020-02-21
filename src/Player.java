
import java.util.ArrayList;

/*
 * this class sets up all the major aspects of the player in the monopoly game 
   also includes methods to access and modify the main aspects

 */
/**
 * @author esha_umbarkar Project 2: Monopoly 2/27/18
 */
public class Player {

    private String name; //name of player
    private double balance; //balance of player
    private ArrayList<Property> properties; //total list of properties player owns
    private int location; //location of player on board corresponding to the location for the properties
    private static boolean canRoll; //true = can roll, false = cannot roll (turn direction purposes)
    private boolean isInJail; //true = is in jail, false = is not in jail 
    private boolean brnM = false;
    private boolean ltblM = false;
    private boolean pinkM = false;
    private boolean orngM = false;
    private boolean redM = false;
    private boolean yelM = false;
    private boolean grnM = false;
    private boolean blueM = false;
    private boolean rrM = false;

    public void setBrn(boolean b) {
        brnM = b;
    }

    public void setLtbl(boolean b) {
        ltblM = b;
    }

    public void setPink(boolean b) {
        pinkM = b;
    }

    public void setOrng(boolean b) {
        orngM = b;
    }

    public void setRed(boolean b) {
        redM = b;
    }

    public void setYel(boolean b) {
        yelM = b;
    }

    public void setGrn(boolean b) {
        grnM = b;
    }

    public void setBlue(boolean b) {
        blueM = b;
    }

    public void setRR(boolean b) {
        rrM = b;
    }

    public boolean getBrn() {
        return brnM;
    }

    public boolean getLtbl() {
        return ltblM;
    }

    public boolean getPink() {
        return pinkM;
    }

    public boolean getOrng() {
        return orngM;
    }

    public boolean getRed() {
        return redM;
    }

    public boolean getYel() {
        return yelM;
    }

    public boolean getGrn() {
        return grnM;
    }

    public boolean getBlue() {
        return blueM;
    }

    public boolean getRR() {
        return rrM;
    }

    public Player() {
        this.balance = 1500;
        this.name = "";
        this.properties = new ArrayList<Property>();
        this.location = 40;
        this.canRoll = true;
    }

    public Player(String name) {
        this.balance = 1500;
        this.name = name;
        this.properties = new ArrayList<Property>();
        this.location = 40;
        this.canRoll = true;
    }

    //gets balance
    public double getBalance() {
        return balance;
    }

    //this updates the selected players balance
    public void updateBalance(double update) {
        balance += update;
        GuiGameboard.updateVisualStats(PMonopoly.currentPlayer);
    }

    //getter for isInJail
    public boolean getIsInJail() {
        return isInJail;
    }

    //setter for isInJail
    public void setIsInJail(boolean newIsInJail) {
        isInJail = newIsInJail;
    }

    //getter for can roll
    public static boolean getCanRoll() {
        return canRoll;
    }

    //setter for can roll
    public void setCanRoll(boolean newCanRoll) {
        canRoll = newCanRoll;
    }

    //gets property list
    public ArrayList<Property> getProperties() {
        return properties;
    }

    //this buys properties and reassigns owner 
    public void buyProperty(Property newP) {
        properties.add(newP);
        newP.setOwner(name);
        newP.setIsBuyable(false);
        updateBalance(-1 * newP.getPrice());
        GuiGameboard.updateVisualStats(PMonopoly.currentPlayer);
        PMonopoly.whichM(PMonopoly.currentPlayer);
        PMonopoly.mRent(PMonopoly.currentPlayer);
    }

    //this sells properties and reassigns owner 
    public void sellProperty(Property oldP, Player p) {
        System.out.println("REEEE " + oldP.getResaleValue());
        updateBalance(oldP.getResaleValue());
        oldP.setIsBuyable(true);
        oldP.setOwner(null);
        p.properties.remove(oldP);
        GuiGameboard.updateVisualStats(PMonopoly.currentPlayer);
    }

    //getter method for location
    public int getLocation() {
        return location;
    }

    //setter method for location
    public void setLocation(int newLocation) {
        location = newLocation;
    }

    //returns the name of the player
    public String getName() {
        return name;
    }

    //prints out the player with all the necessary info
    public String toString() {
        return "Player: " + name + "\nBalance: " + balance + "\nProperties: " + properties;
    }

}
