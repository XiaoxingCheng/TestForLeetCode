package test;

public class TestAddTwoNumbers {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			this.val = x;
		}
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next = new ListNode(3);
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next = new ListNode(4);
		ListNode tNode = addTwoNumbers(list1, list2);
		while (tNode != null) {
			System.out.println(tNode.val);
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		ListNode l3 = new ListNode(0);
		ListNode head = l3;
		int addOne = 0;
		int sum = 0;
		while (l1 != null || l2 != null) {
			int val1 = l1 == null ? 0 : l1.val;
			int val2 = l2 == null ? 0 : l2.val;
			sum = val1 + val2 + addOne;
			head.next = new ListNode(sum % 10);
			head = head.next;
			addOne = sum / 10;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (addOne == 1) {
			head.next = new ListNode(1);
		}
		return l3.next;
	}
}
