package com.xiao.array;

import org.junit.Assert;
import org.junit.Test;

public class Locate4InsertTest {

    @Test
    public void searchInsertTest() {
        Assert.assertEquals(2, Locate4Insert.searchInsert(new int[]{1, 3, 5 ,6}, 5));
        Assert.assertEquals(1, Locate4Insert.searchInsert(new int[]{1, 3, 5 ,6}, 2));
        Assert.assertEquals(4, Locate4Insert.searchInsert(new int[]{1, 3, 5 ,6}, 7));
    }
}
