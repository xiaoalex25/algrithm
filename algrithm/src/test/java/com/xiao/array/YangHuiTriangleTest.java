package com.xiao.array;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sun.java2d.pipe.AAShapePipe;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(value = Parameterized.class)
public class YangHuiTriangleTest {

    private Integer input;
    private List<List<Integer>> expected;

    public YangHuiTriangleTest(Integer input, List<List<Integer>> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {5, Arrays.asList(new Integer[][]{
                        {1},
                        {1,1},
                        {1,2,1},
                        {1,3,3,1},
                        {1,4,6,4,1}
                })},
                {1, Arrays.asList(new Integer[][]{
                        {1}
                })}
        });
    }

    @Test
    public void generateTest() {
        assertThat(expected, contains(YangHuiTriangle.generate(input).toArray()));
    }
}
