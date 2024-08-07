package com.algo.algo.leetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CanPlaceFlowers_605Test {
    @Test
    void testCanPlaceFlowers() {
        CanPlaceFlowers_605 canPlaceFlowers_605 = new CanPlaceFlowers_605();
        
        int[] flowerbed = {1, 0, 0, 0, 1};
        int flower = 1;
        assertEquals(canPlaceFlowers_605.canPlaceFlowers(flowerbed, flower), true);

        int[] flowerbed2 = {0};
        int flower2 = 1;
        assertEquals(canPlaceFlowers_605.canPlaceFlowers(flowerbed2, flower2), true);


    }
}
