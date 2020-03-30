package test;

import java.util.Arrays;

public class TestMinimumIncrementToMakeArrayUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 2, 1, 7 };
		System.out.println(minIncrementForUnique(arr));
	}
	//https://blog.csdn.net/futangxiang4793/article/details/89321732
	public static int minIncrementForUnique(int[] A) {
		if(A==null||A.length ==0) return 0;
		Arrays.sort(A);
		int pre = A[0],move = 0;
		for(int i = 1;i<A.length;i++) {
			if(A[i]<=pre) {
				move += pre-A[i]+1;
				pre++;
			}else {
				pre = A[i];
			}
		}
		return move;
	}
//TestMy
/*	public static int minIncrementForUnique(int[] A) {
		if (A == null || A.length == 0)
			return 0;
		Arrays.sort(A);
		int count = 0;
		for (int i = 1; i < A.length; ) {
			if (A[i] > A[i - 1]) {
				i++;
				continue;
			} else {
				A[i]++;
				count++;
			}
		}
		return count;
	}*/
}
