package com.algo.algo.leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorofStrings_1071Test {

    @Test
    void gcdOfStrings() {
        GreatestCommonDivisorofStrings_1071 gcd = new GreatestCommonDivisorofStrings_1071();

        assertEquals(gcd.gcdOfStrings("ABCABC", "ABC"), "ABC");

        assertEquals(gcd.gcdOfStrings("ABABAB", "ABAB"), "AB");
    }
}