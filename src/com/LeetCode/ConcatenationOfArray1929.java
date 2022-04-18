package com.LeetCode;

public class ConcatenationOfArray1929 {
    public int[] getConcatenation(int[] nums) {
        int[] concatenation = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            concatenation[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            concatenation[i + nums.length] = nums[i];
        }
        return concatenation;
    }
}
