
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 *this class is used to set up all the logistics of the game
 */
/**
 *
 * @author esha_umbarkar
 */
public class PMonopoly {

    //instance variables
    private boolean gameOver;
    private final int OUT_OF_JAIL = 50;
    private static int potMoney = 0; //pot money from taxes
    private static Player p1;
    private static Player p2;
    static Player currentPlayer;
    static boolean isDoubles;
    private static ArrayList<Property> allP;
    private static int playerNum = 0;
    private static int rollValue;
    private static Player otherPlayer;
    private static final int RED = 3;
    private static final int YEL = 3;
    private static final int ORNG = 3;
    private static final int PINK = 3;
    private static final int LTBL = 3;
    private static final int BLUE = 2;
    private static final int GRN = 3;
    private static final int BRN = 2;
    private static final int RR = 4;
    private static String s;
    private static Property a;

    //constructor
    public PMonopoly() {
        allP = new ArrayList<Property>();
        isDoubles = false;
        potMoney = 0;
        p1 = new Player();
        p2 = new Player();
        currentPlayer = p1;
    }

    //returns player1
    public static Player getP1() {
        return p1;
    }

    //returns player2
    public static Player getP2() {
        return p2;
    }

    //initializes the players
    public void playerSetup() {
        try {
            Scanner kb = new Scanner(System.in);
            String name1 = JOptionPane.showInputDialog(null, "Enter Player 1's name:");
            String name2 = JOptionPane.showInputDialog(null, "Enter Player 2's name:");;
            p1 = new Player(name1);
            p2 = new Player(name2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error caught: " + e);
        }
        addP();
    }

    //returns array list with all the propertiesx
    public static ArrayList<Property> getAllP() {
        return allP;
    }

    //initialize properties
    static Property neale = new Property("Neale", 60, 2, 30, true, "brown", "", 1, 10, 9);
    static Property break1 = new Property("Break", -1, -1, -1, false, "", "", 2, 10, 8);
    static Property cohen = new Property("Cohen", 60, 4, 30, true, "brown", "", 3, 10, 7);
    static Property pantherShack = new Property("Panther Shack", -1, -1, -1, false, "taxes", "", 4, 10, 6);
    static Property gym = new Property("Gym", 200, 25, 100, true, "railroad", "", 5, 10, 5);
    static Property dubose = new Property("Dubose", 100, 6, 50, true, "light blue", "", 6, 10, 4);
    static Property break2 = new Property("Break", -1, -1, -1, false, "", "", 7, 10, 3);
    static Property o = new Property("O", 100, 6, 50, true, "light blue", "", 8, 10, 2);
    static Property carroll = new Property("Carroll", 120, 8, 60, true, "light blue", "", 9, 10, 1);
    static Property jail = new Property("Jail", -1, -1, -1, false, "", "", 10, 10, 0);
    static Property briggs = new Property("Briggs", 140, 12, 70, true, "pink", "", 11, 9, 0);
    static Property payTuition = new Property("Pay Tuition", -1, -1, -1, false, "taxes", "", 12, 8, 0);
    static Property payne = new Property("Payne", 140, 10, 70, true, "pink", "", 13, 7, 0);
    static Property hatzopoulos = new Property("Hatzopoulos", 160, 10, -1, true, "pink", "", 14, 6, 0);
    static Property field = new Property("Field", 200, 25, 100, true, "railroad", "", 15, 5, 0);
    static Property paige = new Property("Paige", 180, 14, 90, true, "orange", "", 16, 4, 0);
    static Property lunch1 = new Property("Lunch", -1, -1, -1, false, "", "", 17, 3, 0);
    static Property robotics = new Property("Robotics", 180, 14, 90, true, "orange", "", 18, 2, 0);
    static Property hemiup = new Property("Hemiup", 200, 16, -1, true, "orange", "", 19, 1, 0);
    static Property seniorParking = new Property("Senior Parking", -1, -1, -1, false, "", "", 20, 0, 0);
    static Property miu = new Property("Miu", 220, 18, 110, true, "red", "", 21, 0, 1);
    static Property break3 = new Property("Break", -1, -1, -1, true, "", "", 22, 0, 2);
    static Property faisal = new Property("Faisal", 220, 20, 110, true, "red", "", 23, 0, 3);
    static Property lee = new Property("Lee", 240, 18, 120, true, "red", "", 24, 0, 4);
    static Property pool = new Property("Pool", 200, 25, 100, true, "railroad", "", 25, 0, 5);
    static Property bessin = new Property("Bessin", 260, 22, 130, true, "yellow", "", 26, 0, 6);
    static Property trudelle = new Property("Trudelle", 260, 22, 130, true, "yellow", "", 27, 0, 7);
    static Property payForDance = new Property("Pay for Dance", -1, -1, -1, false, "", "", 28, 0, 8);
    static Property parker = new Property("Parker", 280, 24, 140, true, "yellow", "", 29, 0, 9);
    static Property wes = new Property("Wes", -1, -1, -1, false, "", "", 30, 0, 10);
    static Property studentCenter = new Property("Student Center", 300, 28, 150, true, "green", "", 31, 1, 10);
    static Property garden = new Property("Garden", 300, 26, 150, true, "green", "", 32, 2, 10);
    static Property lunch2 = new Property("Lunch", -1, -1, -1, false, "", "", 33, 3, 10);
    static Property cafeteria = new Property("Cafeteria", 320, 26, 160, true, "green", "", 34, 4, 10);
    static Property tennisCourt = new Property("Tennis Court", 200, 25, 100, true, "railroad", "", 35, 5, 10);
    static Property lunch3 = new Property("Lunch", -1, -1, -1, false, "", "", 36, 6, 10);
    static Property foundersHall = new Property("Founder's Hall", 350, 35, 175, true, "blue", "", 37, 7, 10);
    static Property payForPlayTickets = new Property("Play for Play Tickets", -1, -1, -1, false, "taxes", "", 38, 8, 10);
    static Property monastery = new Property("Monastery", 400, 50, 200, true, "blue", "", 39, 9, 10);
    static Property newSchoolDay = new Property("New School Day", -1, -1, -1, false, "", "", 40, 10, 10);

    //adds all properties to an array list
    public void addP() {
        allP.add(neale);
        allP.add(break1);
        allP.add(cohen);
        allP.add(pantherShack);
        allP.add(gym);
        allP.add(dubose);
        allP.add(break2);
        allP.add(o);
        allP.add(carroll);
        allP.add(jail);
        allP.add(briggs);
        allP.add(payTuition);
        allP.add(payne);
        allP.add(hatzopoulos);
        allP.add(field);
        allP.add(lunch1);
        allP.add(paige);
        allP.add(robotics);
        allP.add(hemiup);
        allP.add(seniorParking);
        allP.add(miu);
        allP.add(break3);
        allP.add(faisal);
        allP.add(lee);
        allP.add(pool);
        allP.add(bessin);
        allP.add(trudelle);
        allP.add(payForDance);
        allP.add(parker);
        allP.add(wes);
        allP.add(studentCenter);
        allP.add(garden);
        allP.add(lunch2);
        allP.add(cafeteria);
        allP.add(tennisCourt);
        allP.add(lunch3);
        allP.add(foundersHall);
        allP.add(payForPlayTickets);
        allP.add(monastery);
        allP.add(newSchoolDay);
    }

    //returns the property at the location of the current player
    public static Property getCurrentProperty(Player player) {
        Property a = neale;
        for (Property p : allP) {
            if (p.getLocation() == player.getLocation()) {
                a = p;
                return a;
            }
        }
        return a;
    }

//initialize community chest cards
    static CommunityChest one = new CommunityChest("You are assessed for street repairs: pay 40 per house and 115 per hotel you own", 1, "", 0);
    static CommunityChest two = new CommunityChest("From sale of stock, you get 50", 2, "", 50);
    static CommunityChest three = new CommunityChest("Advance to go. Collect 200", 3, "40", 0);
    static CommunityChest four = new CommunityChest("Doctor’s fees, pay 50", 4, "", -50);
    static CommunityChest five = new CommunityChest("Holiday fund matures, receive 100", 5, "", 100);
    static CommunityChest six = new CommunityChest("You inherit 100", 6, "", 100);
    static CommunityChest seven = new CommunityChest("Life insurance matures, collect 100", 7, "", 100);
    static CommunityChest eight = new CommunityChest("Go on a field trip, pay 50", 8, "", 50);
    static CommunityChest nine = new CommunityChest("Income tax refund, collect 20", 9, "", 20);
    static CommunityChest ten = new CommunityChest("Go Directly to Jail. Do not pass GO. Do not collect 200", 10, "", 0);
    static CommunityChest eleven = new CommunityChest("Hospital fees, pay 100", 11, "", -100);
    static CommunityChest twelve = new CommunityChest("Traffic ticket, pay 100", 12, "", -100);

    //method that rolls the dice
    public static int roll2Dice() {
        int a = (int) (Math.random() * 6 + 1);
        int b = (int) (Math.random() * 6 + 1);
        int sum = a + b;
        //extra credit: if you roll doubles, you get to go again
        if (a == b) {
            isDoubles = true;
        }
        return sum;
    }

    //puts pot value in player
    public static void isOnFreeParking(Player player) {
        if (player.getLocation() == 20) {
            player.updateBalance(potMoney);
            potMoney = 0;
            GuiGameboard.potMoneyVisual(potMoney);
        }
    }

    //moves player along gameboard according to values on dice
    public static void makeMove(Player player, int sumOfDice) {
        int newLocation = 1;
        if (player.getLocation() + sumOfDice > 40) {
            newLocation = (player.getLocation() + sumOfDice) - 40;
            player.setLocation(newLocation);
        } else {
            newLocation = player.getLocation() + sumOfDice;
            player.setLocation(newLocation);
        }
    }

    //checks for player's movement accross board
    public static boolean isPassGo(Player player, int rollValue) {
        if (player.getLocation() + rollValue >= 40) {
            return true;
        }
        return false;
    }

    //does "GO" action
    public static void passGo(Player player) {
        player.updateBalance(200);
        JOptionPane.showMessageDialog(null, "Congrats! You passed Go. Collect 200.");
    }

    //pays tax to the pot
    public static void payTax(Player player) {
        JOptionPane.showMessageDialog(null, "You must pay 200.");
        player.updateBalance(-200);
        //update pot value
        potMoney += 200;
        GuiGameboard.potMoneyVisual(potMoney);
    }

    //checks if player lands on tax location
    public static boolean isLandOnTax(Player player) {
        boolean y = false;
        if (player.getLocation() == 38 || player.getLocation() == 12 || player.getLocation() == 4 || player.getLocation() == 28) { //tax property locations
            y = true;
        }
        return y;
    }

    //sends player to jail
    public static void goToJail(Player player) {
        JOptionPane.showMessageDialog(null, "Go to jail!");
        player.setIsInJail(true);
        player.setLocation(10);
        GuiGameboard.makeVisualMove();
    }

    //this enacts the jail cost (50 dollars) and doesn't allow player to move
    public static void freeFromJail(Player player) {
        JOptionPane.showMessageDialog(null, "You payed 50 to get out of jail.");
        player.setCanRoll(true);
        player.updateBalance(-50);
        player.setIsInJail(false);
        player.setLocation(10);
        GuiGameboard.makeVisualMove();
    }

    //if player lands on community chest
    public static boolean isLandOnChest(Player player) {
        boolean y = false;
        if (player.getLocation() == 22 || player.getLocation() == 7 || player.getLocation() == 2) { //tax property locations
            y = true;
        }
        return y;
    }

    //does community chest card
    public static void doChest(Player player, CommunityChest chest) {

        player.updateBalance(chest.getMoney());
        JOptionPane.showMessageDialog(null, chest.toString());
        if (!(chest.getAction().equals(""))) {
            player.setLocation(Integer.parseInt(chest.getAction()));
            GuiGameboard.makeVisualMove();
        }
        if (chest.getCardNum() == 10) {
            goToJail(player);
        }
        if (chest.getCardNum() == 1) {
            int count = 0; //house count
            int hcount = 0; //hotel count
            for (int i = 0; i < player.getProperties().size(); i++) {
                count += player.getProperties().get(i).getNumHouses(); //counts total num of houses
                hcount += player.getProperties().get(i).getNumHotels(); //counts num of hotels
            }
            player.updateBalance((count * 40) + (hcount * 115));
        }

    }

    //checks whether someone has lost the game (they have a negativee balance, accounting for if they sold all their properties)
    public static boolean isGameOver() {
        int sum = 0;
        ArrayList<Property> properties = currentPlayer.getProperties();
        if (properties.isEmpty() == false) {
            for (Property p : properties) {
                sum += p.getResaleValue();
            }
        }
        if (currentPlayer.getBalance() + sum < 0) {
            return true;
        }
        return false;
    }

    //initialize chance cards
    static ChanceCard oneC = new ChanceCard("Advance to go. Collect $200", 1, "40", 0);
    static ChanceCard twoC = new ChanceCard("Advance to Monastery.", 2, "39", 0);
    static ChanceCard threeC = new ChanceCard("Speeding fine. Pay $15", 3, "", -15);
    static ChanceCard fourC = new ChanceCard("Bank pays you dividend of $50", 4, "", 50);
    static ChanceCard fiveC = new ChanceCard("Move 3 spaces backward", 5, "", 0);
    static ChanceCard sixC = new ChanceCard("Your building loan matures. Collect $150", 6, "", 150);
    static ChanceCard sevenC = new ChanceCard("Advance to Gym.", 7, "5", 0);
    static ChanceCard eightC = new ChanceCard("Go Directly to Jail. Do not pass GO. Do not collect 200", 8, "", 0);
    static ChanceCard nineC = new ChanceCard("You are assessed for street repairs: pay 40 per house and 115 per hotel you own", 9, "", 0);
    static ChanceCard tenC = new ChanceCard("Lenten Talents donation is due. Pay $20", 10, "", -20);
    static ChanceCard elevenC = new ChanceCard("Advance to Senior Parking.", 11, "20", 0);
    static ChanceCard twelveC = new ChanceCard("Your school laptop was stolen. Pay $100", 12, "", -100);

    //sells property
    public static void sellProperty() {
        try {
            String propertyName = JOptionPane.showInputDialog(null, "Enter the property you would like to sell:");
            for (int i = 0; i < currentPlayer.getProperties().size(); i++) {
                if (currentPlayer.getProperties().get(i).getName().equals(propertyName)) {
                    String s = currentPlayer.getProperties().get(i).getType(); //if statements make sure that the rent goes back to normal if a monopoly is split up wwhen selling
                    if ((s.equals("brown") && currentPlayer.getBrn())) {
                        Monopoly.setBackRent(brown);
                    }
                    if ((s.equals("light blue") && currentPlayer.getLtbl())) {
                        Monopoly.setBackRent(lightBlue);
                    }
                    if ((s.equals("pink") && currentPlayer.getPink())) {
                        Monopoly.setBackRent(pink);
                    }
                    if ((s.equals("orange") && currentPlayer.getOrng())) {
                        Monopoly.setBackRent(orange);
                    }
                    if ((s.equals("red") && currentPlayer.getRed())) {
                        Monopoly.setBackRent(red);
                    }
                    if ((s.equals("yellow") && currentPlayer.getYel())) {
                        Monopoly.setBackRent(yellow);
                    }
                    if ((s.equals("green") && currentPlayer.getGrn())) {
                        Monopoly.setBackRent(green);
                    }
                    if ((s.equals("blue") && currentPlayer.getBlue())) {
                        Monopoly.setBackRent(blue);
                    }
                    if ((s.equals("railroad") && currentPlayer.getRR())) {
                        Monopoly.setBackRent(railroad);
                    }
                    currentPlayer.sellProperty(currentPlayer.getProperties().get(i), currentPlayer);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error caught: " + e);
        }

    }

    //initialize monopoly objects
    static Monopoly brown = new Monopoly(neale, cohen);
    static Monopoly lightBlue = new Monopoly(dubose, o, carroll);
    static Monopoly pink = new Monopoly(briggs, payne, hatzopoulos);
    static Monopoly orange = new Monopoly(paige, robotics, hemiup);
    static Monopoly red = new Monopoly(lee, faisal, miu);
    static Monopoly yellow = new Monopoly(parker, trudelle, bessin);
    static Monopoly green = new Monopoly(studentCenter, garden, cafeteria);
    static Monopoly blue = new Monopoly(monastery, foundersHall);
    static Monopoly railroad = new Monopoly(field, gym, pool, tennisCourt);

   //checks if a given player has a type of monopoly
    public static boolean hasMonopoly(Player p, Monopoly m) {
        int prop = m.getProps().size();
        int count = 0;
        for (Property pr : m.getProps()) {
            for (int i = 0; i < p.getProperties().size(); i++) {
                if (p.getProperties().get(i).getName().equals(pr.getName())) {
                    count++;
                }
            }
            if (count == prop) {
                JOptionPane.showMessageDialog(null, "You have a monopoly!");
                return true;
            }
        }

        return false;
    }

    //determines which types of monopolies the given player has, if any
    public static void whichM(Player p) {

        if (hasMonopoly(p, brown)) {
            p.setBrn(true);
            JOptionPane.showMessageDialog(null, "You have a monopoly!");
        }
        if (hasMonopoly(p, lightBlue)) {
            p.setLtbl(true);
            JOptionPane.showMessageDialog(null, "You have a monopoly!");
        }
        if (hasMonopoly(p, pink)) {
            p.setPink(true);
            JOptionPane.showMessageDialog(null, "You have a monopoly!");
        }
        if (hasMonopoly(p, orange)) {
            p.setOrng(true);
            JOptionPane.showMessageDialog(null, "You have a monopoly!");
        }
        if (hasMonopoly(p, red)) {
            p.setRed(true);
            JOptionPane.showMessageDialog(null, "You have a monopoly!");
        }
        if (hasMonopoly(p, yellow)) {
            p.setYel(true);
            JOptionPane.showMessageDialog(null, "You have a monopoly!");
        }
        if (hasMonopoly(p, green)) {
            p.setGrn(true);
            JOptionPane.showMessageDialog(null, "You have a monopoly!");
        }
        if (hasMonopoly(p, blue)) {
            p.setBlue(true);
            JOptionPane.showMessageDialog(null, "You have a monopoly!");
        }
        if (hasMonopoly(p, railroad)) {
            p.setRR(true);
            JOptionPane.showMessageDialog(null, "You have a monopoly!");
        }
    }

    //doubles the rent for the property when the gieven player has a monopoly with it
    public static void mRent(Player p) {
        if (p.getBrn()) {
            Monopoly.rent(brown);
        }
        if (p.getLtbl()) {
            Monopoly.rent(lightBlue);
        }
        if (p.getPink()) {
            Monopoly.rent(pink);
        }
        if (p.getOrng()) {
            Monopoly.rent(orange);
        }
        if (p.getRed()) {
            Monopoly.rent(red);
        }
        if (p.getYel()) {
            Monopoly.rent(yellow);
        }
        if (p.getGrn()) {
            Monopoly.rent(green);
        }
        if (p.getBlue()) {
            Monopoly.rent(blue);
        }
        if (p.getRR()) {
            Monopoly.rent(railroad);
        }
    }

    //determines if player lands on chance
    public static boolean isLandOnChance(Player player) {
        boolean y = false;
        if (player.getLocation() == 17 || player.getLocation() == 33 || player.getLocation() == 36) { //tax property locations
            y = true;
        }
        return y;
    }

    //extra credit: does chance card
    public static void doChance(Player player, ChanceCard chance) {
        if (isLandOnChance(player) == true) {
            JOptionPane.showMessageDialog(null, chance.toString());
            player.updateBalance(chance.getMoney());
            if (!(chance.getAction().equals(""))) {
                player.setLocation(Integer.parseInt(chance.getAction()));
                GuiGameboard.makeVisualMove();
            }
            if (chance.getCardNum() == 5) {
                player.setLocation(player.getLocation() - 3);
                GuiGameboard.makeVisualMove();
            }
            if (chance.getCardNum() == 8) {
                goToJail(player);
            }
            if (chance.getCardNum() == 9) {
                int count = 0; //house count
                int hcount = 0; //hotel count
                for (int i = 0; i < player.getProperties().size(); i++) {
                    count += player.getProperties().get(i).getNumHouses(); //counts total num of houses
                    hcount += player.getProperties().get(i).getNumHotels(); //counts num of hotels
                }
                player.updateBalance((count * (-40)) + (hcount * (-115)));
            }
        }
    }

    //pays rent to owner of property if you land on a property that is owned
    public static void payRent() {
        //if p1 lands on p2
        for (Property p : p2.getProperties()) {
            if (p1.getLocation() == p.getLocation()) {
                p1.updateBalance(-p.getRent());
                p2.updateBalance(p.getRent());
            }
        }
        //if p2 lands on p1
        for (Property p : p1.getProperties()) {
            if (p2.getLocation() == p.getLocation()) {
                p2.updateBalance(-p.getRent());
                p1.updateBalance(p.getRent());
            }
        }
    }

    //extra credit: trading properties between players
    public static void trade() {
        try {
            Property tradeOffer = neale;
            Property tradeWant = neale;
            Player tradingPlayer = currentPlayer;
            Player acceptingPlayer;
            if (currentPlayer == p1) {
                acceptingPlayer = p2;
            } else {
                acceptingPlayer = p1;
            }
            String offer = JOptionPane.showInputDialog(null, "What do you want to trade from your properties?");
            for (Property pr : tradingPlayer.getProperties()) {
                if (pr.getName().equals(offer)) {
                    String want = JOptionPane.showInputDialog(null, "What do you want to trade for from the other player's?");
                    for (Property x : acceptingPlayer.getProperties()) {
                        if (x.getName().equals(want)) {
                            String decision = JOptionPane.showInputDialog(null, "Player who is being asked to trade: The other player wants to trade " + offer + " for " + want + ". Do you accept? Say 'yes' to trade.");
                            if (decision.equals("yes")) {
                                for (Property p : tradingPlayer.getProperties()) {
                                    if (p.getName().equals(offer)) {
                                        tradeOffer = p;
                                    }
                                }
                                for (Property p : acceptingPlayer.getProperties()) {
                                    if (p.getName().equals(want)) {
                                        tradeWant = p;
                                    }
                                }
                                tradingPlayer.getProperties().add(tradeWant);
                                tradingPlayer.getProperties().remove(tradeOffer);
                                acceptingPlayer.getProperties().add(tradeOffer);
                                acceptingPlayer.getProperties().remove(tradeWant);
                                GuiGameboard.updateVisualStats(p1);
                                GuiGameboard.updateVisualStats(p2);
                                for (int i = 0; i < tradingPlayer.getProperties().size(); i++) {
                                    String s = tradingPlayer.getProperties().get(i).getType();
                                    if ((s.equals("brown") && tradingPlayer.getBrn())) {
                                        Monopoly.setBackRent(brown);
                                    }
                                    if ((s.equals("light blue") && tradingPlayer.getLtbl())) {
                                        Monopoly.setBackRent(lightBlue);
                                    }
                                    if ((s.equals("pink") && tradingPlayer.getPink())) {
                                        Monopoly.setBackRent(pink);
                                    }
                                    if ((s.equals("orange") && tradingPlayer.getOrng())) {
                                        Monopoly.setBackRent(orange);
                                    }
                                    if ((s.equals("red") && tradingPlayer.getRed())) {
                                        Monopoly.setBackRent(red);
                                    }
                                    if ((s.equals("yellow") && tradingPlayer.getYel())) {
                                        Monopoly.setBackRent(yellow);
                                    }
                                    if ((s.equals("green") && tradingPlayer.getGrn())) {
                                        Monopoly.setBackRent(green);
                                    }
                                    if ((s.equals("blue") && tradingPlayer.getBlue())) {
                                        Monopoly.setBackRent(blue);
                                    }
                                    if ((s.equals("railroad") && tradingPlayer.getRR())) {
                                        Monopoly.setBackRent(railroad);
                                    }
                                }
                                for (int j = 0; j < acceptingPlayer.getProperties().size(); j++) {
                                    String s = acceptingPlayer.getProperties().get(j).getType();
                                    if ((s.equals("brown") && acceptingPlayer.getBrn())) {
                                        Monopoly.setBackRent(brown);
                                    }
                                    if ((s.equals("light blue") && acceptingPlayer.getLtbl())) {
                                        Monopoly.setBackRent(lightBlue);
                                    }
                                    if ((s.equals("pink") && acceptingPlayer.getPink())) {
                                        Monopoly.setBackRent(pink);
                                    }
                                    if ((s.equals("orange") && acceptingPlayer.getOrng())) {
                                        Monopoly.setBackRent(orange);
                                    }
                                    if ((s.equals("red") && acceptingPlayer.getRed())) {
                                        Monopoly.setBackRent(red);
                                    }
                                    if ((s.equals("yellow") && acceptingPlayer.getYel())) {
                                        Monopoly.setBackRent(yellow);
                                    }
                                    if ((s.equals("green") && acceptingPlayer.getGrn())) {
                                        Monopoly.setBackRent(green);
                                    }
                                    if ((s.equals("blue") && acceptingPlayer.getBlue())) {
                                        Monopoly.setBackRent(blue);
                                    }
                                    if ((s.equals("railroad") && acceptingPlayer.getRR())) {
                                        Monopoly.setBackRent(railroad);
                                    }
                                }
                                whichM(p1);
                                mRent(p1);
                                whichM(p2);
                                mRent(p2);
                                JOptionPane.showMessageDialog(null, "Congrats! You made a successful trade!");
                                return;
                            } else {
                                JOptionPane.showMessageDialog(null, "Sorry player that requested to trade, the other player did not accept your offer.");
                                return;
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Invalid Input");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error caught: " + e);
        }

    }

    //combines the methods to play the game
    public static void play() {
        playerNum++;
        if (!isGameOver()) {

            if (playerNum % 2 == 1) {
                currentPlayer = p1;
                GuiGameboard.changePlayerVisualP2();
            } else {
                currentPlayer = p2;
                GuiGameboard.changePlayerVisualP1();
            }
            if (!currentPlayer.getIsInJail()) {
                rollValue = roll2Dice();
                GuiGameboard.displayRoll(rollValue);
                if (playerNum != 1 && playerNum != 2) {
                    if (isPassGo(currentPlayer, rollValue)) {
                        passGo(currentPlayer);
                    }
                }
                makeMove(currentPlayer, rollValue);
                GuiGameboard.makeVisualMove();
                isOnFreeParking(currentPlayer);
                if (isLandOnTax(currentPlayer)) {
                    payTax(currentPlayer);
                }
                if (isLandOnChest(currentPlayer)) {
                    CommunityChest c = one;
                    int chest = (int) (1 + Math.random() * 12);
                    switch (chest) {
                        case 1:
                            c = one;
                            break;
                        case 2:
                            c = two;
                            break;
                        case 3:
                            c = three;
                            break;
                        case 4:
                            c = four;
                            break;
                        case 5:
                            c = five;
                            break;
                        case 6:
                            c = six;
                            break;
                        case 7:
                            c = seven;
                            break;
                        case 8:
                            c = eight;
                            break;
                        case 9:
                            c = nine;
                            break;
                        case 10:
                            c = ten;
                            break;
                        case 11:
                            c = eleven;
                            break;
                        case 12:
                            c = twelve;
                            break;
                    }
                    doChest(currentPlayer, c);
                }
                if (isLandOnChance(currentPlayer)) {
                    ChanceCard c = oneC;
                    int chance = (int) (1 + Math.random() * 12);
                    switch (chance) {
                        case 1:
                            c = oneC;
                            break;
                        case 2:
                            c = twoC;
                            break;
                        case 3:
                            c = threeC;
                            break;
                        case 4:
                            c = fourC;
                            break;
                        case 5:
                            c = fiveC;
                            break;
                        case 6:
                            c = sixC;
                            break;
                        case 7:
                            c = sevenC;
                            break;
                        case 8:
                            c = eightC;
                            break;
                        case 9:
                            c = nineC;
                            break;
                        case 10:
                            c = tenC;
                            break;
                        case 11:
                            c = elevenC;
                            break;
                        case 12:
                            c = twelveC;
                            break;
                    }
                    doChance(currentPlayer, c);
                }
                payRent();
                //jail
                if (currentPlayer.getLocation() == 30) {
                    goToJail(currentPlayer);
                }
                if (currentPlayer.getIsInJail()) {
                    currentPlayer.setCanRoll(false);
                }
                //if they rolled doubles player goes again
                if (isDoubles) {
                    playerNum--;
                    if (currentPlayer == p1) {
                        GuiGameboard.changePlayerVisualP1();
                    } else {
                        GuiGameboard.changePlayerVisualP2();
                    }
                    JOptionPane.showMessageDialog(null, "You rolled doubles! You get to go again.");
                    isDoubles = false;
                }
            } else {
                freeFromJail(currentPlayer);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Oh no! You've gone bankrupt. You lose.");
            System.exit(0);
        }
    }

}
