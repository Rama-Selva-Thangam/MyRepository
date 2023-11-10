package com.ramaselvathangamm.evaluation1;

import java.util.Scanner;

public class LongestLexigographyString {
	public static void findLongestLexigographicalString(String[] arr) {
		String[] res = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = sortLexoGraphical(arr[i]);
		}
		for(int i=0;i<res.length;i++) {
			for(int j=i+1;j<res.length;j++) {
				if(res[i].compareTo(res[j])<1) {
					String temp=res[i];
					res[i]=res[j];
					res[j]=temp;
				}
			}
		}
		for(String word:res) {
			System.out.println(word);
		}
	}

	public static String sortLexoGraphical(String word) {
		char[] c = word.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] < c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		return new String(c);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Strings: ");
		int length = scan.nextInt();
		scan.nextLine();
		String[] arr = new String[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextLine();
		}
		findLongestLexigographicalString(arr);
		scan.close();
	}
}
