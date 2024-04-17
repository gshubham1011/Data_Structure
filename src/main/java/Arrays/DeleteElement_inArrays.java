package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElement_inArrays {

	
	public static void main(String args[]) {
		
		int[] a = {1,5,3,7,9,4};
		ArrayList<Integer> arr_new = new ArrayList<Integer>();
		
		for (int i : a)
        {
            arr_new.add(i);
        }
		arr_new.remove("3");
		System.out.println( " Arrays :"+arr_new);
		
	}
}
