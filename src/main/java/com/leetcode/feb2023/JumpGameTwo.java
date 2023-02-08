package com.leetcode.feb2023;

public class JumpGameTwo {
    public int jump(int[] nums) {
        int result = 0;
        int left =0;
        int right = 0;
        while(right<nums.length-1){
            int farthest = 0;
            for(int j=left;j<=right;j++){
                farthest = Math.max(farthest,j+nums[j]);
            }
            left = right +1;
            right = farthest;
            result += 1;
        }
        return result;
    }
}
