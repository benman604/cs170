import java.util.Scanner;

public class CardDeckOperatorApp {
	public static void main(String args[]) {
		CardDeckOperator deck = new CardDeckOperator();
		System.out.println("Shuffling...");
		deck.shuffle();
		deck.printCards();
		System.out.println("Decking by suit...");
		for(Deck d : deck.deckBySuit()) {
			System.out.println("____________");
			d.printCards();
		}
		
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
		
		System.out.println("Finding adjacent pairs...");
		for(int index : deck.findAdjacentPair()) {
			System.out.print(index + ", ");
		}
	}
}
