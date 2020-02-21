
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 *this class sets up each property
 */
/**
 *
 * @author esha_umbarkar Project 2: Monopoly 2/27/18
 */
public class Property {

    private String name = null; //name of property
    private int price; //initial buy price
    private int rent; //price when someone lands on property AND is owned by other player
    private int resaleValue; //morgage value
    private boolean isBuyable; //can it be bought? (eighther unbuyable square or someone already owns it)
    private String type; //subject
    private String owner; //which player owns this property
    private int numHotels = 0; //number of hotels on property
    private int numHouses = 0; //humber of houses on property
    private int location; //location number of property
    private int i;
    private int j;

//default constructer
    public Property(String name, int price, int rent, int resaleValue, boolean isBuyable, String type, String owner, int location, int i, int j) {
        this.name = name;
        this.price = price;
        this.rent = rent;
        this.resaleValue = resaleValue;
        this.isBuyable = isBuyable;
        this.type = type;
        this.owner = owner;
        this.location = location;
        this.i = i;
        this.j = j;
    }

    //setter method for isBuyable
    public void setIsBuyable(boolean isBuyable) {
        this.isBuyable = isBuyable;
    }

    //returns i, the property's row position on the gameboard
    public int getI() {
        return i;
    }

    //returns j, the property's column position on the gameboard
    public int getJ() {
        return j;
    }

    //setter method for owner (Talked to Kaela about using String instead of Player)
    public void setOwner(String owner) {
        this.owner = owner;
    }

    //setter method for num hotels
    public void setNumHotels(int h) {
        numHotels = h;
    }

    public void setRent(int r) {
        rent = r;
    }

    //divides rent by 2 (in eevent that monopoly is split)
    public void setBeforeMRent(Property p) {
        rent = rent / 2;
    }

    //setter method for num hotels
    public void setNumHouses(int h) {
        numHouses = h;
    }

    //getter method for numHotels
    public int getNumHotels() {
        return numHotels;
    }

    //getter method for numHouses
    public int getNumHouses() {
        return numHouses;
    }

    //getter method for name
    public String getName() {
        return name;
    }

    //getter method for price
    public int getPrice() {
        return price;
    }

    //getter method for rent
    public int getRent() {
        return rent;
    }

    //getter method for baseValue
    public int getResaleValue() {
        return resaleValue;
    }

    //getter method for isBuyable
    public boolean getIsBuyable() {
        return isBuyable;
    }

    //getter method for owner (Talked to Kaela about using String instead of Player)
    public String getOwner() {
        return owner;
    }

    //getter method for type
    public String getType() {
        return type;
    }

    //getter method for location
    public int getLocation() {
        return location;
    }

    //prints the names of athe properties of a giveen player as a long string
    public static String printPropNames(Player p) {
        String s = "";
        for (Property pr : p.getProperties()) {
            s += pr.getName();
            s += ", ";
        }
        return s;
    }

    //prints out a Property
    public String toString() {
        return "Property: " + name
                + "\nPrice: " + price
                + "\nRent Price: " + rent
                + "\nBase Value: " + resaleValue
                + "\nIs Buyable: " + isBuyable
                + "\nType: " + type
                + "\nOwner: " + owner;
    }

}
