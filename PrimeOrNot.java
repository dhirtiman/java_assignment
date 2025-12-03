import java.io.*;
import java.util.Scanner;

//1. Write a java program to check whether a given number is prime or not

class PrimeOrNot {
    public static void main(String[] args) {
        int num;
        Boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a nunber");
        num = sc.nextInt();
        sc.close();

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime");
        } else {
            System.out.println(num + " is not a prime");
        }
    }
}