package com.ramaselvathangamm.numbersystem;

import java.util.Scanner;

public class AreaOfShapes {
	public static double calculateArea(double side) {
		return side * side;
	}

	public static double calculateArea(double length, double width) {
		return length * width;
	}

	public static double calculateArea(double number, double height, double base) {
		return number * height * base;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		boolean flag = true;

		do {
			System.out.println("Enter an option to Calculate area : ");
			System.out.println("1.Squre\n2.Rectangle\n3.Triangle\n4.Exit");
			int option = scan.nextInt();
			switch (option) {

			case 1:
				System.out.print("Enter the side of Square : ");
				int side = scan.nextInt();
				double square = calculateArea(side);
				System.out.println("Area of the Square : " + square);
				break;

			case 2:
				System.out.print("Enter the length of Rectangle : ");
				int length = scan.nextInt();
				System.out.print("Enter the Width of Rectangle : ");
				int width = scan.nextInt();
				double rectangle = calculateArea(length, width);
				System.out.println("Area of the Square : " + rectangle);
				break;

			case 3:
				System.out.print("Enter the height of Triangle : ");
				int height = scan.nextInt();
				System.out.print("Enter the base of Triangle : ");
				int base = scan.nextInt();
				double triangle = calculateArea(0.5d, height, base);
				System.out.println("Area of the Square : " + triangle);
				break;

			case 4:
				flag = false;
				break;

			default:
				System.out.println("Enter a valid input");
			}
			System.out.println("-------------------------------------------------");

		} while (flag);

		scan.close();
	}

}
