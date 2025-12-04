import java.io.*;
import java.util.Scanner;

// q9 Write a java program to add two matrices using nested loop.

public class MatrixAdd {

    public static void printMatrix(int a[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] inputMatrix(int m, int n, Scanner sc) {
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int a[][], b[][], c[][];
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        m = sc.nextInt();
        n = sc.nextInt();

        System.out.println("Enter elements of matrix A:");
        a = inputMatrix(m, n, sc);
        System.out.println("Matrix A:");
        printMatrix(a, m, n);

        System.out.println("Enter elements of matrix B:");
        b = inputMatrix(m, n, sc);
        System.out.println("Matrix B:");
        printMatrix(b, m, n);

        c = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of Matrix A and B (Matrix C):");
        printMatrix(c, m, n);

    }
}

/*
 * Output
 * Enter the number of rows and columns:
 * 2 2
 * Enter elements of matrix A:
 * 1 1 1 1
 * Matrix A:
 * 1 1
 * 1 1
 * Enter elements of matrix B:
 * 1 1 1 1
 * Matrix B:
 * 1 1
 * 1 1
 * Sum of Matrix A and B (Matrix C):
 * 2 2
 * 2 2
 */