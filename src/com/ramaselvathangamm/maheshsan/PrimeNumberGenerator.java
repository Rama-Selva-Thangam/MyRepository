package com.ramaselvathangamm.maheshsan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberGenerator {
	public static List<Integer> primeGenerator(int starting, int ending) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = starting; i <= ending; i++) {
			if (isPrime(i)) {
				result.add(i);
			}
		}

		return result;
	}
	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Starting range : ");
		int starting = scan.nextInt();
		System.out.println("Enter the Ending range : ");
		int ending = scan.nextInt();
		List<Integer> result = primeGenerator(starting, ending);
		System.out.println(result);
	}
}
