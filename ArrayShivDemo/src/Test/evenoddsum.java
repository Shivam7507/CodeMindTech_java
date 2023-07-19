package Test;
import java.util.*;
public class evenoddsum {

	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int num[]=new int[7];
			System.out.println("Enter elements of an array");
			for(int i = 0 ; i<num.length; i++) {
				num[i]=sc.nextInt();
			}
			int sumofeven=0;
			int sumofodd=0;
			
			for(int n : num) {
				if(n%2==0) {
					sumofeven+=n;
				}
				else {
					sumofodd+=n;
				}
			}
			System.out.println("Sum of even no: " + sumofeven);
	        System.out.println("Sum of odd no: " + sumofodd);
		}

	


}
