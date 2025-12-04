import java.io.*;

// 5. Write a java program to find the number and sum of all the numbers greater
//   than 100 and less than 200 that are divisible by 7.
class NumSum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Numbers between 100 and 200 which are divisible from 7: ");
        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum: " + sum);
    }
}

/*
 * Numbers between 100 and 200 which are divisible from 7:
 * 105 112 119 126 133 140 147 154 161 168 175 182 189 196
 * Sum: 2107
 * 
 */