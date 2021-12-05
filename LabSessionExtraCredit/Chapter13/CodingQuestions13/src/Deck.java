/**
 * Class for a deck of cards
 * @author Benjamin Man
 */
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	protected ArrayList<Card> cards = new ArrayList<Card>(); // array of cards

	// setters and getters
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void shuffle() {
		Collections.shuffle(cards); // shuffle deck
	}
	
	public void printCards() {
		for(Card card : cards) {
			card.printCard(); // print all cards
		}
	}
}
