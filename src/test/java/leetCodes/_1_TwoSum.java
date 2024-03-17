package leetCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {
      // 3 ways to solve 
	public static void main(String[] args) {
		int[] nums =  {3,2,3};//{2,7,11,15};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums,target)));
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
		   
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println(complement+"  "+map.get(complement));
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
		return null;
	}
	
	
    public int[] twoSum2(int[] nums, int target) {
         for (int i = 1; i < nums.length; i++){
          for (int j = 0; j + i < nums.length; j++) {
            if (nums[j+i] + nums[j] == target) {
               return new int[]{j, j+i};
          }
        }
      }
      return new int[]{};
    }
    
    
	public static int[] twoSum1(int[] nums, int target) {
		
        for(int i=0;i<nums.length-1;i++) {
        	for(int j=i;j<nums.length-1;j++) {
        		if((nums[i]+nums[j+1])==target) {
    				return new int[] {i,j+1};
        	}	
         }
      }
		return null;
	}
}
