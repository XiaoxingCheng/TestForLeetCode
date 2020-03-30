package test;

import java.util.Arrays;

public class TestCoinsChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,2,5};
		int amount = 11;
		System.out.println(coinChange(coins,amount));
	}
	public static int coinChange(int[] coins, int amount) {
       int[] dp = new int[amount+1];
       Arrays.fill(dp, amount+1);
       dp[0]=0;
       for(int i=1;i<dp.length;i++) {
    	   for(int coin:coins) {
    		   if(i==coin) {
    			   dp[i]=1;
    		   }else if(i>coin) {
    			   dp[i]=Math.min(dp[i], dp[i-coin]+1);
    		   }
    	   }
       }
       return dp[amount]==(amount+1)?-1:dp[amount];

    }

}
