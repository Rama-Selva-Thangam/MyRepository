package com.ramaselvathangamm.maheshsan;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CombinationOfCharacter {
	public static void combinationString(String current, String remaining, List<String> list) {
		if (current.isEmpty()) {
			list.add(remaining);
			return;
		}
		combinationString(current.substring(1), remaining + current.charAt(0), list);
		combinationString(current.substring(1), remaining, list);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		List<String> list = new ArrayList<String>();
		combinationString(word, "", list);
		System.out.println(list);
	}
}