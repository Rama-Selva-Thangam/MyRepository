package com.ramaselvathangamm.maheshsan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> inputList = new ArrayList<Integer>(List.of(1, 2, 3, 2, 4, 1, 5, 6, 5));
		ArrayList<Integer> result = removeDuplicates(inputList);
		System.out.println(result);
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> inputList) {
		HashSet<Integer> uniqueSet = new HashSet<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int element : inputList) {
			if (uniqueSet.add(element)) {
				result.add(element);
			}
		}
		return result;
	}
}
