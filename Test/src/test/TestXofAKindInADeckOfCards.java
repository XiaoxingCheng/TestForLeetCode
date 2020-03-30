package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestXofAKindInADeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck = { 1, 1, 2, 2, 2, 2,3};
		System.out.println(hasGroupsSizeX(deck));
	}
	public static boolean hasGroupsSizeX(int[] deck) {
		if (deck == null || deck.length < 2)
			return false;
		Map<Integer,Integer> map = new HashMap<>();
		for(int d:deck) {
			if(!map.containsKey(d)) {
				map.put(d, 1);
			}else {
				map.put(d, map.get(d)+1);
			}
		}
		boolean flag = true;
		for(int i =2;i<=deck.length;i++) {
			if(deck.length%i!=0) {
				continue;
			}
			for(Integer t:map.values()) {
				if(t%i!=0) {
					flag = false;
				}
			}
		}
		return flag;
	}
	/*public static boolean hasGroupsSizeX(int[] deck) {
		if (deck == null || deck.length < 2)
			return false;
		int[] arr = new int[10000];
		for (int i = 0; i < deck.length; i++) {
			arr[deck[i]]++;
		}
		int x = 0;
		for (int a : arr) {
			if (a == 1) {
				return false;
			}
			x = gcd(x, a);
			if (x == 1) {
				return false;
			}
		}
		return true;
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}*/
	

}
