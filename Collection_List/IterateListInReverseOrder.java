package Collection_List;
import java.util.*;
public class IterateListInReverseOrder {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Vishal");
		list.add("Shiv");
		list.add("Abhi");
		list.add("Suraj");
		
		System.out.println("Using Iterator:-");
		Iterator<String> itr = list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Using For loop:-");
		for(int i = list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
		
	}

}
