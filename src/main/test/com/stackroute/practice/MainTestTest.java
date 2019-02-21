package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest mainTest;

    @Before
    public void setUp() throws Exception {
        mainTest=new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        mainTest=null;
    }

    @Test
    public void drivingFunction() {
        Student s1 = new Student();
        s1.setName("Anurag");
        s1.setId("STACKROUTE21022019");
        s1.setAge(21);
        Student s2 = new Student();
        s2.setName("Ankit");
        s2.setId("STACKROUTE22022019");
        s2.setAge(22);
        Student s3 = new Student();
        s3.setName("Anshuman");
        s3.setId("STACKROUTE23022019");
        s3.setAge(18);
        Student s4 = new Student();
        s4.setName("Ankur");
        s4.setId("STACKROUTE24022019");
        s4.setAge(21);
        Student s5 = new Student();
        s5.setName("Ankush");
        s5.setId("STACKROUTE25022019");
        s5.setAge(22);
        Student s6 = new Student();
        s6.setName("Aniket");
        s6.setId("STACKROUTE26022019");
        s6.setAge(19);
        ArrayList<Student> arrayList=new ArrayList<Student>();
        Collections.addAll(arrayList,s1,s2,s3,s4,s5,s6);
        ArrayList<Student> arrayExpectedList=new ArrayList<Student>();
        Collections.addAll(arrayExpectedList,s3,s6,s4,s1,s2,s5);
        assertEquals(arrayExpectedList,mainTest.drivingFunction(arrayList));
    }
}