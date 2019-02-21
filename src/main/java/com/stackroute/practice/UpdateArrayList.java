/*
1. Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []
 */
package com.stackroute.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UpdateArrayList {
    public ArrayList<String> update(ArrayList<String> inputArrayList)
    {
        inputArrayList.clear();
        Collections.addAll(inputArrayList,"Kiwi","Grape","Melon","Berry");
        return inputArrayList;
    }
}
