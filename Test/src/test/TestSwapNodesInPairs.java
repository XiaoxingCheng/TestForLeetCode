package test;

public class TestSwapNodesInPairs {
	public static class ListNode{
		ListNode next;
		int val;
		ListNode(int x){
			this.val = x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next = new ListNode(3);
		node.next = new ListNode(4);
		ListNode list = swapPairs(node);
		System.out.println(list);
	} 
	//µÝ¹éÌ«ÉñÁË
	/*public static ListNode swapPairs(ListNode head) {
		if(head==null||head.next == null) return head;
		ListNode next = head.next;
		head.next = swapPairs(next.next);
		next.next = head;
		return next;
    }*/
	public static ListNode swapPairs(ListNode head) {
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode temp = pre;
		while(temp.next!=null&&temp.next.next!=null) {
			ListNode start = temp.next;
			ListNode end = temp.next.next;
			temp.next = end;
			start.next = end.next;
			end.next = start;
			temp = start;	
		}
		return pre.next;
	}

}
