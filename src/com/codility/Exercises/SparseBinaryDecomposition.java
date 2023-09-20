package com.codility.Exercises;

import com.codility.Solution;

/**
 * Not that this is not scaling for long inputs
 */
public class SparseBinaryDecomposition implements Solution<Integer, Integer> {
    @Override
    public Integer solve(Integer... params){
        int N = params[0];
        int numA = 0;
        int numB = 0;
        for (int i=0; i<N/2 ;i++ ) {
            numA = i;
            numB = N-i;
            String A = getBinary(numA);
            String B = getBinary(numB);


            char[] num1 = A.toCharArray();
            char[] num2 = B.toCharArray();

            if (checkSparse(num1) && checkSparse(num2)) {
                return numA;
            }

        }

    return -1;

    }

    public boolean checkSparse(char[] num) {
        boolean isSparse = true;
        boolean lastLetter1 = false;
        for (int j=0; j < num.length ;j++) {
            if (num[j] == '1') {
                if (lastLetter1 == true) {
                    isSparse =false;
                    return isSparse;
                }
                lastLetter1 = true;

            } else {
                lastLetter1 =false;
            }

        }
        return true;
    }
    public String getBinary(int N) {
        String binaryNumber= "";
        while (N >= 1) {
            binaryNumber += N%2;
            N = N/2;
        }

        return binaryNumber;
    }

}
