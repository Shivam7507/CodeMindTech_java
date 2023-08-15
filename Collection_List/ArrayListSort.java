package Collection_List;
import java.util.*;
public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<>();
		test.add(9);
		test.add(4);
		test.add(6);
		test.add(5);
		test.add(10);
		test.add(11);
		test.add(1);
		test.add(7);
		System.out.println("Befor sorting : "+test);
		Collections.sort(test);
		System.out.println("After sorting : "+test);
	}

}
