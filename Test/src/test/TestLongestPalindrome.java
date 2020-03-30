package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestLongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bb";
		System.out.println(longestPalindrome(s));
	}
	public static int longestPalindrome(String s) {
		if(s == null||s.length() == 0) return 0;
		int[] account = new int[58];
		for(int i = 0;i<s.length();i++) {
			account[s.charAt(i)-'A']++;
		}
		int res =0;
		for(int i = 0;i<account.length;i++) {
			if(account[i]==0) continue;
			if(account[i]%2==0) {
				res += account[i];
			}else {
				res += (account[i]-1);
			}
		}
		if(res < s.length()) res = res+1;
		return res;
	}
	/*public static int longestPalindrome(String s) {
		if(s==null||s.length()==0) return 0;
		s = s.trim();
		int res = 0;
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> m = it.next();
			if(m.getValue() %2 ==0) {
				res += m.getValue();
				it.remove();
			}else {
				res += m.getValue()-1;
				if((m.getValue()-1) ==0) {
					it.remove();
				}else {
					map.put(m.getKey(), 1);
				}
			}
		}
		for(char c:map.keySet()) {
			if(map.get(c)%2==0) {
				res += map.get(c);
				map.remove(c);
			}else {
				res += (map.get(c)-1);
				map.put(c,1);
			}
		}
		return it.hasNext()?res+1:res;
    }*/
}
