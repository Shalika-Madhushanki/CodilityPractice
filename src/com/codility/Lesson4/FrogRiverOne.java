package com.codility.Lesson4;

import com.codility.Solution;

import java.util.Arrays;
import java.util.List;

public class FrogRiverOne implements Solution<Integer, Object[]> {
    @Override
    public Integer solve(Object[]... params) {
        int[] A = (int[]) params[0][1];
        int X = (int) params[0][0];


        Boolean[] leafArray = new Boolean[X];
        List<Boolean> leafs = Arrays.asList(leafArray);

        for (int i = 0; i < A.length; i++) {
            leafs.set(A[i] - 1, true);
            boolean isNotFilled = leafs.contains(null);
            if (!isNotFilled) {
                return i;
            }
        }

        return leafs.contains(null) ? -1 : 0;
    }
}
