package test;

import java.util.ArrayList;
import java.util.List;

public class TestGenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> list = generateParenthesis(n);
		System.out.println(list);
	}
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		if(n<2) return list;
		dfs("",n,n,list);
		return list;
    }
	//×ö¼õ·¨
	public static void dfs(String curStr,int left,int right,List<String> list) {
		if(left==0&&right==0) {
			list.add(curStr);
			return;
		}
		if(left>right) {
			return;
		}
		if(left>0) {
			dfs(curStr+"(",left-1,right,list);
		}
		if(right>0) {
			dfs(curStr+")",left,right-1,list);
		}
	}
}
