package com.algo.algo.leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternately_1768Test {
    @Test
    void mergeAlternately() {
        MergeStringsAlternately_1768 mergeStringsAlternately1768 = new MergeStringsAlternately_1768();

        // Test case 1: s is a subsequence of t
        assertEquals(mergeStringsAlternately1768.mergeAlternately("abc", "pqr"), "apbqcr");

        // Test case 2: s is not a subsequence of t
        assertEquals(mergeStringsAlternately1768.mergeAlternately("ab", "pqrs"), "apbqrs");

    }
}