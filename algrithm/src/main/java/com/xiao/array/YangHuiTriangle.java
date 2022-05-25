package com.xiao.array;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class YangHuiTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> data = new LinkedList();
        for (int i = 0; i < numRows; i++) {
            List<Integer> item = new LinkedList();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    item.add(1);
                } else {
                    List<Integer> pre = data.get(i - 1);
                    item.add(pre.get(j - 1) + pre.get(j));
                }
            }
            data.add(item);
        }
        return data;
    }
}
