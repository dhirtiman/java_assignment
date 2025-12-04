import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

// 3. Write a java program to find the sum of 10 array elements using for each loop

class SumArray {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i : arr) {
            sum += i;
        }
        System.out.println("Array: " + Arrays.toString(arr) + "\nSum: " + sum);
    }
}

/*
 * Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Sum: 55
 * 
 */