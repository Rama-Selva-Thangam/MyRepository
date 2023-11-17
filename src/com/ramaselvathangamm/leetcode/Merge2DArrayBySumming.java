package com.ramaselvathangamm.leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Merge2DArrayBySumming {
	public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
		List<List<Integer>> ans = new ArrayList<>();
		int n1 = nums1.length;
		int n2 = nums2.length;
		int i = 0, j = 0;
		while (i < n1 || j < n2) {
			ArrayList<Integer> al = new ArrayList<>();
			if (i < n1 && j < n2 && nums1[i][0] == nums2[j][0]) {
				al.add(nums1[i][0]);
				int c = nums1[i][1] + nums2[j][1];
				al.add(c);
				i++;
				j++;
				ans.add(al);
			} else if (i < n1 && (j >= n2 || nums1[i][0] < nums2[j][0])) {
				al.add(nums1[i][0]);
				al.add(nums1[i][1]);
				ans.add(al);
				i++;
			} else if (j < n2) {
				al.add(nums2[j][0]);
				al.add(nums2[j][1]);
				ans.add(al);
				j++;
			}
		}
		int n = ans.size();
		int c1 = ans.get(0).size();
		int nums[][] = new int[n][c1];
		for (int r = 0; r < n; r++) {
			for (int ci = 0; ci < c1; ci++) {
				nums[r][ci] = ans.get(r).get(ci);
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[][] num1 = { { 1, 2 }, { 2, 3 }, { 4, 5 } };
		int[][] num2 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		int[][] res = mergeArrays(num1, num2);
		for (int[] arr : res) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
