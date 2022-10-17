package com.xiao.array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class RunningSumTest {

    private int[] input;
    private int[] expect;

    public RunningSumTest(int[] input, int[] expect) {
        this.input = input;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,3,4}, new int[]{1,3,6,10}},
                {new int[]{1,1,1,1,1}, new int[]{1,2,3,4,5}},
                {new int[]{3,1,2,10,1}, new int[]{3,4,6,16,17}}
        });
    }

    @Test
    public void runningSumTest() {
        assertThat(expect, equalTo(RunningSum.runningSum(input)));
    }
}
