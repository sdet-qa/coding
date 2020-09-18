package coding.util.sll;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a representation of Single Linked List
 * 
 * @author Mirzafazulur Rahamanbaig
 *
 */
public class Node {

	public int data;
	public Node next;

	/**
	 * Constructor
	 * 
	 * @param data
	 */
	public Node(int data) {

		this.data = data;
	}

	/**
	 * Get single linked list as list
	 * 
	 * @param head
	 * @return
	 */
	public static List<Integer> getListAsArrayList(Node head) {

		List<Integer> list = new ArrayList<Integer>();

		while (head != null) {

			list.add(head.data);
			head = head.next;
		}

		return list;
	}

	/**
	 * Print elements in a linked list
	 * 
	 * @param head
	 */
	public static void printList(Node head) {

		while (head != null) {

			System.out.print(head.data + " ");
			head = head.next;
		}

		System.out.println();
	}

	/**
	 * Get single linked list
	 * 
	 * @return
	 */
	public static Node getSingleLinkedList() {

		return getSingleLinkedList(5);
	}

	/**
	 * Get single linked list of size n
	 * 
	 * @param n
	 * @return
	 */
	public static Node getSingleLinkedList(int n) {

		Node head = new Node(0);
		Node current = head;

		for (int i = 1; i < n; i++) {

			current.next = new Node(i);
			current = current.next;
		}

		return head;
	}
}
