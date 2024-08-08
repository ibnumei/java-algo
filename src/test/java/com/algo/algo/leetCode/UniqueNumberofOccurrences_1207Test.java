package com.algo.algo.leetCode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UniqueNumberofOccurrences_1207Test {
    @Test
    void testUniqueOccurrences() {
        UniqueNumberofOccurrences_1207 uniqueNumberofOccurrences_1207 = new UniqueNumberofOccurrences_1207();

        int[] arr1 = {1, 2, 2, 1, 1, 3};
        assertTrue(uniqueNumberofOccurrences_1207.uniqueOccurrences(arr1));

        int[] arr2 = {1, 2};
        assertFalse(uniqueNumberofOccurrences_1207.uniqueOccurrences(arr2));

        int[] arr3 = {-3,0,1,-3,1,1,1,-3,10,0};
        assertTrue(uniqueNumberofOccurrences_1207.uniqueOccurrences(arr3));

        int[] arr4 = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        assertTrue(uniqueNumberofOccurrences_1207.uniqueOccurrences(arr4));

        int[] arr5 = {1, 2, 3, 4, 5};
        assertFalse(uniqueNumberofOccurrences_1207.uniqueOccurrences(arr5));

        int[] arr6 = {};
        assertTrue(uniqueNumberofOccurrences_1207.uniqueOccurrences(arr6));  
    }
}
