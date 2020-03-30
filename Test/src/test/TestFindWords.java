package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestFindWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cat","bt","hat","tree"};
		String chars =  "atach";
		System.out.println(countCharacters(words, chars));
	}
	public static int countCharacters(String[] words, String chars) {
		if (chars == null || words == null || words.length == 0 || words.length < 1)
			return 0;
		int[] countChars = new int[26];
		for(char c:chars.toCharArray()) {
			countChars[c-'a']++;
		}
		int res = 0;
		for(String s:words) {
			boolean flag = true;
			if(s.length() > chars.length()) {
				flag = false;
			}else {
				int[] countWords = new int[26];
				for(char t:s.toCharArray()) {
					countWords[t-'a']++;
					if(countWords[t-'a']>countChars[t-'a']) {
						flag = false;
						break;
					}
				}
				if(flag) {
					res += s.length();
				}
			}
		}
		return res;
	}
	/*public static int countCharacters(String[] words, String chars) {
		if (chars == null || words == null || words.length == 0 || words.length < 1)
			return 0;
		int[] countChars = countStr(chars);
		int res = 0;
		Map<Character,Integer> map = new HashMap<>();
		a:for(int i = 0;i<words.length;i++) {
			map = new HashMap<>();
			for(int j = 0;j<words[i].length();j++) {
				if(!map.containsKey(words[i].charAt(j))) {
					map.put(words[i].charAt(j), 1);
				}else {
					map.put(words[i].charAt(j), map.get(words[i].charAt(j))+1);
				}
			}
			for(char c:map.keySet()) {
				if(countChars[c-'a']<map.get(c)) {
					continue a;
				}
			}
			res += words[i].length();
		}
		return res;
	}
	public static int[] countStr(String s) {
		int[] count = new int[26];
		for(int i = 0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
		}
		return count;
	}*/
	/*public static int countCharacters(String[] words, String chars) {
		if (chars == null || words == null || words.length == 0 || words.length < 1)
			return 0;
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> wordMap = new HashMap<>();
		for (int i = 0; i < chars.length(); i++) {
			if (!map.containsKey(chars.charAt(i))) {
				map.put(chars.charAt(i), 1);
			} else {
				map.put(chars.charAt(i), map.get(chars.charAt(i)) + 1);
			}
		}
		int res = 0;
		a: for (int i = 0; i < words.length; i++) {
			wordMap = new HashMap<>();
			for (int j = 0; j < words[i].length(); j++) {
				if (!wordMap.containsKey(words[i].charAt(j))) {
					wordMap.put(words[i].charAt(j), 1);
				} else {
					wordMap.put(words[i].charAt(j), wordMap.get(words[i].charAt(j)) + 1);
				}
			}
			for(char c:wordMap.keySet()) {
				if(map.get(c)==null||wordMap.get(c)>map.get(c)) {
					continue a;
				}
			}
			res += words[i].length();
		}
		return res;
	}*/

}
