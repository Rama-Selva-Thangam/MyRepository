package com.ramaselvathangamm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KWeakest {
	public int[] kWeakestRows(int[][] mat, int k) {
		int[] res = new int[k];
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < mat.length; i++) {
			int count = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					count++;
				}
			}
			map.put(i, count);
		}

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());

		int index = 0;
		for (Map.Entry<Integer, Integer> entry : list) {
			if (index == k) {
				break;
			}
			res[index++] = entry.getKey();
		}

		return res;
	}

	public static void main(String[] args) {

	}

}
