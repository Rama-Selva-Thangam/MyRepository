package com.ramaselvathangamm.evaluation1;

import java.util.Arrays;
import java.util.Scanner;

public class WordPattern {
	public static void printPattern(String word, int row) {
		char[][] arr = new char[row][word.length()];
		int i = 0;
		int j = 0;
		int index = 0;
		boolean downward = false;
		while (index < word.length()) {
			arr[i][j] = word.charAt(index);
			index++;
			if (i == 0) {
				downward = true;
			} else if (i == row - 1) {
				downward = false;
			}
			if (downward) {

				i++;
			} else {
				i--;
				j++;

			}
		}
		for (char[] a : arr) {
			System.out.println(Arrays.toString(a));
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		System.out.print("Enter the Row : ");
		int row = scan.nextInt();
		printPattern(word, row);
		scan.close();

	}

}

//Input : 
//	word : ZOHOISHIRING
//	row  : 3
//Output :
//	Z   I   R
//	O O S I I G
//	H   H   N
//	
//	Input : 
//		word : ZOHOOOISHIRING
//		row  : 4
//		Z    I     N
//		O  O S   I G
//		H O  H R
//		O    I
