package Basicprograms;

import java.util.Scanner;

public class FactorialNumber 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = sc.nextInt();
       int i,fact=1;
       
       for (i= n; i > 0; i--) 
              fact=fact*i; 
       
       System.out.println("Factorial Of "+n+" is "+fact);
    }
}
