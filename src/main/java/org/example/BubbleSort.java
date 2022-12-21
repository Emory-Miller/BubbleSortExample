package org.example;

public class BubbleSort {

    //Array of unsorted integers taken as an input
    //Given
    int[] unsortedArray;

    //expected, output the same array but sorted from least to greatest
    //sort by comparing adjacent values in the array

    public Integer[] bubbleSort(Integer[] input) {

        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return input;
    }
}
