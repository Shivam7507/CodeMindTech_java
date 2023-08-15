package Collection_List;
import java.util.*;
public class CopyArrayListToString {
	public static void main(String[] args) {
		ArrayList<String> parent = new ArrayList<>();
		parent.add("Vishal");
		parent.add("Chinmay");
		parent.add("Abhijit");
		parent.add("Pooja");
		parent.add("Shruti");
		parent.add("Shivam");
		System.out.println("Items in Parent are:-\n"+parent);
		ArrayList<String> chield = new ArrayList<>();
		for(String item : parent) {
			chield.add(item);
		}
		System.out.println("Items are copied in chield:-\n"+chield);
	}

}
