package test;

public class TestIsParlindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -121;
		System.out.println(isPalindrome(x));
	}
	public static boolean isPalindrome(int x) {
		int t = 0;
		int temp = x;
		String s = String.valueOf(temp);
		s = s.trim();
		if(s==null||s.length()==0) return false;
		if(!(s.charAt(0)>='0'&&s.charAt(0)<='9')) {
			return false;
		}
		long result = 0;
	    while(temp > 0) {
	    	t = temp % 10;
	    	temp /= 10;
	    	result = result * 10 + t;
	    }
	    return (int)result==x?true:false;
    }

}
