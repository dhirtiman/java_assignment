import java.io.*;
import java.util.Scanner;

// 2. Write a java program to find the sum of the digits of the given number

class SumDig {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a nunber");
        num = sc.nextInt();
        sc.close();

        while (num!=0) {
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of digits: "+sum);

       
    }
}

/*
enter a nunber
123
Sum of digits: 6
*/