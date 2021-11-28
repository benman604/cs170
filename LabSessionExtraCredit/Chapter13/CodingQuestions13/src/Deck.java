import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	protected ArrayList<Card> cards = new ArrayList<Card>();

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
		Collections.shuffle(cards);
	}
	
	public void printCards() {
		for(Card card : cards) {
			System.out.println(card.value + " of " + card.suit);
		}
	}
}
