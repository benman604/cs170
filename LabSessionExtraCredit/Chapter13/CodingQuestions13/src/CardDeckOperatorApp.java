/**
 * Driver class for card deck operations
 * @author Benjamin Man
 */

import java.util.Scanner;

public class CardDeckOperatorApp { 
	public static void main(String args[]) { // main method
		CardDeckOperator deck = new CardDeckOperator();
		
		// shuffle and print
		System.out.println("Shuffling...");
		deck.shuffle();
		deck.printCards();
		
		// deck by suit and print each deck
		System.out.println("Decking by suit...");
		for(Deck d : deck.deckBySuit()) {
			System.out.println("____________");
			d.printCards();
		}
		
		
		// get players, split accordingly, print each player's deck
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("How many players? (2 or 4) > ");
			int input = sc.nextInt();
			if(input == 2 || input == 4) {
				int player = 1;
				for(Deck playerDeck : deck.shuffleToPlayers(input)) {
					System.out.println("--- Player " + player + "'s deck ---");
					playerDeck.printCards();
					player++;
				}
				break;
			}
			else {
				System.out.println("Please enter 2 or 4");
			}
		}
		sc.close();
		
		// find adjacent pairs
		System.out.println("Finding adjacent pairs...");
		for(int index : deck.findAdjacentPair()) {
			System.out.print(index + ", ");
			deck.getCards().get(index).printCard();
			System.out.print(index + 1 + ", ");
			deck.getCards().get(index + 1).printCard();
			System.out.println();
		}
	}
}
