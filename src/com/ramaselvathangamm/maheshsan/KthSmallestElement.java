package com.ramaselvathangamm.maheshsan;

import java.util.Set;
import java.util.TreeSet;

public class KthSmallestElement {
	static int findKthSmallest(int[] nums, int k) {
		int result = 0;
		Set<Integer> set = new TreeSet<Integer>();
		for (int i : nums) {
			set.add(i);
		}
		int index = 0;
		for (int i : set) {
			index++;
			if (index == k) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 6;
		int result = findKthSmallest(nums, k);
		System.out.println(result);
	}

}
