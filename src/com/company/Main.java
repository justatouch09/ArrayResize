package com.company;

import java.util.Scanner;

public class Main {
    // Accepting console input (Scanner).
    private static Scanner s = new Scanner(System.in);
    // baseData an array of ten elements.
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.println("Enter 12 integers:");
//        getInput();
        baseData[10] = 67;
        baseData[11] = 34;
        printArray(baseData);

    }

    // Get data from console and save it in an array.
    private static void getInput() {
        for (int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    // Print out array contents.
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Takes copy of original array and creates a new array and changes size.
    // goes through loop gets each element from original array that we took a copy of
    // stores it back into a new array that we created.
    private static void resizeArray() {

        // Stores the original array.
        int[] original = baseData;

        // Create a new array and store the original array into the new one.
        baseData = new int[12];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }

}
