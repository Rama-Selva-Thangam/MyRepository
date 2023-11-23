package com.ramaselvathangamm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagonalTraverse_2 {
	public static int[] findDiagonalOrder(List<List<Integer>> nums) {
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		for (int i = 0; i < nums.size(); i++) {
			for (int j = 0; j < nums.get(i).size(); j++) {
				int n = nums.get(i).get(j);

				if (map.containsKey(i + j)) {
					List<Integer> obj = map.get(i + j);
					obj.add(n);
				} else {
					List<Integer> res = new ArrayList<Integer>();
					res.add(n);
					map.put(i + j, res);
				}
			}
		}

		List<Integer> result = new ArrayList<>();
		for (int key : map.keySet()) {
			List<Integer> values = map.get(key);
			for (int i = values.size() - 1; i >= 0; i--) {
				result.add(values.get(i));
			}
		}

		int[] diagonalOrder = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			diagonalOrder[i] = result.get(i);
		}

		return diagonalOrder;
	}

	public static void main(String[] args) {
		List<List<Integer>> res = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(6, 7), Arrays.asList(8),
				Arrays.asList(9, 10, 11), Arrays.asList(12, 13, 14, 15, 16));
		int[] result = findDiagonalOrder(res);
		System.out.println(Arrays.toString(result));
	}

}
