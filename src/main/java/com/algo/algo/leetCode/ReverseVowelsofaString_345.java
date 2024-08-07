package com.algo.algo.leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelsofaString_345 {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        List<Character> vocalChars = new ArrayList<>();
        List<Integer> vocalIndices = new ArrayList<>();
        
        // Mencari dan menyimpan huruf vokal beserta indeksnya
        for (int i = 0; i < chars.length; i++) {
            if (vowels.indexOf(chars[i]) != -1) {
                vocalChars.add(chars[i]);
                vocalIndices.add(i);
            }
        }
        
        // Membalikkan urutan huruf vokal
        Collections.reverse(vocalChars);
        
        // Memperbarui string dengan huruf vokal yang sudah dibalikkan
        for (int i = 0; i < vocalIndices.size(); i++) {
            chars[vocalIndices.get(i)] = vocalChars.get(i);
        }
        
        return new String(chars);
    }
}
