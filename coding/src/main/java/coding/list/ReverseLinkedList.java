package coding.list;

import coding.util.sll.Node;

/**
 * Reverse a linked list
 * 
 * @author Mirzafazulur Rahamanbaig
 *
 */
public class ReverseLinkedList {

	/**
	 * Reverse a linked list
	 * 
	 * @param head
	 * @return
	 */
	public Node reverseList(Node head) {

		if (head == null || head.next == null) {

			return head;
		}

		Node current = head;
		Node previous = null;
		Node next = null;

		while (current != null) {

			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		return previous;
	}

	/**
	 * Driver method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		Node list = Node.getSingleLinkedList();
		Node.printList(list);

		ReverseLinkedList rll = new ReverseLinkedList();

		Node reverseList = rll.reverseList(list);
		Node.printList(reverseList);
	}
}
