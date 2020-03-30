package test;

public class TestMergeTwoSortedLists {

	public static class ListNode{
		int val;
		ListNode next;
		public ListNode(int x){
			this.val = x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode (2);
		l1.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next = new ListNode(4);
		System.out.println(mergeTwoLists(l1,l2));
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null||l2==null) {
			return l1==null?l2:l1;
		}
		ListNode l3 = new ListNode(0);
		ListNode head = l3;
		while(l1!=null&&l2!=null) {
			if(l1.val > l2.val) {
				l3.next = l2;
				l2 = l2.next;
			}else {
				l3.next = l1;
				l1 = l1.next;
			}
			l3 = l3.next;
		}
		if(l1!=null) {
			l3.next = l1;
		}
		if(l2!=null) {
			l3.next = l2;
		}
		return head.next;
    }
}
