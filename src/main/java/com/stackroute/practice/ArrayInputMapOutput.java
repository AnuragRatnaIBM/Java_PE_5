/*
3. Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */
package com.stackroute.practice;

import java.util.HashMap;
import java.util.Map;

public class ArrayInputMapOutput {
    public Map<String,Boolean> arrayInputMapOutput(String inputString[])
    {
        int count=0;
        Boolean temp;
        Map<String,Boolean> inputMap=new HashMap<String, Boolean>();
        for(int i=0;i<inputString.length;i++)
        {
            String checkString=inputString[i];
            for (int j=0;j<inputString.length;j++)
            {
                if (checkString.equals(inputString[j]))
                {
                    count++;
                } else {
                    continue;
                }
            }
            if (count >= 2)
            {
                temp = true;
            }
            else
            {
                temp = false;
            }
            count = 0;
            inputMap.put(inputString[i],temp);
        }
        return inputMap;
    }
}
