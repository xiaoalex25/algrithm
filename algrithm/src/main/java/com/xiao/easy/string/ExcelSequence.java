package com.xiao.easy.string;

/**
 * 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。
 */
public class ExcelSequence {

    public static int getExcelSequence(String columnTitle) {
        int length = columnTitle.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            char c = columnTitle.charAt(i);
            int ascii = Integer.valueOf(c);
            int e = length - i - 1;
            int value = 1;
            for (int j = 0; j < e; j++)
                value *= 26;
            value *= (ascii - 64);
            sum += value;
        }
        return sum;
    }
}
