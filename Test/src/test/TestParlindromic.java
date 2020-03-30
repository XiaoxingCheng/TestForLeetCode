package test;

public class TestParlindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babad";
		System.out.println(longestParlindromicString(s));
	}
	public static String longestParlindromicString(String s) {
		if(s.length() <=1) {
			return s;
		}
		int maxLength = 0;
		String maxStr = "";
		for(int i=0;i<s.length();i++) {
			for(int j = i+1;j<=s.length();j++) {
				String subStr = s.substring(i, j);
				if(isParlindromic(subStr)&&maxLength<subStr.length()) {
						maxLength = Math.max(maxLength, subStr.length());
						maxStr = subStr;
				}
			}
		}
		return maxStr;
	}
	public static boolean isParlindromic(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

}
