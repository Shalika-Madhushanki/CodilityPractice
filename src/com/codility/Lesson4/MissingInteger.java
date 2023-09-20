package com.codility.Lesson4;

import com.codility.Solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger implements Solution<Integer, int[]> {
    @Override
    public Integer solve(int[]... params) {
        int[] A = params[0];
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            numbers.add(A[i]);
        }

        for (int i = 1; i < A.length + 2; i++) {
            if (!numbers.contains(i)) {
                return i;
            }
        }

        return 1;
    }
}
