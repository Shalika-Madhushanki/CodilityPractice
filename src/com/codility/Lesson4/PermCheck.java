package com.codility.Lesson4;

import com.codility.Solution;

import java.util.Arrays;
import java.util.List;

public class PermCheck implements Solution<Integer, int[]> {
    @Override
    public Integer solve(int[]... params) {
        int[] A = params[0];
        int n = A.length;
        Boolean[] permutationArray = new Boolean[n];
        List<Boolean> permutations = Arrays.asList(permutationArray);
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= n) {
                permutations.set(A[i] - 1, true);

            } else {
                return 0;
            }

        }
        return permutations.contains(null) ? 0 : 1;

    }


}
