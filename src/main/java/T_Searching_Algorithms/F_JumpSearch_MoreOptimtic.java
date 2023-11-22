package T_Searching_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class F_JumpSearch_MoreOptimtic {
	
	public static boolean JumpSearch(int[] a , int value) {	
		int blocksize = (int) Math.sqrt(a.length);
		int start=0;
		int last = blocksize-1;
		while(a[last]<value && start < a.length) {
			start =last+1;
			last=last+blocksize;
			if(last>a.length-1) {
				last=a.length-1;
			}
		}
		for(int i=start;i<=last;i++) {
			if(a[i]==value)
				return true;
		}
		return false;		
	}	

	public static void main(String[] args) {
		int[] arr = {1,2,4,7,8,9,10,12,16,20,22,24,30,34,38,42}; // Jump search also work with Sorted array
		List<Integer> l = new ArrayList<Integer>();
		System.out.println(" Binary Search Size :"+arr.length);
		System.err.println(" key found :"+JumpSearch(arr, 40));

	}

}
