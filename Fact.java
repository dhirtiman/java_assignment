import java.io.*;
import java.util.Scanner;

// q6 Write a java program to find Factorial of a given number.
class Fact {
    public static void main(String[] args) {
        int num, fact = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        for (i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.printf("Factorial of %d: %d", num, fact);

    }
}

/*
 * Enter the number:
 * 5
 * Factorial of 5: 120
 * 
 */