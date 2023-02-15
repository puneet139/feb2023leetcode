package com.leetcode.feb2023;

public class CountOddNumberInInterval {

    public int countOdds(int low, int high) {
        if ((low & 1) == 0) {
            low++;
        }

        // low could become greater than high due to incrementation
        // if it is, the answer is 0; otherwise, use the formula.
        return low > high ? 0 : (high - low) / 2 + 1;
    }
}
