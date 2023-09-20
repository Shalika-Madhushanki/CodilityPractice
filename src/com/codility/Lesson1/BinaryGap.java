package com.codility.Lesson1;


import com.codility.Solution;

public class BinaryGap implements Solution<Integer, Integer> {
    @Override
    public Integer solve(Integer... params) {
        Integer N = params[0];

        String binaryNumber = "";
        while (N >= 1) {
            binaryNumber += N % 2;
            N = N / 2;
        }
        System.out.println("Binary Number -  " + binaryNumber);

        Integer maxGap = 0;
        int gap = -1;
        for (char character : binaryNumber.toCharArray()) {
            if (character == '1') {
                if (gap > maxGap) {
                    maxGap = gap;

                }
                gap = 0;
            } else if (character == '0' && gap >= 0) {
                gap += 1;
            }

        }
        if (maxGap == -1) {
            maxGap = 0;
        }

        return (Integer) maxGap;
    }

}
