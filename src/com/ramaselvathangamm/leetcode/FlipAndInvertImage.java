package com.ramaselvathangamm.leetcode;

import java.util.Arrays;

public class FlipAndInvertImage {
	public static int[][] flipAndInvertImage(int[][] image) {
		int[][] res = new int[image.length][image[0].length];
		for (int i = 0; i < image.length; i++) {
			flip(image[i]);
			invert(image[i]);
			res[i] = image[i];
		}
		return res;
	}

	public static int[] flip(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}

	public static int[] invert(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr= {{1,0,0},{0,0,1},{1,1,1}};
		int[][] res=flipAndInvertImage(arr);
		for(int[] a:res) {
			System.out.print(Arrays.toString(a)+" ");
		}
	}

}
