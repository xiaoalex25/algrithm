package com.xiao.easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组nums1和nums2 ，返回它们的交集 。输出结果中的每个元素一定是 唯一的。
 * 我们可以不考虑输出结果的顺序 。
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> sets = new HashSet<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1[i] == nums2[j]) {
                    sets.add(nums1[i]);
                    break;
                }
            }
        }
        int[] res = new int[sets.size()];
        int index = 0;
        for (Integer i : sets) {
            res[index] = i;
            index++;
        }
        return res;
    }
}
