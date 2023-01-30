package com.xiao.medium.array;

/**
 * 给你一个整数数组nums ，请你找出一个具有最大和的连续子数组子数组最少包含一个元素），返回其最大和。
 */
public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
}
