package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestOccurOne {

	public static void main(String[] args) {
		int[] str = {1,1,2,3};
		List<Integer> list =searchOne(str);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static List<Integer> searchOne(int[] str) {
		if(str==null||str.length==0) return null;
		List<Integer> list = new ArrayList<>();
		int temp = str[0];
		for(int i=1;i<str.length;i++) {
			temp^=str[i];
			if(temp!=0) {
				list.add(str[i]);
			}
		}
		return list;
	}

}
