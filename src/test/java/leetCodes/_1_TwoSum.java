package leetCodes;

import java.util.Arrays;

public class _1_TwoSum {

	public static void main(String[] args) {
		int[] nums = {3,2,3};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums,target)));
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
        for(int i=0;i<nums.length-1;i++) {
			if((nums[i]+nums[i+1])==target) {
				return new int[] {i,i+1};
        }
      }
		return null;
	}
}
