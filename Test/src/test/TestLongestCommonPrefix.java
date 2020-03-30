package test;

public class TestLongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "c", "c" };
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null)
			return null;
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		String ans = strs[0];
		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			for (; j < ans.length() && j < strs[i].length(); j++) {
				if (strs[i].charAt(j) != ans.charAt(j)) {
					break;
				}
			}
			ans = ans.substring(0, j);
		}
		return ans;
	}

}
