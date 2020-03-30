package test;

public class TestStringToInteger {

	public static void main(String[] args) {
		String str = "     -42";
		String s="";
		System.out.println(s.trim());
		//System.out.println(myAtoi(str));

	}

	public static int myAtoi(String str) {
		str = str.trim();
		if (str == null || str.length() == 0)
			return 0;
		int i = 0;
		int sign = 1;
		double result = 0;
		if (str.charAt(0) == '+' || str.charAt(0) == '-') {
			sign = str.charAt(0) == '-' ? -1 : 1;
			i++;
		}
		while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		}
		return sign==1?(int)result:(int)-result;
	}

}
