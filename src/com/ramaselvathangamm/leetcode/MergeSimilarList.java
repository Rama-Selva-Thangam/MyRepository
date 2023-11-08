package com.ramaselvathangamm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeSimilarList {
	public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int[] item : items1) {
			int value = item[0];
			int weight = item[1];

			map.put(value, map.getOrDefault(value, 0) + weight);
		}

		for (int[] item : items2) {
			int value = item[0];
			int weight = item[1];
			map.put(value, map.getOrDefault(value, 0) + weight);
		}

		List<List<Integer>> result = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getKey();
			int weight = entry.getValue();
			List<Integer> item = new ArrayList<>();
			item.add(value);
			item.add(weight);
			result.add(item);
		}
		Collections.sort(result, (a, b) -> a.get(0) - b.get(0));
		return result;
	}

	public static void main(String[] args) {
		int[][] item1 = { { 1, 2 }, { 2, 4 } };
		int[][] item2 = { { 7, 4 }, { 1, 6 }, { 2, 3 } };
		List<List<Integer>> res=mergeSimilarItems(item1,item2);
		for(List<Integer> list:res) {
			for(int s:list) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

}
