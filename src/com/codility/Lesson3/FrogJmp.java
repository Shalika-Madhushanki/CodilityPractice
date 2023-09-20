package com.codility.Lesson3;

import com.codility.Solution;

public class FrogJmp implements Solution<Integer, Integer> {
    @Override
    public Integer solve(Integer... params) {
        int X = params[0];
        int Y = params[1];
        double D = params[2];

        if (X >= Y) {
            return 0;
        }
        double numberOfSteps = (Y - X) / D;
        return (int) Math.ceil(numberOfSteps);

    }


}
