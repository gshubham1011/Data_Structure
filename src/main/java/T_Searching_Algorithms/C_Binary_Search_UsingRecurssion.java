package T_Searching_Algorithms;

public class C_Binary_Search_UsingRecurssion {
	 public static boolean BinarySearch(int[] a, int searchKey,int l,int h) {
		
		while(l<h) {
			int mid = (l+h)/2;
			if(a[mid]==searchKey) {
				return true;
			}else if (a[mid]>searchKey) {
				h=mid-1;
			}
			else if (a[mid]<searchKey) {
				l = mid+1;
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
