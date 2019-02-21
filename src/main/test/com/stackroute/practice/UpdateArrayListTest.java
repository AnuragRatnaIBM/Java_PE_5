package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateArrayListTest {
    UpdateArrayList updateArrayList;

    @Before
    public void setUp() throws Exception {
        updateArrayList=new UpdateArrayList();
    }

    @After
    public void tearDown() throws Exception {
        updateArrayList=null;
    }

    @Test
    public void update() {
        ArrayList<String> expectedArrayList=new ArrayList<>(Arrays.asList("Kiwi","Grape","Melon","Berry"));
        ArrayList<String> actualArrayList=new ArrayList<>(Arrays.asList("Apple","Grape","Melon","Berry"));
        assertEquals(expectedArrayList,updateArrayList.update(actualArrayList));

    }
    @Test
    public void updateFail() {
        ArrayList<String> expectedArrayList=new ArrayList<>(Arrays.asList("Apple","Grape","Melon","Berry"));
        ArrayList<String> actualArrayList=new ArrayList<>(Arrays.asList("Apple","Grape","Melon","Berry"));
        assertNotEquals(expectedArrayList,updateArrayList.update(actualArrayList));

    }
}