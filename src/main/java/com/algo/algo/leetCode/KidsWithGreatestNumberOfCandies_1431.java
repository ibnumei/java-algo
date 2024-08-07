package com.algo.algo.leetCode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int highestCandy = -1;

        for (int num : candies) {
            highestCandy = num >= highestCandy ? num : highestCandy;
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= highestCandy);
        }

        return result;
    }
}
