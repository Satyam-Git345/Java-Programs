package Basicprograms;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0, temp, r;
        temp = n;

        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("Given Number is Palindrome.....");
        } else {
            System.out.println("Given Number is not Palindrome..... ");
        }
    }
}
