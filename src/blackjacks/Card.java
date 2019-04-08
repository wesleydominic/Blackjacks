/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacks;

/**
 *
 * @author dhruvil
 */
public class Card {
    
    public String rank;
    public String suit;
    
    
    public static final String [] SUITS = {"Spades","Clubs","Diamonds","Hearts"};
     public static final String [] RANKS = {"Ace","Two","Three","Four","Five","Six",
                                            "Seven","Eight","Nine","Ten","Jack","Queen","King"};
 
public int getValue(){
     int result = 0;
     return result;
}
public String toString(){
        return this.rank + " of " + this.suit ;
    }
    //this is my Card class
}
