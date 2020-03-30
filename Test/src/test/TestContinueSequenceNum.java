package test;

import java.util.ArrayList;
import java.util.List;

public class TestContinueSequenceNum {

	public static void main(String[] args) {
		int target = 9;
		/*int[][] str = findContinuesSequence(target);
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}*/
	}

	public static int[][] findContinuesSequence(int target) {
		List<ArrayList<Integer>> list = new ArrayList<>();
		int begin = 1;
		int end = 2;
		int sum = 0;
		while(begin < end) {
			sum = (begin + end)*(end - begin +1)/2;
			if(sum == target) {
				ArrayList<Integer> arrList = new ArrayList<>();
				for(int i=0;i<=(end-begin);i++) {
					arrList.add(begin++);
				}
				list.add(arrList);
			}else if(sum < target) {
				end ++;
			}else {
				begin ++;
			}
		}
		Integer[][] iStr = new Integer[list.size()][list.get(0).size()];
		int[][] result = new int[list.size()][list.get(0).size()];
		for(int i=0;i<list.size();i++) {
			
			Integer[] str = list.get(i).toArray(new Integer[list.get(i).size()]);
			for(int j=0;j<list.get(i).size();j++) {
			      iStr[i][j]=str[j];
			      result[i][j] = iStr[i][j];
			}
		}
		return result;
	}

}
