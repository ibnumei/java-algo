package com.algo.algo.leetCode;

public class ReverseWordsinaString_151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();
        for (int i = words.length - 1; i > 0; i--) {
            out.append(words[i]).append(" ");
        }
        return out.append(words[0]).toString();

        // return Arrays.asList(s.split(" ")).reversed().stream().filter(e -> !e.equals("")).collect(Collectors.joining(" "));
    }
}
