package test;

public class TestCanTreePartsEqualsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] str = { 10, -10, 10, -10, 10, -10, 10, -10 };
		System.out.println(canThreePartsEqualsSum(str));
	}

	public static boolean canThreePartsEqualsSum(int[] str) {
		if (str.length < 3)
			return false;
		int sum = 0;
		int tSum = 0;
		int num = 0;
		for (int s : str) {
			sum += s;
		}
		if (sum % 3 != 0) {
			return false;
		}
		for (int i = 0; i < str.length; i++) {
			tSum += str[i];
			if (tSum == sum / 3) {
				tSum = 0;
				num++;
			}
		}
		return ((num == 3)||(num>3&&sum==0))?true:false;
	}

}
