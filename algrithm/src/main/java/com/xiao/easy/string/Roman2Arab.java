package com.xiao.easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 *  罗马数字转整数
 */
public class Roman2Arab {

    private static Map<Character, Integer> mapper = new HashMap<>();

    static {
        mapper.put('I', 1);
        mapper.put('V', 5);
        mapper.put('X', 10);
        mapper.put('L', 50);
        mapper.put('C', 100);
        mapper.put('D', 500);
        mapper.put('M', 1000);
    }

    public static Integer roman2Arab(String roman) {
        Integer sum = 0;
        int len = roman.length();
        for (int i = 0; i < len - 1; i++) {
            if (mapper.get(roman.charAt(i)) < mapper.get(roman.charAt(i + 1)))
                sum -= mapper.get(roman.charAt(i));
            else
                sum += mapper.get(roman.charAt(i));
        }
        sum += mapper.get(roman.charAt(len - 1));
        return sum;
    }
}
