package com.xiao.medium.array;

import com.xiao.easy.array.RunningSum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class MaxSubArrayTest {

    private int[] input;
    private int expect;

    public MaxSubArrayTest(int[] input, int expect) {
        this.input = input;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6},
                {new int[]{1}, 1},
                {new int[]{5,4,-1,7,8}, 23}
        });
    }

    @Test
    public void maxSubArrayTest() {
        assertThat(expect, equalTo(MaxSubArray.maxSubArray(input)));
    }
}
