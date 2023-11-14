package T_Sort_Algothms;

import java.util.Arrays;

public class B_Selection_Sorts {
	
	static int[] a = {2,6,4,1,9,3};
	
	public static void Selection_Sort(int[] a) {
		int n =a.length;
		int temp;
		for(int i=0;i<n;i++) {
			for(int j =i;j<n;j++) {
				if(a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
				
		System.out.println(Arrays.toString(a));
		
		Selection_Sort(a);
		System.out.println(" After Sorting :  ");
		System.out.println(Arrays.toString(a));


	}

}
