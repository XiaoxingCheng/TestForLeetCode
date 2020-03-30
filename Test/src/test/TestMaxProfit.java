package test;

public class TestMaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		if(prices==null||prices.length==0) return 0;
		int maxPrice = 0;
		for(int i=0;i<prices.length-1;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[j]-prices[i]>maxPrice) {
					maxPrice = Math.max(maxPrice, prices[j]-prices[i]);
				}else {
					continue;
				}
			}
		}
		return maxPrice;
	}

}
