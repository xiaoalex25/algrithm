package com.xiao.easy.array;
/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class YangHuiTriangle {

    public static int[][] generate(int numRows) {
        int[][] data = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            int[] item = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    item[j] = 1;
                } else {
                    int[] pre = data[i - 1];
                    item[j] = pre[j - 1] + pre[j];
                }
            }
            data[i] = item;
        }
        return data;
    }
}
