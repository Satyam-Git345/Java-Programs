package Basicprograms;

import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number to chack prime or not: ");
       int n=sc.nextInt();
       
       int i,m=0,flag=0;
       
       if(n==1 || n==0)
       {
            System.out.println(n +" is not a prime number.......");
       }
       
       else
         {  
            for (i =2; i < n; i++) 
            {
                 if(n%i==0)
                 {
                    System.out.println(n +" is not a prime number.......");
                    flag=1;
                    break;
                 }
             }
         
            if(flag==0)
               System.out.println(n +" is a prime number.......");
         }
    }
}
