package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class ReversePrefix {
	public static String reversePrefix(String word, char ch) {
		int index=word.indexOf(ch);
		StringBuilder res=new StringBuilder(word.substring(0,index+1));
		return res.reverse().toString()+word.substring(index+1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		System.out.print("Enter the Character : ");
		char c = scan.next().charAt(0);
		String res = reversePrefix(word, c);
		System.out.println(res);
		scan.close();

	}

}
