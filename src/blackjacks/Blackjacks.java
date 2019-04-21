/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacks;
import java.util.Scanner;

/**
 *
 * @author Ayodeji
 */
public class Blackjacks {
    private final static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            String msg = new String();
            Deck deck = new Deck();

            Chip playerChip = new Chip();
            Hand player = new Hand(playerChip);

            Hand computer = new Hand();

            player.receiveCard(deck.deal());
            player.receiveCard(deck.deal());

            computer.receiveCard(deck.deal());
            computer.receiveCard(deck.deal());

            do {
                System.out.println("Your Cards: " + player.toString());
                System.out.println("Your Points: " + player.getPoints());

                System.out.print("Do you want to hit?(1/0):");
                int choice = s.nextInt();

                if (choice == 1) {
                    player.receiveCard(deck.deal());
                    if (player.getPoints() > 21) {
                        msg = "You busted, and lost";
                        break;
                    }
                } else {
                    break;
                }
            } while (true);

            while (computer.getPoints() < 17) {
                computer.receiveCard(deck.deal());
            }

            System.out.println("Your Cards: " + player.toString());
            System.out.println("Your Points: " + player.getPoints());

            System.out.println("Computer Cards: " + computer.toString());
            System.out.println("Computer Points: " + computer.getPoints());

            if (computer.getPoints() > 21) {
                if (player.getPoints() > 21) {
                    msg = "You and computer are busted, draw";
                } else {
                    msg = "Computer Busted, you win";
                }
            } else if (player.getPoints() > 21) {

            } else {
                switch (player.compareTo(computer)) {
                    case 0:
                        msg = "Draw";
                        break;
                    case 1:
                        msg = "You win";
                        break;
                    default:
                        msg = "You lost";
                        break;
                }
            }

            System.out.println(msg);
            
            System.out.println("Do you want to play again? (1/0):");
            int choice = s.nextInt();
            if (choice != 1) {
                break;
            }
        } while (true);

    }
    
    //the main class


   
    
}
