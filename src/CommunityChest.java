/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esha_umbarkar
 */
public class CommunityChest {
     private String card; //words card prints
     private int cardNum; //number of card for selection
     private String action; //what moves card does for player
     private int money; //how much money card gives/takes from player
             
    public CommunityChest(String c, int cN, String a, int m){
        card = c;
        cardNum = cN;
        action = a;
        money = m;
    }
    
    //returns card number
    public int getCardNum(){
        return cardNum;
    }
    
    //returns change in balance
    public int getMoney(){
        return money;
    }
    
    //returns movement/action to anywhere
    public String getAction(){
        return action;
    }
    
    //returns which card it was
    public String getCard(){
        return card;
    }
    
    public String toString(){
        return "Community Chest Card#" + cardNum+ ": "+ card+"\nThe player will move to spot#" + action + "\nChange in money: "+money;
    }
}
