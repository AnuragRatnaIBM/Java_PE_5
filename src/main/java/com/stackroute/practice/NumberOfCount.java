/*
2. Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}
 */

package com.stackroute.practice;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCount {
    public Map<String,Integer> numberOfCount(String inputString)
    {
        int countOne =inputString.length()-inputString.replaceAll("one","").length();
        countOne=countOne/3;
        int countTwo =inputString.length()-inputString.replaceAll("two","").length();
        countTwo=countTwo/3;
        int countThree =inputString.length()-inputString.replaceAll("three","").length();
        countThree=countThree/5;
        Map<String,Integer> inputMap=new HashMap<String, Integer>();
        inputMap.put("one",countOne);
        inputMap.put("two",countTwo);
        inputMap.put("three",countThree);
        return inputMap;
    }
}
