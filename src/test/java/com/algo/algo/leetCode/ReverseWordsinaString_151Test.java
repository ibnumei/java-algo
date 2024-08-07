package com.algo.algo.leetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordsinaString_151Test {
    @Test
    void testReverseWords() {
        ReverseWordsinaString_151 reverseWordsinaString_151 = new ReverseWordsinaString_151();

        assertEquals(reverseWordsinaString_151.reverseWords("  hello world  "), "world hello");
    }
}
