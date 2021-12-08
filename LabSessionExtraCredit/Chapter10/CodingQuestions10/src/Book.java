/*
 * Data class to store values of books
 * @author Benjamin Man
 */
public class Book {
	private String name;
	private double price;
	private int quantity;
	
	public Book(String name, double price, int quantity) { // constructor
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
