package test;

public class TheMassesUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2,1,4,5,3,1,1,3 };
		System.out.println(massage(nums));
	}
	public static int massage(int[] nums) {
		if(nums==null||nums.length == 0) return 0;
		if(nums.length==0) return nums[0]>nums[1]?nums[0]:nums[1];
		if(nums.length ==1) return nums[0];
		int[] dp = new int[nums.length];
		dp[0]=nums[0];
		dp[1]=nums[1];
		int max = nums[0];
		for(int i = 2;i<nums.length;i++) {
			dp[i]=max+nums[i];
			max = dp[i-1]>max?dp[i-1]:max;
		}
		max=dp[0];
		for(int i = 0;i<dp.length;i++) {
			if(dp[i]>max) max=dp[i];
		}
		return max;
	}
	/*public static int massage(int[] nums) {
		if(nums==null||nums.length == 0) return 0;
		if(nums.length==0) return nums[0]>nums[1]?nums[0]:nums[1];
		int[] dp = new int[nums.length];
		dp[0]=nums[0];
		dp[1]=nums[0]>nums[1]?nums[0]:nums[1];
		for(int i = 2;i<nums.length;i++) {
			dp[i]=Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
		return dp[nums.length-1];
		
	}*/

}
