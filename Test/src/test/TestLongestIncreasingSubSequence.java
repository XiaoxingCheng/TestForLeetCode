package test;

public class TestLongestIncreasingSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(lengthOfLIS(nums));
	}

	public static int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;
		int[] dp = new int[nums.length];
		dp[0] = 1;
		int maxRes = 1;
		for (int i = 1; i < nums.length; i++) {
			int maxVal = 0;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					maxVal = Math.max(maxVal, dp[j]);
				}
			}
			dp[i] = maxVal + 1;
			maxRes = Math.max(dp[i], maxRes);
		}
		return maxRes;
	}

}
