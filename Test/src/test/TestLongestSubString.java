package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		//System.out.println(lengthOfLongestSubString(s));
	}
	public static int lengthOfLongestSubString(String s) {
		/*Map<Character,Integer> map = new HashMap<>();
		int left = 0;
		int maxLength =0;
		for(int i=0;i< s.length();i++) {
			char ch = s.charAt(i);
			if(!map.containsKey(ch)||map.get(ch)<left) {
				map.put(ch, i);
				continue;
			}
			maxLength = Math.max(maxLength, i-left);
			left = Math.max(left, map.get(ch)+1);
			map.put(ch, i);
		}
		maxLength = Math.max(maxLength, s.length()-left);
		return maxLength;*/
		Set<Character> set = new HashSet<>();
		int left = 0;
		int right = 0;
		int maxLength = 0;
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
				if(maxLength <(right-left)) {
					maxLength = right-left;
				}
				while(s.charAt(i)!=s.charAt(left)) {
					set.remove(s.charAt(left));
					left++;
				}
				right++;
			}else {
				set.add(s.charAt(i));
			}
			right++;
		}
		maxLength = Math.max(maxLength, right - left);
		
		return maxLength;
	}
}
