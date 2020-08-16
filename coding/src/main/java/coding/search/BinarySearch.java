package coding.search;

/**
 * Binary search
 * 
 * @author Mirzafazulur Rahamanbaig
 *
 */
public class BinarySearch {

	/**
	 * Get index of key in the array, return -1 if key not found
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	public int search(int[] arr, int key) {

		int low = 0, high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == key) {

				return mid;
			} else if (key > arr[mid]) {

				low = mid + 1;
			} else {

				high = mid - 1;
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

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		BinarySearch bs = new BinarySearch();

		System.out.println(bs.search(arr, 3)); // returns 2
		System.out.println(bs.search(arr, 8)); // returns -1
	}
}
