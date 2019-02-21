/*
6. Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive
 */
package com.stackroute.practice;

import java.util.ArrayList;
import java.util.TreeSet;

public class SetSorting {
    public ArrayList<String> setSorting(TreeSet<String> treeSet)
    {
        ArrayList<String> arrayList=new ArrayList<String>();
        for(String string:treeSet)
        {
            arrayList.add(string);
        }
        return arrayList;
    }
}
