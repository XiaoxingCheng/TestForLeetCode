package test;

public class TestMiddleOfTheLinkedList {

	public static class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			this.val = x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node = new ListNode(0);
		node.next = new ListNode(1);
		node.next = new ListNode(2);
		node.next = new ListNode(3);
		node.next = new ListNode(4);
		node.next = new ListNode(5);
		System.out.println(middleNode(node));
	}
	//快慢指针
	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		//这个条件好难啊
		while(fast !=null &&fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	/*public static ListNode middleNode(ListNode head) {
		if(head == null) return null;
		if(head.next ==null) return head;
		ListNode nd = new ListNode(0);
		nd.next = head;
		ListNode res = new ListNode(0);
		res.next = head;
		int count = 0;
		int n = 0;
		while(nd.next !=null) {
			nd = nd.next;
			count++;
		}
		while(res.next !=null) {
			n++;
			res = res.next;
			if(n==((count/2)+1)) {
				return res;
			}
		}
		return null;
    }*/
}
