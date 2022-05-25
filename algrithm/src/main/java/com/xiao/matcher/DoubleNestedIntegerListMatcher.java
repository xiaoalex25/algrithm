package com.xiao.matcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;


public class DoubleNestedIntegerListMatcher extends TypeSafeMatcher {
    @Override
    protected boolean matchesSafely(Object o) {
        return false;
    }

    @Override
    public void describeTo(Description description) {

    }
}
