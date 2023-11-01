package com.ramaselvathangamm.arrayprograms;

import java.util.Scanner;

public class XPattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scan.nextLine();
        int length=str.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i || j == length - i - 1) {
                    System.out.print(str.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}


