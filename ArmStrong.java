import java.lang.Math;
import java.util.Scanner;

// 7. Write a java program to check whether the given number is Armstrong Number or not
class ArmStrong {
    public static void main(String[] args) {
        double num, sum = 0, digits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int n = (int) num;
        while (n != 0) {
            digits++;
            n /= 10;
        }
        n = (int) num;
        while (n != 0) {
            sum += Math.pow(n % 10, digits);
            n /= 10;
        }

        if (num == sum) {
            System.out.print("it is an Armstrong number");
        } else {
            System.out.print("it is not an Armstrong number");

        }

    }
}

/*
Enter the number: 153
153 is an Armstrong number

Enter the number: 151
151 is not an Armstrong number

*/