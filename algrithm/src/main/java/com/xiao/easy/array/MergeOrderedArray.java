package com.xiao.easy.array;

public class MergeOrderedArray {

    public static int[] mergeOrderedArray(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return nums1;
        int len3 = nums1.length - 1;
        int len1 = m - 1;
        int len2 = n -1;
        while(len1 >= 0 && len2 >= 0) {
            nums1[len3--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        while (len2 >= 0) {
            nums1[len3--] = nums2[len2--];
        }
        return nums1;
    }
}
