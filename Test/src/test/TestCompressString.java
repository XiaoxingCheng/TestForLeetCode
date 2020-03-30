package test;

public class TestCompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabcccccaa";
		System.out.println(compressString(s));
	}
	public static String compressString(String S) {
		if(S==null||S.length() <2) return S;
		int count = 1;
		StringBuilder s = new StringBuilder();
		s.append(S.charAt(0));
		for(int i =1;i<S.length();i++) {
			if(S.charAt(i)==S.charAt(i-1)) {
				count ++;
			}else {
				s.append(count).append(S.charAt(i));
				count = 1;
			}
		}
		return s.append(count).toString().length()>=S.length()?S:s.toString();
	}
	
	/*public static String compressString(String S) {
		 if(S==null||S.length() ==0) return null;
			if(S.length()==1) return S;
			int count = 0;
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < S.length() - 1; i++) {
				if (i != S.length() - 2) {
					if (S.charAt(i) == S.charAt(i + 1)) {
						count++;
						continue;
					} else {
						str.append(S.charAt(i));
						str.append(++count);
						count = 0;
					}
				} else {
					if (S.charAt(i) == S.charAt(i + 1)) {
						str.append(S.charAt(i));
						count = count + 2;
						str.append(count);
					} else {
						str.append(S.charAt(i));
						str.append(++count);
						str.append(S.charAt(i + 1));
						str.append(1);
					}
				}
			}
			
			return str.toString().length()>S.length()?S:str.toString();
	}*/

}
