package com.algo.algo.leetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithGreatestNumberOfCandies_1431Test {

    @Test
    void kidsWithCandies() {
        KidsWithGreatestNumberOfCandies_1431 kidsWithGreatestNumberOfCandies1431 = new KidsWithGreatestNumberOfCandies_1431();
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        List<Boolean> expected1 = Arrays.asList(true, true, true, false, true);
        assertEquals(expected1, kidsWithGreatestNumberOfCandies1431.kidsWithCandies(candies1, extraCandies1));

        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        List<Boolean> expected3 = Arrays.asList(true, false, true);
        assertEquals(expected3, kidsWithGreatestNumberOfCandies1431.kidsWithCandies(candies3, extraCandies3));

    }
}
