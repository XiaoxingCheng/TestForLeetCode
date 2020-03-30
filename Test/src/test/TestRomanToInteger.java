package test;

public class TestRomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MCMXCIV";
		System.out.println(romanToInteger(s));
	}

	public static int romanToInteger(String s) {
		if (s == null)
			return 0;
		int sum = 0;
		for(int i = 0;i<s.length()-1;i++) {
			int before = symbolValue(s.charAt(i));
			int after = symbolValue(s.charAt(i+1));
			if(before >= after) {
				sum += before;
			}else {
				sum -= before;
			}
		}
		//需要将最后一个未遍历的值加上
		sum += symbolValue(s.charAt(s.length()-1));
		return sum;
	}

	public static int symbolValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

}
