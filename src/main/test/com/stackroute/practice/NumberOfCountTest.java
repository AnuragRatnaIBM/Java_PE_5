package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountTest {
    NumberOfCount numberOfCount;

    @Before
    public void setUp() throws Exception {
        numberOfCount=new NumberOfCount();
    }

    @After
    public void tearDown() throws Exception {
        numberOfCount=null;
    }

    @Test
    public void numberOfCount() {
        Map<String,Integer> inputMap=new HashMap<>();
        inputMap.put("one",5);
        inputMap.put("two",2);
        inputMap.put("three",2);
        assertEquals(inputMap,numberOfCount.numberOfCount("one one -one___two,,three,one @three*one?two"));
    }
}