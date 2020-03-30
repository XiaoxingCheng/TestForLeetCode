package test;

import java.util.Stack;

public class TestValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		if (s == null||s.length()==1)
			return false;
		if(s.length()==0) return true;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c=='{'||c=='['||c=='(') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) return false;
				char x = stack.pop();
				switch(c) {
				case '}':
					if(x!='{') {
						return false;
					}
					break;
				case ']':
					if(x!='[') {
						return false;
					}
					break;
				case ')':
					if(x!='(') {
						return false;
					}
					break;
				}
			}
		}
		return stack.isEmpty();
	}
}
