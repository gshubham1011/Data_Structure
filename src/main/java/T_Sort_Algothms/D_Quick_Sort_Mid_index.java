package T_Sort_Algothms;

import java.util.Arrays;

public class D_Quick_Sort_Mid_index {
    
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the pivot index such that elements smaller than the pivot are on the left,
            // and elements greater than the pivot are on the right
            int pivotIndex = partition(array, low, high);

            // Recursively sort the subarrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
            
            
        }
    }

    public static int partition(int[] array, int low, int high) {
        // Choose the middle element as the pivot
        int pivot = array[(low + high) / 2];
        System.out.println(" Pivot :"+pivot);
        // Move smaller elements to the left and larger elements to the right of the pivot
        while (low <= high) {
        	System.out.println(" Pivot inside while :"+pivot);
            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }
            if (low <= high) {
                // Swap array[low] and array[high]
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;

                // Update indices after the swap
                low++;
                high--;
               
            }
        }

        return low;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
     }
	
	public static void main(String[] args) {
	    //int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
	    int[] array = { 10, 3, 2, 5, 9, 7,20 };
	    
	    System.out.println("Original array:");
	    printArray(array);
	
	    quickSort(array, 0, array.length - 1);
	
	    System.out.println("\nSorted array:");
	    printArray(array);
	}

}
