package com.xiao.easy.array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(value = Parameterized.class)
public class YangHuiTriangleTest {

    private int input;
    private int[][] expected;

    public YangHuiTriangleTest(int input, int[][] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {5, new int[][]{
                    {1},
                    {1,1},
                    {1,2,1},
                    {1,3,3,1},
                    {1,4,6,4,1}
                }},
                {1, new int[][]{
                    {1}
                }}
        });
    }

    @Test
    public void generateTest() {
        assertThat(expected, equalTo(YangHuiTriangle.generate(input)));
    }
}
