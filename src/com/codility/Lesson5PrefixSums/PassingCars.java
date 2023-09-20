package com.codility.Lesson5PrefixSums;

import com.codility.Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PassingCars implements Solution<Integer, int[]> {
    @Override
    public Integer solve(int[]... params) {
        int[] A = params[0];
        int passingCars = 0;
        int northDirectionCars = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                northDirectionCars += 1;

            } else if (A[i] == 1) {
                passingCars += northDirectionCars * 1;
                if (passingCars > 1000000000 ) {
                    return -1;
                }
            }
        }

        return passingCars;
    }

}
