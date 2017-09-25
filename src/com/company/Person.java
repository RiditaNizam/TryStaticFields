package com.company;

/**
 * Created by ridita on 9/25/17.
 */
public class Person {
    public static int instanceCount;  //instanceCount is shared and will continue to increment to become 4
    public int localCount;  //localCount will only be equal to 1 for each of the objects since it's a separate variable for each object
    public Person(){
        instanceCount++;
        localCount++;
    }
}