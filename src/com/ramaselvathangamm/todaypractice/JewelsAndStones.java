package com.ramaselvathangamm.todaypractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

	public static int numJewelsInStones2(String jewels, String stones) {
		Set<Character> jewelSet = new HashSet<Character>();
		for (char jewel : jewels.toCharArray()) {
			jewelSet.add(jewel);
		}

		int result = 0;
		for (char stone : stones.toCharArray()) {
			if (jewelSet.contains(stone)) {
				result++;
			}
		}

		return result;
	}

	public static int numJewelsInStones3(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < stones.length(); i++)
			if (jewels.indexOf(stones.charAt(i)) != -1)
				count++;
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Jewel String : ");
		String jewels = scan.nextLine();
		System.out.print("Enter the stone String : ");
		String stones = scan.nextLine();
		int result = numJewelsInStones3(jewels, stones);
		System.out.println(result);
		scan.close();

	}

}
