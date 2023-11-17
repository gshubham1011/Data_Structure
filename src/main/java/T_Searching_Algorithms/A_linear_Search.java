package T_Searching_Algorithms;

public class A_linear_Search {
	 public static boolean linearSearch(int[] a, int searchKey) {
		 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==searchKey) {
				 return true;
			 }
		 }		 
		 return false;
	 }

	public static void main(String[] args) {
		int[] arr = {1,3,5,2,6,8};
		System.err.println(" key found :"+linearSearch(arr,10));
		

	}

}
