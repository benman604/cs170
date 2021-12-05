/**
 * Driver class to create ArrayLists and test methods of Collections
 * @author Benjamin Man
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Question5Collections {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>(100);
		for(String str : strings) {
			strings.add("Java"); // add Java to all values in strings
		}
		
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		for(int i=0; i<10; i++) {
			list.add((i+1) * 10); // add multiples of 10 to linked list
		}
		
		list.add(1000);
		@SuppressWarnings("unchecked")
		// test different methods of list (collection)
		LinkedList<Integer> cloned = (LinkedList<Integer>) list.clone();
		list.remove(1);
		list.add(5, 100);
		list.addAll(0, cloned);
		list.removeLast();
		list.removeFirst();
		
		for(int i : list) {
			System.out.println(i);
		}
		list.clear();
	}
	
}
