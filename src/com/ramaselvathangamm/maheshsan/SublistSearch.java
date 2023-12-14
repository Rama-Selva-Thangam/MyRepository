package com.ramaselvathangamm.maheshsan;

import java.util.ArrayList;
import java.util.List;

public class SublistSearch {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
		ArrayList<Integer> sublist = new ArrayList<Integer>(List.of(3, 4, 5));
		boolean isSublist = isSublist(list1, sublist);
		System.out.println(isSublist);
	}
	public static boolean isSublist(ArrayList<Integer> list, ArrayList<Integer> sublist) {
		if (sublist == null || sublist.isEmpty()) {
			return true;
		}
		int listSize = list.size();
		int sublistSize = sublist.size();
		for (int i = 0; i <= listSize - sublistSize; i++) {
			boolean isMatch = true;
			for (int j = 0; j < sublistSize; j++) {
				if (list.get(i + j) != (sublist.get(j))) {
					isMatch = false;
					break;
				}
			}
			if (isMatch) {
				return true;
			}
		}
		return false;
	}
}
