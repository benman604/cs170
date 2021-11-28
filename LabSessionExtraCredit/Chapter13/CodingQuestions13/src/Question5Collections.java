import java.util.ArrayList;
import java.util.LinkedList;

public class Question5Collections {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>(100);
		for(String str : strings) {
			strings.add("Java");
		}
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0; i<10; i++) {
			list.add((i+1) * 10);
		}
		
		list.add(1000);
		@SuppressWarnings("unchecked")
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
