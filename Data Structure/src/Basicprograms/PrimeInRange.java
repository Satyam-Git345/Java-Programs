package Basicprograms;

import java.util.Scanner;

public class PrimeInRange {

    static void is_Prime(int n) {
        int i, m = 0, flag = 0;

        if (n >= 0) {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println(n);
        }
    }
}

class UsePrimeInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the end number: ");
        int end = sc.nextInt();

        for (int i = start; i < end; ++i) {
            PrimeInRange.is_Prime(i);
        }

    }
}
