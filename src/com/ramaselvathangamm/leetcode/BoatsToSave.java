package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class BoatsToSave {
	public static int numRescueBoats(int[] people, int limit) {
		int result = 0, rem = 0;
		for (int i = 0; i < people.length; i++) {
			if (rem + people[i] > limit) {
				result++;
				rem = people[i] - limit;
			} else {
				
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length of Array : ");
		int len = scan.nextInt();
		int[] people = new int[len];
		System.out.print("Enter Boat Limit : ");
		int limit = scan.nextInt();
		int result = numRescueBoats(people, limit);
		System.out.println(result);
		scan.close();

	}

}
