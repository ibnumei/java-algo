package com.algo.algo.leetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseVowelsofaString_345Test {
    @Test
    void testReverseVowels() {
        ReverseVowelsofaString_345 reverseVowelsofaString_345 = new ReverseVowelsofaString_345();

        assertEquals(reverseVowelsofaString_345.reverseVowels("hello"), "holle");

    }
}
