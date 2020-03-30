package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestShortEncodingOfWords {
	/*static class TrieNode {
		TrieNode[] children;
		int count;

		TrieNode() {
			children = new TrieNode[26];
			count = 0;
		}

		public TrieNode get(char c) {
			if (children[c - 'a'] == null) {
				children[c - 'a'] = new TrieNode();
				count++;
			}
			return children[c - 'a'];
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "time", "me", "bell" };
		int res = minimumLengthEncoding(words);
		System.out.println(res);
	}
	public static int minimumLengthEncoding(String[] words) {
		if(words==null||words.length==0) return 0;
		Arrays.sort(words,(w1,w2)->w2.length()-w1.length());
		StringBuilder s = new StringBuilder();
		for(String w:words) {
			if(!s.toString().contains(w+"#")) {
				s.append(w+"#");
			}
		}
		return s.toString().length();
	}
	/*public static int minimumLengthEncoding(String[] words) {
		TrieNode trie = new TrieNode();
		Map<TrieNode, Integer> nodes = new HashMap();

		for (int i = 0; i < words.length; ++i) {
			String word = words[i];
			TrieNode cur = trie;
			for (int j = word.length() - 1; j >= 0; --j)
				cur = cur.get(word.charAt(j));
			nodes.put(cur, i);
		}

		int ans = 0;
		for (TrieNode node : nodes.keySet()) {
			if (node.count == 0)
				ans += words[nodes.get(node)].length() + 1;
		}
		return ans;
	}*/

	/*
	 * public static int minimumLengthEncoding(String[] words) {
	 * if(words==null||words.length==0) return 0; //先将所有单词加入set Set<String> set =
	 * new HashSet<>(Arrays.asList(words)); for(String w:words) { for(int k =
	 * 1;k<w.length();k++){ //移除后缀单词 set.remove(w.substring(k)); } } int res = 0;
	 * for(String s:set) { res += s.length()+1; } //每个单词结束加"#" return res; }
	 */
}
