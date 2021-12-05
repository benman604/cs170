/**
 * Class for card data holding suit and value
 * @author Benjamin Man
 */

public class Card {
	protected String suit;
	protected String value;
	
	public Card(String suit, String value) { // constructor
		this.suit = suit;
		this.value = value;
	}
	
	// setters and getters
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void printCard() { // prints card name
		System.out.println(value + " of " + suit);
	}
}
