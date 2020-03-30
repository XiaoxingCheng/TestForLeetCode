package test;

import java.util.Arrays;

public class TestThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, 2, 1, -4};
		int target = 1;
		System.out.println(threeSumClosest(nums,target));
	}

	public static int threeSumClosest(int[] nums, int target) {
		if(nums ==null||nums.length==0) return 0;
		if(nums.length<4) return nums[0]+nums[1]+nums[2];
		Arrays.sort(nums);
		int min =Integer.MAX_VALUE;
		int res = 0;
		for(int i = 0;i<nums.length-1;i++) {
			int left = i+1;
			int right = nums.length -1;
			while(left < right) {
				int sum = nums[i]+nums[left]+nums[right];
				if(sum == target) {
					return target;
				}else if(sum > target){
					if(min > sum - target) {
						min = sum -target;
						res = sum;
					}
					right--;
				}else {
					if(min > target-sum) {
						min = target -sum;
						res = sum;
					}
					left ++;
				}
			}
		}
		return res;
	}
}
