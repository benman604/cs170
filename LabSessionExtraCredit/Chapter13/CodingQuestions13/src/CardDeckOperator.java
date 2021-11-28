import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CardDeckOperator extends Deck{
	ArrayList<String> suits = new ArrayList<String>(
			Arrays.asList("Clubs",
					"Diamonds",
					"Hearts",
					"Spades"));
	ArrayList<String> values = new ArrayList<String>(
			Arrays.asList("Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"));
	
	public CardDeckOperator() {
		for(String suit : suits) {
			for(String value : values) {
				Card card = new Card(suit, value);
				addCard(card);
			}
		}
	}
	
	public ArrayList<Deck> deckBySuit(){
		HashMap<String, Deck> map = new HashMap<>();
		for(String suit : suits) {
			map.put(suit, new Deck());
		}
		for(Card card : cards) {
			map.get(card.suit).addCard(card);
		}
		return new ArrayList<Deck>(map.values());
	}
	
	public ArrayList<Deck> shuffleToPlayers(int numPlayers){
		shuffle();
		ArrayList<Deck> decks = new ArrayList<Deck>();
		int increment = (int)(cards.size() / numPlayers)-1;
		for(int i=0; i<cards.size()-increment; i+=increment) {
			Deck mydeck = new Deck();
			mydeck.setCards(new ArrayList<Card>(cards.subList(i, i+increment)));
			mydeck.shuffle();
			decks.add(mydeck);
		}
		return decks;
	}
	
	public ArrayList<Integer> findAdjacentPair() {
		ArrayList<Integer> indicies = new ArrayList<Integer>();
		if(cards.get(0) == cards.get(1)) {
			indicies.add(0);
		}
		if(cards.get(cards.size()-1) == cards.get(cards.size()-2)) {
			indicies.add(cards.size());
		}
        for (int i=1; i<cards.size() - 2; i++) {
            if (cards.get(i).getValue() == cards.get(i + 1).getValue() && cards.get(i + 1).getValue() != cards.get(i + 2).getValue() && cards.get(i).getValue() != cards.get(i - 1).getValue()) {
                indicies.add(i);
            }
        }
        return indicies;
	}
}
