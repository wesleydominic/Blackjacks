
package blackjacks;


import java.util.ArrayList;

/**
 *
 * @author ayodeji
 */
public class Hand implements Comparable<Hand> {

    //Hand a =new Hand();
    protected int points;
    private int chips;
    private int aces;
    private ArrayList<Card> totalCards = new ArrayList<Card>();

    public void receiveCard(Card card) {
        totalCards.add(card);
        this.points += card.getValue();
        
        if(card.toString().contains("Ace")){
            this.aces += 1;
        }
        
        while(this.points > 21 && this.aces > 0){
            this.points -= 10;
            this.aces -= 1;
        }
    }

    public Hand() {

    }

    public Hand(Chip chip) {

    }
    
    public int getPoints(){
        return this.points;
    }

    public String toString() {
        return this.totalCards.toString();
    }

    public int compareTo(Hand hand) {
        int result = 0;

        if (this.points == hand.points) {
            result = 0;
        } else if (this.points >= hand.points) {
            result = 1;
        } else if (this.points <= hand.points) {
            result = -1;
        }

        return result;
    }
}
//hand class implemented
     