package T_Searching_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class E_JumpSearch {
	
	public static boolean JumpSearch(int[] a , int value) {	
		int blocksize = (int) Math.sqrt(a.length);
		System.out.println(blocksize);
		for(int i=0;i<blocksize;i++) {
			if(a[i*blocksize+(blocksize-1)]>=value) {
				for(int j=i*blocksize;j<=i*blocksize+(blocksize-1);j++) {
					if(a[j]==value)
						return true;
				}
			}
		}
		int n = blocksize*blocksize;
		if(n<a.length) {
			for(int i=n;i<a.length;i++) {
				if(a[i]==value)
					return true;
			}				
		}		
		return false;		
	}	

	public static void main(String[] args) {
		int[] arr = {1,2,4,7,8,9,10,12,16,20,22,24,30,34,38,40,42}; // Jump search also work with Sorted array
		List<Integer> l = new ArrayList<Integer>();
		System.out.println(" Binary Search Size :"+arr.length);
		System.err.println(" key found :"+JumpSearch(arr, 40));

	}

}
