package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayInputMapOutputTest {
    ArrayInputMapOutput arrayInputMapOutput;

    @Before
    public void setUp() throws Exception {
        arrayInputMapOutput=new ArrayInputMapOutput();
    }

    @After
    public void tearDown() throws Exception {
        arrayInputMapOutput=null;    }

    @Test
    public void arrayInputMapOutput() {
        String inputString[]={"a","b","c","d","a","c","c"};
        Map<String,Boolean> inputMap=new HashMap<>();
        inputMap.put("a",true);
        inputMap.put("b",false);
        inputMap.put("c",true);
        inputMap.put("d",false);
        assertEquals(inputMap,arrayInputMapOutput.arrayInputMapOutput(inputString));
    }
    @Test
    public void arrayInputMapOutputFail() {
        String inputString[]={"a","b","c","d","a","c","c"};
        Map<String,Boolean> inputMap=new HashMap<>();
        inputMap.put("a",true);
        inputMap.put("b",true);
        inputMap.put("c",true);
        inputMap.put("d",true);
        assertNotEquals(inputMap,arrayInputMapOutput.arrayInputMapOutput(inputString));
    }
}