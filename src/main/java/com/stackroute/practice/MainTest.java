/*
4. Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.
 */

package com.stackroute.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTest {
    public ArrayList<Student> drivingFunction(ArrayList<Student> arrayList) {
        StudentSorter studentSorter=new StudentSorter();
        Collections.sort(arrayList,studentSorter);
        return arrayList;
    }
}
class Student
{
    private String id;
    private String name;
    private int age;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString()
    {
        return this.age+ " " + this.name +
                " " + this.id;
    }
}
class StudentSorter implements Comparator
{
    public int compare(Object x,Object y)
    {
        if(((Student)x).getAge()>((Student)(y)).getAge())
        {
            return 1;
        }
        else if(((Student)x).getAge()==((Student)(y)).getAge())
        {

            if(((Student)(x)).getName().compareToIgnoreCase(((Student)(y)).getName())>1)
            {
                return 1;
            }
            else if(((Student)(x)).getName().compareToIgnoreCase(((Student)(y)).getName())<1)
            {
                return -1;
            }
            else
            {
                if(((Student)(x)).getId().compareToIgnoreCase(((Student)(x)).getId())>1)
                {
                    return 1;
                }
                else if(((Student)(x)).getId().compareToIgnoreCase(((Student)(x)).getId())<1)
                {
                    return -1;
                }
                else
                {
                    return -1;
                }
            }
        }
        else
        {
            return -1;
        }
    }
}
