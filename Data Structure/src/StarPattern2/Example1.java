package StarPattern2;

import java.util.Scanner;

public class Example1 
{
    public static void print(int n)
    {
        for (int i = 1; i <= n; i++) 
          {
              for (int j = 1; j <=i; j++) 
              {
                  System.out.print("*" +"  ");           
              }
              System.out.println(" ");
          }
    }    
    
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number: ");
         int n=sc.nextInt();
         Example1.print(n);
    }
}
