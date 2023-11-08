package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class CanPlaceFlower {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				boolean pre = (i == 0 || flowerbed[i - 1] == 0);
				boolean pos = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
				if (pre && pos)
					flowerbed[i] = 1;
				n--;
			}
		}
		return n <= 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length of Array : ");
		int length = scan.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Enter  the N value : ");
		int n = scan.nextInt();
		boolean result = canPlaceFlowers(arr, n);
		System.out.println(result);
		scan.close();

	}

}
