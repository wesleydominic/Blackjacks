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
     private String rank;
    private String suit;
    
    public static final String [] SUITS = {"Spades","Clubs","Diamonds","Hearts"};
    public static final String [] RANKS = {"Ace","Two","Three","Four","Five","Six",
                                            "Seven","Eight","Nine","Ten","Jack","Queen","King"};
    
    private final String [][] values = {{"Ace","11"},{"Two","2"},{"Three","3"},{"Four","4"},
                                        {"Five","5"},{"Six","6"},{"Seven","7"},{"Eight","8"},
                                        {"Nine","9"},{"Ten","10"},{"Jack","10"},{"Queen","10"},
                                        {"King","10"}};    
    
    public Card(int rank, int suit){
        this.rank = Card.RANKS[rank];
        this.suit = Card.SUITS[suit];
    }
    
    public int getValue(){
        int result = 0;
        
        for(String[] value : values){
            if(this.rank.equals(value[0])){
                result = Integer.parseInt(value[1]);
            }
        }
        
        return result;
    }
    
    public String toString(){
        return this.rank + " of " + this.suit;
    }
}
//the Card class
    
   