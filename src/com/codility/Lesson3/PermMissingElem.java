package com.codility.Lesson3;

import com.codility.Solution;

import java.util.Arrays;

public class PermMissingElem implements Solution<Integer, int[]> {

    @Override
    public Integer solve(int[]... params) {

        int[] A = params[0];
        Long n = Long.valueOf(A.length);
        if (A.length == 0) {
            return 1;
        }
        Long total = Long.valueOf(((n + 1) * (n + 2)) / 2);
        Long sumOfArray = Long.valueOf(Arrays.stream(A).sum());

        int diff = (int) (total - sumOfArray);
        return (Integer) diff;
    }
}
