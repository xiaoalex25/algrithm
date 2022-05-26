package com.xiao.string;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class ExcelSequenceTest {

    private String param;
    private int expected;

    public ExcelSequenceTest(String param, Integer expected) {
        this.param = param;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {"A", 1},
                {"AB", 28},
                {"ZY", 701}
        });
    }

    @Test
    public void getExcelSequenceTest() {
        Assert.assertEquals(expected, ExcelSequence.getExcelSequence(param));
    }
}
