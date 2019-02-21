package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SetSortingTest {
    SetSorting setSorting;

    @Before
    public void setUp() throws Exception {
        setSorting=new SetSorting();
    }

    @After
    public void tearDown() throws Exception {
        setSorting=null;
    }

    @Test
    public void setSorting() {
        TreeSet<String>inputTreeSet=new TreeSet<>();
        Collections.addAll(inputTreeSet,"Harry","Olive","Alice","Bluto","Eugene");
        ArrayList<String> inputArrayList=new ArrayList<>();
        Collections.addAll(inputArrayList,"Alice","Bluto","Eugene","Harry","Olive");
        assertEquals(inputArrayList,setSorting.setSorting(inputTreeSet));
    }
    @Test
    public void setSortingFail() {
        TreeSet<String>inputTreeSet=new TreeSet<>();
        Collections.addAll(inputTreeSet,"Harry","Olive","Alice","Bluto","Eugene");
        ArrayList<String> inputArrayList=new ArrayList<>();
        Collections.addAll(inputArrayList,"Harry","Olive","Alice","Bluto","Eugene");
        assertNotEquals(inputArrayList,setSorting.setSorting(inputTreeSet));
    }
}