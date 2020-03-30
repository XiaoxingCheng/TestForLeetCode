package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TestWaterAndJugs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 5;
		int z = 4;
		System.out.println(canMeasureWater(x,y,z));
	}

	public static boolean canMeasureWater(int x, int y, int z) {
		if(x + y < z||z<0) return false;
	   Set<Integer> set = new HashSet<>();
	   Queue<Integer> q = new LinkedList<>();
	   q.offer(0);
	   while(!q.isEmpty()) {
		   int n = q.poll();
		   while(n+x<=x+y&&set.add(n+x)) {
			   q.offer(n+x);
		   }
		   while(n+y<=x+y&&set.add(n+y)) {
			   q.offer(n+y);
		   }
		   while(n-x>=0&&set.add(n-x)) {
			   q.offer(n-x);
		   }
		   while(n-y>=0&&set.add(n-y)) {
			   q.offer(n-y);
		   }
		   while(set.contains(z)) {
			   return true;
		   }
	   }
	   return false;
	}
}
