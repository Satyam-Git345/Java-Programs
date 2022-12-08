package StarPattern2;

import java.util.Scanner;

public class Example2
{
    public static void print(int n)
    {
        for (int i = 1; i <= n; i++) 
          {
              for (int j = i; j <=n; j++) 
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
         Example2.print(n);
    }
}
