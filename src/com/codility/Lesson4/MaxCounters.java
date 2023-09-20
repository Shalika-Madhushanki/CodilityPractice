package com.codility.Lesson4;

import com.codility.Solution;


public class MaxCounters implements Solution<int[], Object[]> {

    @Override
    public int[] solve(Object[]... params) {
        int N = (int) params[0][0];
        int[] A = (int[]) params[0][1];
        int[] numberList = new int[N];


        int maxCount = 0;
        for (int i = 0; i < A.length; i++) {
            int X = A[i];
            if (1 <= X && X <= N) {
                numberList[X - 1] = numberList[X - 1] + 1;
                maxCount = Math.max(maxCount, numberList[X - 1]);

            } else if (X == N + 1) {
                for (int j = 0; j < numberList.length; j++) {
                    numberList[j] = maxCount;
                }
            }
        }
        return numberList;
    }
}
