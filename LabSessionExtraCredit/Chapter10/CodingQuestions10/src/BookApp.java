/*
 * Driver class to create books and test methods
 */
public class BookApp {

	public static void main(String[] args) { // main method
		Book books[][] = new Book[][] {
			{new Book("Harry Potter", 10, 5), new Book("Java", 1, 1)},
			{new Book("ABC", 2, 26), new Book("Blah", 3, 30)}
		};
		
		double sumPrices = 0;
		int sumQuantities = 0;
		int numBooks = 0;
		for(Book[] bookArray : books) { // loop through 2d array of books
			for(Book book : bookArray) {
				sumPrices += book.getPrice();
				sumQuantities += book.getQuantity();
				numBooks++;
			}
		}
		
		// print result
		System.out.println("Average price: " + sumPrices / numBooks);
		System.out.println("Average quantities: " + sumQuantities / numBooks);
	}

}
