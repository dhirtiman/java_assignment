import java.io.*;
import java.util.Scanner;

// 4. Write a java program to print Fibonacci Series

class Fibo {
    public static void main(String[] args) {
        int range;
        int f1 = 0, f2 = 1;

        System.out.println("enter a range: ");
        Scanner sc = new Scanner(System.in);
        range = sc.nextInt();
        sc.close();

        System.out.print(f1 + " " + f2 + " ");
        for (int i = 2; i < range; i++) {
            int next = f1 + f2;
            f1 = f2;
            f2 = next;

            System.out.print(next + " ");

        }

    }
}

/*
enter a range
10
0 1 1 2 3 5 8 13 21 34

*/