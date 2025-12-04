import java.io.*;
import java.util.*;

class bank {
    int ac_no;
    String name;
    float balance;

    bank(int no, String n, float bal) {
        ac_no = no;
        name = n;
        balance = bal;
    }

    void printBalance() {
        System.out.println("Account Number = " + ac_no);
        System.out.println("Name = " + name);
        System.out.println("Balance = " + balance);
    }

    void deposit(float amt) {
        balance = balance + amt;
        System.out.println("Amount Deposited = " + amt);
        System.out.println("New Balance = " + balance);
    }

    void withdraw(float amt) {
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Amount Withdrawn = " + amt);
            System.out.println("Remaining Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class bankmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bank b = new bank(101, "Bikash", 5000);

        a: while (true) {

            System.out.println("\n\n1) Print Balance");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) exit");
            System.out.print("Enter your choice : ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    b.printBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit : ");
                    float d = sc.nextFloat();
                    b.deposit(d);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw : ");
                    float w = sc.nextFloat();
                    b.withdraw(w);
                    break;
                case 4:
                    System.out.println("exiting..");
                    break a;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}