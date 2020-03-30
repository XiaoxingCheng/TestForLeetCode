package test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TestMaxQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static class MaxQueue{
		Queue<Integer> queue;
		Deque<Integer> deque;
		public MaxQueue() {
			queue = new LinkedList<>();
			deque = new ArrayDeque<>();
	    }
	    
	    public int max_value() {
	    	if(!queue.isEmpty()) deque.peek();
	    	return -1;
	    }
	    
	    public void push_back(int value) {
	    	queue.add(value);
	    	if(!deque.isEmpty()&&value>deque.peekFirst()) {
	    		deque.pollLast();
	    	}
	    	deque.add(value);
	    }
	    
	    public int pop_front() {
	    	if(queue.isEmpty()) return -1;
	    	int num = queue.poll();
	    	if(num == deque.peek()) deque.pollFirst();
	    	return num;
	    } 
	}

}
