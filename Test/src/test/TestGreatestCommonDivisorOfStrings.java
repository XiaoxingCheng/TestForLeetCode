package test;

public class TestGreatestCommonDivisorOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABABAB"; 
		String str2 = "ABAB";
		System.out.println(gcdOfStrings(str1,str2));
	}
	public static String gcdOfStrings(String str1,String str2) {
		if(str1.equals(str2)) {
			return str1;
		}
		if(str1==null||str2==null) return "";
		int i = 0;
		int j = 0;
		while(i < str1.length()&&j<str2.length()) {
			if(str1.charAt(0)!=str2.charAt(0)) {
				return "";
			}
			i++;
			j++;
		}
		if(str1.length()>str2.length()) {
			return gcdOfStrings(str2,str1.substring(i, str1.length()));
		}else {
			return gcdOfStrings(str1,str2.substring(i,str2.length()));
		}
	}

}
