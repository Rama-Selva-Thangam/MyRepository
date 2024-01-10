package com.ramaselvathangamm.rajeesan;

public class LongestCommonPrefix {
    private static String findLongestSubstring(String[] words) {
        if (words == null || words.length == 0) {
            return ""; 
        }
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            minLength = Math.min(minLength, word.length());
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char c = words[0].charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (c != words[j].charAt(i)) {
                    return result.toString(); 
                }
            }

            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flight", "float", "flow"};
        String result = findLongestSubstring(words);
        System.out.println(result);
    }
}
