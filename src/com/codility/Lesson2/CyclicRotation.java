package com.codility.Lesson2;

import com.codility.Solution;

import java.util.Arrays;

public class CyclicRotation implements Solution<int[], Object[]> {
    @Override
    public int[] solve(Object[]... params) {
        int[] A = (int[]) params[0][0];
        int K = (int) params[0][1];

        int arrayLength = A.length;
        if (arrayLength == 0) {
            return A;
        }
        int[] originalArray = A;
        int[] rotatedArray = Arrays.copyOf(A, arrayLength);
        int shift = K % arrayLength;

        for (int i = 0; i < arrayLength; i++) {
            int shiftIndex = 0;
            shiftIndex = (shift + i) % arrayLength;
            rotatedArray[shiftIndex] = originalArray[i];
        }
        return rotatedArray;
    }


}
