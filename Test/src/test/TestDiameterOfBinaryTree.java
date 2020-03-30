package test;

public class TestDiameterOfBinaryTree {

	class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode(int x){ this.val = x;}
	}
	public static int maxLength =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int diameterOfTreeNode(TreeNode root) {
		if(root == null) return 0;
		maxLength = Math.max(getDepth(root.left)+getDepth(root.right),maxLength);
		diameterOfTreeNode(root.left);
		diameterOfTreeNode(root.right);
		return maxLength;
	}
	public static int getDepth(TreeNode t) {
		if(t==null) return 0;
		return Math.max(getDepth(t.left)+getDepth(t.right), maxLength)+1;
	}
}
