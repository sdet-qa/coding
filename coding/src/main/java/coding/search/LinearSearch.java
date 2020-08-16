package coding.search;

/**
 * Linear search
 * 
 * @author Mirzafazulur Rahamanbaig
 *
 */
public class LinearSearch {

	/**
	 * Get index of key in the array, return -1 if key not found
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	public int search(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {

				return i;
			}
		}

		return -1;
	}

	/**
	 * Driver method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		LinearSearch ls = new LinearSearch();

		System.out.println(ls.search(arr, 3)); // returns 2
		System.out.println(ls.search(arr, 8)); // returns -1
	}
}
