package com.codility.Lesson3;

import com.codility.Solution;

import java.util.Arrays;

public class TapeEquilibrium implements Solution<Integer, int[]> {
    @Override
    public Integer solve(int[]... params) {
        int[] A = params[0];
        int sum = Arrays.stream(A).sum();
        int absMinDiff = Integer.MAX_VALUE;
        int sumUptoPoint = 0;
        for (int i = 0; i < A.length; i++) {
            sumUptoPoint += A[i];

            int absDiff = Math.abs(2 * sumUptoPoint - sum);

            absMinDiff = Math.min(absDiff, absMinDiff);

        }
        return absMinDiff;
    }
}


//for (int num : A) {
//        totalSum += num;
//        }
//
//        int minDifference = Integer.MAX_VALUE;
//
//        for (int P = 1; P < A.length; P++) {
//        leftSum += A[P - 1];
//        rightSum = totalSum - leftSum;
//        int difference = Math.abs(leftSum - totalSum + leftSum);
//
//        if (difference < minDifference) {
//        minDifference = difference;
//        }
//        }
//
//        return minDifference;