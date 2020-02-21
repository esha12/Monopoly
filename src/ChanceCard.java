/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esha_umbarkar
 */
public class ChanceCard {
    private String card; //words card prints
    private int cardNum; //number of card for selection
    private String action; //what moves card does for player
    private int money; //how much money card gives/takes from player

    //constructor for chance card
    public ChanceCard(String c, int cN, String a, int m) {
        card = c;
        cardNum = cN;
        action = a;
        money = m;
    }

    //getter for card num
    public int getCardNum() {
        return cardNum;
    }

    //getter for action
    public String getAction() {
        return action;
    }

    //getter for money
    public int getMoney() {
        return money;
    }

    //getter for card
    public String getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Chance Card#" + cardNum + ": " + card + "\nThe player will move to spot#" + action + "\nChange in money: " + money;
    }
}

