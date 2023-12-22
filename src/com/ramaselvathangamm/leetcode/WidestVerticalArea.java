package com.ramaselvathangamm.leetcode;

import java.util.Arrays;

public class WidestVerticalArea {
	public static int maxWidthOfVerticalArea(int[][] points) {
		Arrays.sort(points, (a, b) -> a[0] - b[0]);

		int max = 0;

		for (int i = 1; i < points.length; i++) {
			int currentWidth = points[i][0] - points[i - 1][0];
			max = Math.max(max, currentWidth);
		}

		return max;
	}

	public static void main(String[] args) {
		int[][] points1 = { { 8, 7 }, { 9, 9 }, { 7, 4 }, { 9, 7 } };
		System.out.println(maxWidthOfVerticalArea(points1)); // Output: 1

		int[][] points2 = { { 3, 1 }, { 9, 0 }, { 1, 0 }, { 1, 4 }, { 5, 3 }, { 8, 8 } };
		System.out.println(maxWidthOfVerticalArea(points2)); // Output: 3
	}
}
