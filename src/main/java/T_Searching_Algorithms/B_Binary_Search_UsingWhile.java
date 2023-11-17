package T_Searching_Algorithms;

public class B_Binary_Search_UsingWhile {
	 public static boolean BinarySearch(int[] a, int searchKey,int low,int high) {
		if(low<high) {
			 int mid = (low+high)/2;
			 if(a[mid]==searchKey) {
				 return true;
			 }else if (a[mid]>searchKey) {
				high = mid-1;
				BinarySearch(a,searchKey,low,high);
			}else
			 {
				 low = mid+1;
				 BinarySearch(a,searchKey,low,high);
	
			 }
		}		 
		  return false;
	 }

	public static void main(String[] args) {
		int[] arr = {1,2,5,7,8,10};
		System.out.println(" Binary Search");
		System.err.println(" key found :"+BinarySearch(arr,7,0,(arr.length)));
		

	}

}
