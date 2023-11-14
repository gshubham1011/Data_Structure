package T_Sort_Algothms;

import java.util.Arrays;

public class A_Bubble_Sorts {
	
	static int[] a = {2,6,4,1,9,3};
	
	public static void BubbleSort(int[] a) {
		int n =a.length;
		int temp;
		for(int i=0;i<n;i++) {
			for(int j =1;j<n-i;j++) {
				if(a[j]<a[j-1]) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
				
		System.out.println(Arrays.toString(a));
		
		BubbleSort(a);
		System.out.println(" After Sorting :  ");
		System.out.println(Arrays.toString(a));


	}

}
