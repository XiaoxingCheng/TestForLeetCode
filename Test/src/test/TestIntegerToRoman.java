package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestIntegerToRoman {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner in = new Scanner(System.in);
		int num = in.nextInt();*/
		System.out.println(intToRoman(28));
	}
	public static String intToRoman(int num) {
		int[] nums= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder s = new StringBuilder();
		int i = 0;
		while(i < 13) {
			while(num >= nums[i]) {
				s.append(symbols[i]);
				num -= nums[i];
			}
			i++;
		}
		return s.toString();
	}

}
