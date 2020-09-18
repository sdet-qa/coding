package coding.util.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a representation of Tree Node
 * 
 * @author Mirzafazulur Rahamanbaig
 *
 */
public class Node {

	public int data;
	public Node left;
	public Node right;

	/**
	 * Constructor
	 * 
	 * @param data
	 */
	public Node(int data) {

		this.data = data;
	}

	/**
	 * Get pre order of a binary tree as list
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> getPreorder(coding.util.tree.Node root) {

		List<Integer> list = new ArrayList<Integer>();
		_getPreorder(root, list);

		return list;
	}

	/**
	 * Get pre order of a binary tree as list
	 * 
	 * @param root
	 * @param list
	 */
	private void _getPreorder(coding.util.tree.Node root, List<Integer> list) {

		if (root != null) {

			list.add(root.data);
			_getPreorder(root.left, list);
			_getPreorder(root.right, list);
		}
	}

	/**
	 * Get in order of a binary tree as list
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> getInorder(coding.util.tree.Node root) {

		List<Integer> list = new ArrayList<Integer>();
		_getInorder(root, list);

		return list;
	}

	/**
	 * Get in order of a binary tree as list
	 * 
	 * @param root
	 * @param list
	 */
	private void _getInorder(coding.util.tree.Node root, List<Integer> list) {

		if (root != null) {

			_getInorder(root.left, list);
			list.add(root.data);
			_getInorder(root.right, list);
		}
	}

	/**
	 * Get post order of a binary tree as list
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> getPostorder(coding.util.tree.Node root) {

		List<Integer> list = new ArrayList<Integer>();
		_getPostorder(root, list);

		return list;
	}

	/**
	 * Get post order of a binary tree as list
	 * 
	 * @param root
	 * @param list
	 */
	private void _getPostorder(coding.util.tree.Node root, List<Integer> list) {

		if (root != null) {

			_getPostorder(root.left, list);
			_getPostorder(root.right, list);
			list.add(root.data);
		}
	}

	/**
	 * Get a full BST
	 * 
	 * @return
	 */
	public static Node getFullBST() {

		return getFullBST(3);
	}

	/**
	 * Get a full BST with height h
	 * 
	 * @param height
	 * @return
	 */
	public static Node getFullBST(int height) {

		int size = (int) (Math.pow(2, height + 1) - 1);
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {

			arr[i] = i;
		}

		return getFullBST(arr, 0, size - 1);
	}

	/**
	 * Get a full BST constructed from an array
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public static Node getFullBST(int[] arr, int start, int end) {

		if (start > end) {

			return null;
		}

		int mid = (start + end) / 2;

		Node root = new Node(arr[mid]);
		root.left = getFullBST(arr, start, mid - 1);
		root.right = getFullBST(arr, mid + 1, end);

		return root;
	}
}
