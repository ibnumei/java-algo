package com.algo.algo.leetCode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsSubsequence_329Test {
    @Test
    void testIsSubsequence() {
        IsSubsequence_329 isSubsequence_329 = new IsSubsequence_329();
        
        // Test case 1: s is a subsequence of t
        assertTrue(isSubsequence_329.isSubsequence("abc", "ahbgdc"), "'abc' should be a subsequence of 'ahbgdc'");

        // Test case 2: s is not a subsequence of t
        assertFalse(isSubsequence_329.isSubsequence("axc", "ahbgdc"), "'axc' should not be a subsequence of 'ahbgdc'");

    }
}
