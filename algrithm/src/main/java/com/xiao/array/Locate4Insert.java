package com.xiao.array;


/**
 * 搜索插入位置
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class Locate4Insert {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int index = (left + right) / 2;
            if (nums[index] == target) {
                return index;
            } else if (nums[index] < target) {
                left = index + 1;
            } else if (nums[index] > target) {
                right = index - 1;
            }
        }
        //此时left == right 没有找到
        return target <= nums[left] ? left : left + 1;
    }
}
