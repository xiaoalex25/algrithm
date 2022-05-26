package com.xiao.string;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Roman2ArabTest {

    private String param;
    private Integer expected;

    public Roman2ArabTest(String param, Integer expected) {
        this.param = param;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {"III", 3},
                {"IV", 4},
                {"IX", 9},
                {"LVIII", 58},
                {"MCMXCIV", 1994}
        });
    }

    @Test
    public void roman2ArabTest() {
        Assert.assertEquals(expected, Roman2Arab.roman2Arab(param));
    }
}
