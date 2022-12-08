package Class.object;

import java.util.Scanner;

class Data1 {

    static {
        System.out.println("Thank you For using the app!!");
    }

    public static int Max(int a, int b) {
        if (a > b) {
            return a;
        } else if (a == b) {
            return 0;
        } else {
            return b;
        }
    }

}

class UseData1 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int a = kb.nextInt();
        int b = kb.nextInt();

        int max = Data1.Max(a, b);

        if (max == 0) {
            System.out.println("Both Are equall!!");
        } else if (max == a) {
            System.out.println(" A is greater!! ");
        } else {
            System.out.println(" B is greater!! ");
        }
             System.out.println(Integer.MAX_VALUE);
             System.out.println(Integer.MIN_VALUE);
    }
}
