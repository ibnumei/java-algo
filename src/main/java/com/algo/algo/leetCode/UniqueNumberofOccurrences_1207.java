package com.algo.algo.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
            for (int i : arr) {
                // if(countMap.containsKey(i)) {
                //     countMap.put(i, countMap.get(i)+1);
                // } else {
                //     countMap.put(i, 1);
                // }
                countMap.put(i, countMap.getOrDefault(i, 0) + 1);
            }
            System.out.println(countMap);

            Set<Integer> uniqueSet = new HashSet<>();
            for(Integer value : countMap.values()) {
                // cara 1
                // if(!uniqueSet.add(value)) {
                //     return false;
                // }
                uniqueSet.add(value);
            }
            // cara 1
            // return true;
            return countMap.size() == uniqueSet.size();
    }
}
