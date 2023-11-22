package T_Searching_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class D_Binary_Search_InBuiltMethod {
	

	public static void main(String[] args) {
		int[] arr = {1,2,4,7,8,10};
		List<Integer> l = new ArrayList<Integer>();
		System.out.println(" Binary Search");
		System.err.println(" key found :"+Arrays.binarySearch(arr, 7));
		System.err.println(" key found :"+Collections.binarySearch(l, 5));


	}

}
