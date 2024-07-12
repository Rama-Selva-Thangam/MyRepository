package com.ramaselvathangamm.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class MaximumScore {
    public static int maximumGain(String s, int x, int y) {
        if (x < y) {
            return maximumGain(s, y, x, "ba", "ab");
        } else {
            return maximumGain(s, x, y, "ab", "ba");
        }
    }

    private static int maximumGain(String s, int firstPoints, int secondPoints, String firstPair, String secondPair) {
        int score = 0;
        Stack<Character> stack = new Stack<>();
        
        // Process first pair
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == firstPair.charAt(0) && c == firstPair.charAt(1)) {
                stack.pop();
                score += firstPoints;
            } else {
                stack.push(c);
            }
        }

        // Reconstruct string after first pass
        StringBuilder remaining = new StringBuilder();
        while (!stack.isEmpty()) {
            remaining.insert(0, stack.pop());
        }

        // Process second pair
        for (char c : remaining.toString().toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == secondPair.charAt(0) && c == secondPair.charAt(1)) {
                stack.pop();
                score += secondPoints;
            } else {
                stack.push(c);
            }
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = scan.nextLine();
        System.out.print("Enter X and Y : ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int score = maximumGain(s, x, y);
        System.out.println(score);
        scan.close();
    }
}
