package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLetterCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		System.out.println(letterCombinations(digits));
	}

	public static List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<>();
		if (digits == null)
			return null;
		if (digits.length() == 0)
			return res;
		digits = digits.trim();
		StringBuilder s = new StringBuilder();
		letterCombination(digits, res, s, 0);
		return res;
	}

	public static void letterCombination(String digits, List<String> res, StringBuilder s, int index) {
		if(index == digits.length()) {
			res.add(s.toString());
			return ;
		}
		String[] letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		char c = digits.charAt(index);
		int num = c-'0';
		String letter = letters[num];
		
		for(int i =0;i<letter.length();i++) {
			letterCombination(digits,res,s.append(letter.charAt(i)),index+1);
			s.deleteCharAt(s.length()-1);
		}
		
	}
}