package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void test(){
        System.out.println("******** Test Bubble Sort ********");
        //Given
        Integer[] givenArr = {7,12,55,3,24,19};
        System.out.println("Given array: " + Arrays.toString(givenArr));
        Integer[] expectedArr = {3,7,12,19,24,55};
        System.out.println("Expected array: " + Arrays.toString(expectedArr));
        //When
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] result = bubbleSort.bubbleSort(givenArr);
        //Then
        Assert.assertArrayEquals(expectedArr,result);
        System.out.println("----------------");
        System.out.println("Result array: " + Arrays.toString(result) + "\n");
    }
}