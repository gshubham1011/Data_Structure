package T_Sort_Algothms;

import java.util.Arrays;

public class E_Quick_Sort_HighIndex { // This is another techniqe but with error in logic ... need to look 
	 
	  static void quickSort(int[] array, int lowIndex, int highIndex) {
	    if (lowIndex < highIndex) {
	      int partitionIndex = partition(array, lowIndex, highIndex);
	      System.out.println(" partition index  :"+partitionIndex    + " Array :"+Arrays.toString(array));
	      quickSort(array, lowIndex, partitionIndex - 1);
	      quickSort(array, partitionIndex + 1, highIndex);
	    }
	  }
	 
	  static int partition(int[] array, int lowIndex, int highIndex) {
		  int pivot= array[highIndex];
		  int i=lowIndex;int j=highIndex-1;
		  while(i<j) {
			  while(array[i]<pivot) {
				  i++;
			  }
			  while(array[j]>=pivot) {				  
				     j--;
			  }
			  if(i<j) {
			    swap(array, i, j);			    
			  }		
		  }	  
		  swap(array, i, highIndex);
		  
		  return i;
		  }
	 
	  static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }
	 
	  public static void main(String[] args) {
	    int[] array = {10, 3, 2};  //, 0, 9, 7,20};
	    int n = array.length;
	 
	    quickSort(array, 0, n - 1);
	    System.out.println(Arrays.toString(array));
	  }
}
