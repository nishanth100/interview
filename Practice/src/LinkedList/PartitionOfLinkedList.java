package LinkedList;

public class PartitionOfLinkedList {
/*
	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		
	//	 Partition list 
		while (node != null) {
			LinkedListNode next = node.next;
			node.next = null;
			if (node.data < x) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}	
			node = next;
		}
		
	//	 Merge before list and after list 
		if (beforeStart == null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		return beforeStart;
	}*/
	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode head = node;
		LinkedListNode tail = node;
		
	//	 Partition list 
		while (node != null) {
			LinkedListNode next = node.next;
			if (node.data < x) {
	//			 Insert node at head. 
				node.next = head;
				head = node;
			} else {
		//		 Insert node at tail. 
				tail.next = node;
				tail = node;
			}	
			node = next;
		}
		tail.next = null;
		
		return head;
	}
	
	public static void main(String[] args) {
		/* Create linked list */
		int[] vals = {3,5,6,8,9,2,1};
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		System.out.println(head.printForward());
		
		/* Partition */
		LinkedListNode h = partition(head, 5);
		
		/* Print Result */
		System.out.println(h.printForward());
	}
}
