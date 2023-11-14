package T_Sort_Algothms;

import java.util.Arrays;

public class D_Quick_Sort_HighIndex {
	 
	  static void quickSort(int[] array, int lowIndex, int highIndex) {
	    if (lowIndex < highIndex) {
	      int partitionIndex = partition(array, lowIndex, highIndex);
	 
	      quickSort(array, lowIndex, partitionIndex - 1);
	      quickSort(array, partitionIndex + 1, highIndex);
	    }
	  }
	 
	  static int partition(int[] array, int lowIndex, int highIndex) {
	    int pivot = array[highIndex];
	    int i = (lowIndex - 1);
	 
	    for (int j = lowIndex; j < highIndex; j++) {
	      if (array[j] < pivot) {
	        i++;
	        swap(array, i, j);
	      }
	    }
	    swap(array, i + 1, highIndex);
	    return (i + 1);
	  }
	 
	  static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }
	 
	  public static void main(String[] args) {
	    int[] array = { 10, 3, 2, 0, 9, 7,20 };
	    int n = array.length;
	 
	    quickSort(array, 0, n - 1);
	    System.out.println(Arrays.toString(array));
	  }
}
