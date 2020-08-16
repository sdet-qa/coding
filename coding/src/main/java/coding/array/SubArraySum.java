package coding.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Sub array sum problems
 * 
 * @author Mirzafazulur Rahamanbaig
 *
 */
public class SubArraySum {

	/**
	 * Find the total number of continuous subarrays whose sum equals to k
	 * 
	 * https://leetcode.com/problems/subarray-sum-equals-k/
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public int subArraysCount(int[] nums, int k) {

		int sum = 0, count = 0;
		Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		sumMap.put(0, 1);

		for (int i = 0; i < nums.length; i++) {

			sum += nums[i];

			if (sumMap.containsKey(sum - k)) {

				count += sumMap.get(sum - k);
			}

			sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
		}

		return count;
	}

	/**
	 * Find subarray with given sum
	 * 
	 * https://www.geeksforgeeks.org/find-subarray-with-given-sum-in-array-of-integers/
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public int[] subArraySum(int[] nums, int k) {

		int[] indices = new int[2];
		Arrays.fill(indices, -1);

		int sum = 0;
		Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			sum += nums[i];

			if (sum - k == 0) {

				indices[0] = 0;
				indices[1] = i;
				break;
			}

			if (sumMap.containsKey(sum - k)) {

				indices[0] = sumMap.get(sum - k) + 1;
				indices[1] = i;
				break;
			}
		}

		return indices;
	}

	/**
	 * Driver method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		int nums[] = { 10, 2, -2, -20, 10 };
		int k = -10;

		SubArraySum sas = new SubArraySum();

		System.out.println(sas.subArraysCount(nums, k)); // returns 3
		System.out.println(sas.subArraySum(nums, k)); // returns [0, 3]
	}
}
