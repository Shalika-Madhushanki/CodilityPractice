package com.codility.Lesson2;

import com.codility.Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * You can solve this problem efficiently using the XOR bitwise operation.
 * The idea is that XORing a number with itself results in 0, and XORing any number with 0 results in the same number.
 * Since all elements except one appear an even number of times, XORing all the elements together will cancel out all the pairs,
 * leaving only the unpaired element.
 */
public class OddOccurrencesInArray implements Solution<Integer, int[]> {
    @Override
    public Integer solve(int[]... A) {
        Map<Integer, Integer> numbersMap = new HashMap<>();
        int[] numberArray = A[0];
        for (int i = 0; i < numberArray.length; i++) {
            int num = numberArray[i];

            if (numbersMap.containsKey(numberArray[i])) {
                numbersMap.put(num, (numbersMap.get(num) + 1) % 2);
            } else {
                numbersMap.put(num, 1);
            }
        }
        Integer key = getKeyByValue(numbersMap, 1);
        if (key == null) {
            return 0;
        }
        return key;
    }

    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
