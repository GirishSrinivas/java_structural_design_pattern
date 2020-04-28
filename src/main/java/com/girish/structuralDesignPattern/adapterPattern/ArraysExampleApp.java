package com.girish.structuralDesignPattern.adapterPattern;

import java.util.Arrays;
import java.util.List;

public class ArraysExampleApp {
    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[] {11, 12, 13, 14};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println("Array of Integers : " + arrayOfInts);
        System.out.println("List of Integers : " + listOfInts);
    }
}
