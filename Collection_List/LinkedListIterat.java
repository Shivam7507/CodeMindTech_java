package Collection_List;
import java.util.*;
public class LinkedListIterat {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Shivam");
		list.add("Shiv");
		list.add("Shivani");
		list.add("Shashank");
		System.out.println("Using Iterator:-");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------");
		System.out.println("Using For each loop:-");
		for(String item : list) {
			System.out.println(item);
		}
	}

}
