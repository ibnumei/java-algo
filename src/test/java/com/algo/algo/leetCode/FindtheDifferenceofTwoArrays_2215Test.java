package com.algo.algo.leetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindtheDifferenceofTwoArrays_2215Test {
    @Test
    void testFindDifference() {
        FindtheDifferenceofTwoArrays_2215 findtheDifferenceofTwoArrays_2215 = new FindtheDifferenceofTwoArrays_2215();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(1, 3),
            Arrays.asList(4, 6)
        );
        assertEquals(expected, findtheDifferenceofTwoArrays_2215.findDifference(nums1, nums2));

        nums1 = new int[]{1, 2, 3, 4};
        nums2 = new int[]{2, 3, 4, 5};
        expected = Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(5)
        );
        assertEquals(expected, findtheDifferenceofTwoArrays_2215.findDifference(nums1, nums2));

        nums1 = new int[]{};
        nums2 = new int[]{1, 2, 3};
        expected = Arrays.asList(
            Arrays.asList(),
            Arrays.asList(1, 2, 3)
        );
        assertEquals(expected, findtheDifferenceofTwoArrays_2215.findDifference(nums1, nums2));

        nums1 = new int[]{1, 2, 3};
        nums2 = new int[]{};
        expected = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList()
        );
        assertEquals(expected, findtheDifferenceofTwoArrays_2215.findDifference(nums1, nums2));

        nums1 = new int[]{};
        nums2 = new int[]{};
        expected = Arrays.asList(
            Arrays.asList(),
            Arrays.asList()
        );
        assertEquals(expected, findtheDifferenceofTwoArrays_2215.findDifference(nums1, nums2));
    }
}
