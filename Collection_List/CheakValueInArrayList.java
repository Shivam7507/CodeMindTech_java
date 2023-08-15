package Collection_List;

import java.util.ArrayList;

public class CheakValueInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
	    list.add(48);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(10);
	    list.add(6);
	    list.add(8);


		int value = 8;

		boolean isExist = list.contains(value);

		if (isExist) 
		{
			System.out.println("The element exist in the ArrayList");
		} 
		else 
		{
			System.out.println("The element does not exist in the ArrayList");
		}
	}

}
