package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class HeightChecker {
	public static int heightChecker(int[] heights) {
		int max = 0;
		for (int height : heights) {
			if (height > max) {
				max = height;
			}
		}

		int[] heightFrequency = new int[max + 1];
		for (int height : heights) {
			heightFrequency[height]++;
		}

		int count = 0;
		int currentHeight = 0;
		for (int i = 0; i < heights.length; i++) {
			while (heightFrequency[currentHeight] == 0) {
				currentHeight++;
			}

			if (heights[i] != currentHeight) {
				count++;
			}

			heightFrequency[currentHeight]--;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Length of Array : ");
		int len = scan.nextInt();
		int[] heights = new int[len];
		System.out.println("Enter the Heights : ");
		for (int i = 0; i < len; i++)
			heights[i] = scan.nextInt();
		int result = heightChecker(heights);
		System.out.println(result);
		scan.close();
	}

}
