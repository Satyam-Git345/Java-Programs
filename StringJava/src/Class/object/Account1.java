package Class.object;

import java.util.Scanner;

class Account1 {

    private final int accid;
    private String name;
    private double balance;
    private static double rate_of_interst;

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rate of intrest: ");
        rate_of_interst = sc.nextDouble();
    }

    public Account1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Accountid, Name and Balance: ");
        accid = sc.nextInt();
        name = sc.next();

        balance = sc.nextDouble();

    }

    public void show() {
        System.out.println(name + "\t" + accid + "\t" + balance);
    }

    public void ShowRate() {
        System.out.println("rate of intrest= " + rate_of_interst);
    }

}

class UseAccount1 {

    public static void main(String[] args) {
        Account1 a = new Account1();
        Account1 b = new Account1();

        System.out.println("Custmors Details are: ");
        a.show();
        b.show();

        System.out.println(" ");
        System.out.println("Rate of Interst of Every Custmor: ");
        a.ShowRate();
        b.ShowRate();

    }
}
