package Basicprograms;

import java.util.Scanner;

public class PrimeUsingMethod {

    static void is_Prime(int n) {
        int i, m = 0, flag = 0;

        if (n == 1 || n == 0) {
            System.out.println(n + " is not a prime number.......");
        } else {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number.......");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println(n + " is a prime number.......");
        }
    }
}

class UsePrimeUsingMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to chack prime or not: ");
        int n = sc.nextInt();

        PrimeUsingMethod.is_Prime(n);
        PrimeUsingMethod.is_Prime(13);
        PrimeUsingMethod.is_Prime(23);
        PrimeUsingMethod.is_Prime(76);

    }
}
