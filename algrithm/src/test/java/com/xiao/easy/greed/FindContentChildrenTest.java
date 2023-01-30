package com.xiao.easy.greed;

import com.xiao.easy.array.YangHuiTriangle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(value = Parameterized.class)
public class FindContentChildrenTest {

    private int[] g;
    private int[] s;
    private int expect;

    public FindContentChildrenTest(int[] g, int[] s, int expect) {
        this.g = g;
        this.s = s;
        this.expect = expect;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,3}, new int[]{1, 1}, 1},
                {new int[]{1,2}, new int[]{1,2,3}, 2}
        });
    }

    @Test
    public void generateTest() {
        assertThat(expect, equalTo(FindContentChildren.findContentChildren(g, s)));
    }
}
