package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class JewelsAndStones {
	public static int numJewelsInStones(String jewels, String stones) {
		int result = 0;
		for (int i = 0; i < stones.length(); i++) {
			for (int j = 0; j < jewels.length(); j++) {
				if (stones.charAt(i) == jewels.charAt(j)) {
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Jewel String : ");
		String jewels = scan.nextLine();
		System.out.print("Enter the stone String : ");
		String stones = scan.nextLine();
		int result = numJewelsInStones(jewels, stones);
		System.out.println(result);
		scan.close();

	}

}
