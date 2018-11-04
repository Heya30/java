package com.company;

/*
 * Exercise 1-1
 */
public class Solution {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,1,4,1,5,9,2,6};

        showReversedArray(array1);
        showReversedArray(array2);
    }

    /*
     * Reverse an array and print it in the standard output
     * @param a the input array
     */
    public static void showReversedArray(int[] a) {
        // TODO
        int i;
        int[] array3;
        array3 = new int [a.length];
        for(i = 0; i < array3.length; i++) {
            array3[i] = a[a.length - i-1];
        }

        for(i = 0;i < array3.length; i++)
            System.out.printf("%d",array3[i]);

    }

}