/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacks;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ayodeji
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {

                deck.add(new Card());

            }
        }

        this.shuffle();
    }

    public Card deal() {

        return deck.remove(0);

    }

    private void shuffle() {
        Collections.shuffle(deck);
    }

    public String toString() {
        return deck.toString();

    }
}

//this is Deck Class

