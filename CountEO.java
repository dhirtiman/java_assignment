import java.io.*;
import java.util.Scanner;

// 8. Write a java program to print the count of
//  even numbers and odd numbersfrom the given list using for statement

public class CountEO {
    public static void main(String[] args) {
        int eSum = 0, oSum = 0, n, i;
        int list[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        System.out.printf("Enter %d  numbers: ", n);
        for (i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            if (list[i] % 2 == 0) {
                eSum++;
            } else {
                oSum++;
            }
        }

        System.out.printf("Even:%d Odd:%d", eSum, oSum);

    }

}

/* Output
 * Enter the number of elements
 * 10
 * Enter 10 numbers: 1 2 3 4 5 6 7 8 9 10
 * Even:5 Odd:5
 */