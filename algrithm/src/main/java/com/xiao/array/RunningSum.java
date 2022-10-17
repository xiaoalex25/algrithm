package com.xiao.array;

/**
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 */
public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int len2 = i;
            int sum = 0;
            for (int j = 0; j <= len2; j++) {
                sum += nums[j];
            }
            result[i] = sum;
        }
        return result;
    }
}
