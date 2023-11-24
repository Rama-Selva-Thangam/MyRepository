package com.ramaselvathangamm.leetcode;

import java.util.Arrays;

public class MaxCoins {
	public static int maxCoins(int[] piles) {
		Arrays.sort(piles);
		int i = 0, j = piles.length - 1, sum = 0;
		while (i < j - 1) {
			sum += piles[j - 1];
			i++;
			j -= 2;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 1, 2, 3, 4 };
		System.out.println(maxCoins(arr));
	}

}
