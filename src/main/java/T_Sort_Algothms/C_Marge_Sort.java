package T_Sort_Algothms;

import java.util.Arrays;

public class C_Marge_Sort {

	public static void sort(int[] a) { // log(n) time complexity 
		
		//Divide 
		if(a.length<2)
			return; 		
		int middle = a.length/2;
		int[] leftarr = new int[middle];
		int[] rightarr = new int[a.length-middle];
		
		for(int i=0;i<middle;i++) {
			leftarr[i]=a[i];
		}
		for(int i=middle;i<a.length;i++) {
			rightarr[i-middle] = a[i];
		}
		sort(leftarr);
		sort(rightarr);		
		//Marge the Result 
		marge(leftarr,rightarr,a);
		
	}
	public static void marge(int[] larr,int[] Rarr,int[] a ) { // n complexity as in worst case l or R array might be n
		int i=0,j=0,k=0;
		while(i<larr.length && j<Rarr.length) {
			if(larr[i]<=Rarr[j]) {
				a[k]=larr[i];
				k++;i++;
			}else {
				a[k]=Rarr[j];
				k++;j++;
			}
		}
		while(i<larr.length) {
			a[k]=larr[i];
			k++;i++;
		}
		while(j<Rarr.length) {
			a[k]=Rarr[j];
			k++;j++;
		}
	}
	
	
	public static void main(String[] args) {

        int[] arr= {4,1,7,5,9,0};
        sort(arr);  // total time complexity is n(log n)
        System.out.println(Arrays.toString(arr));

	}

}
