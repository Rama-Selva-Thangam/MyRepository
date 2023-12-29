package com.ramaselvathangamm.maheshsan;

import java.util.Scanner;

public class MaxProfit {

	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1) {
			return 0;
		}
		int maxProfit = 0;
		int minPrice = prices[0];
		for (int i = 1; i < prices.length; i++) {
			int currentPrice = prices[i];
			int currentProfit = currentPrice - minPrice;// 7 1 4 5 6 2
			if (currentProfit > maxProfit) {
				maxProfit = currentProfit;
			}
			if (currentPrice < minPrice) {
				minPrice = currentPrice;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number Test Cases : ");
		int testCases = scan.nextInt();
		scan.nextLine();
		while (testCases > 0) {
			System.out.print("Enter the length of Array : ");
			int len = scan.nextInt();
			int[] prices = new int[len];
			System.out.print("Enter the elements : ");
			for (int i = 0; i < len; i++) {
				prices[i] = scan.nextInt();
			}
			int result = maxProfit(prices);
			System.out.println(result);
			System.out.println("----------");
			testCases--;
		}
		scan.close();
	}
}
