package com.algo.algo.leetCode;

public class GreatestCommonDivisorofStrings_1071 {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        int gcdValueLength = getGcdLength(str1.length(), str2.length());
        return str1.substring(0, gcdValueLength);
    }

    public int getGcdLength(int lengthString1, int lengthString2) {
        return lengthString2 == 0 ? lengthString1 : getGcdLength(lengthString2, lengthString1 % lengthString2);
    }
}
