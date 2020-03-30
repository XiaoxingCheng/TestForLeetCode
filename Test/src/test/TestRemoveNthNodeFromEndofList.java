package test;

public class TestRemoveNthNodeFromEndofList {
	public static class ListNode{
		int val;
		ListNode next;
		public ListNode(int x){
			this.val = x;
		}
	}
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next = new ListNode(3);
		node.next = new ListNode(4);
		node.next = new ListNode(5);
		ListNode node1 = removeNthFromEnd(node,2);
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null) return null;
		ListNode node = new ListNode(0);
		node.next = head;
		ListNode start = node;
		ListNode end = node;
		while(n!=0) {
			start = start.next;
			n--;
		}
		while(start.next!=null) {
			start = start.next;
			end = end.next;
		}
		end.next = end.next.next;
		return node.next;
    }
}
