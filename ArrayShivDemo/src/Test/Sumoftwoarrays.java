package Test;

public class Sumoftwoarrays {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {0,0,2,1,3,5,2};

        int[] SumOfArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) 
        {
            SumOfArray[i] = array1[i] + array2[i];
        }
        
        for (int i = 0; i < SumOfArray.length; i++) 
        {
           System.out.println(SumOfArray[i]);
        }
	}

}
