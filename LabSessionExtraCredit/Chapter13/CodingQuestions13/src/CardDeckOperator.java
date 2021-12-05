/**
 * Operation class for card deck operations
 * @author Benjamin Man
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CardDeckOperator extends Deck{
	private ArrayList<String> suits = new ArrayList<String>( // all possible suits
			Arrays.asList("Clubs",
					"Diamonds",
					"Hearts",
					"Spades"));
	private ArrayList<String> values = new ArrayList<String>( // all possible values
			Arrays.asList("Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"));
	
	public CardDeckOperator() { // constructor
		for(String suit : suits) { // loop through all suits and values to create every combination, add to deck
			for(String value : values) {
				Card card = new Card(suit, value);
				addCard(card);
			}
		}
	}
	
	public ArrayList<Deck> deckBySuit(){ // returns 4 decks containing all suits
		HashMap<String, Deck> map = new HashMap<>();
		for(String suit : suits) {
			map.put(suit, new Deck()); // create empty element in hashmap with suit name
		}
		for(Card card : cards) {
			map.get(card.suit).addCard(card); // add card to its suit in hashmap
		}
		return new ArrayList<Deck>(map.values());
	}
	
	public ArrayList<Deck> shuffleToPlayers(int numPlayers){ // distributes decks of cards to player
		shuffle(); // shuffle current deck
		ArrayList<Deck> decks = new ArrayList<Deck>(); 
		int increment = (int)(cards.size() / numPlayers)-1; // size of each deck
		for(int i=0; i<cards.size()-increment; i+=increment) {
			Deck mydeck = new Deck();
			mydeck.setCards(new ArrayList<Card>(cards.subList(i, i+increment))); // add cards of sliced deck to player deck
			mydeck.shuffle(); // shuffle player deck
			decks.add(mydeck);
		}
		return decks;
	}
	
	public ArrayList<Integer> findAdjacentPair() { // returns array of indices of adjacent pairs 
		ArrayList<Integer> indicies = new ArrayList<Integer>();
		if(cards.get(0).getValue() == cards.get(1).getValue()) { // index 0 and 1 have same value
			indicies.add(0);
		}
		if(cards.get(cards.size()-1).getValue() == cards.get(cards.size()-2).getValue()) { // last and second to last have same value
			indicies.add(cards.size()-1);
		}
        for (int i=1; i<cards.size() - 2; i++) {
            if (cards.get(i).getValue() == cards.get(i + 1).getValue() && cards.get(i + 1).getValue() != cards.get(i + 2).getValue() && cards.get(i).getValue() != cards.get(i - 1).getValue()) {
                indicies.add(i); // current index and next have same value
            }
        }
        return indicies;
	}
}
