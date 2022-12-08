
package string.java;

import java.util.Scanner;


public class Arrayexample2 
{
     public static void main(String[] args) 
     {
          int n,sum=0;
          
          Scanner kb =new Scanner(System.in);
          System.out.println("Enter the size of Array: \n");
          n= kb.nextInt();
          int[] arr=new int[n];
          System.out.println("Enter The Values of size "+n);
          for(int i=0; i<n; i++)
          {
             arr[i]=kb.nextInt();
             sum=sum+arr[i];
          }   
          System.out.println("Sum of Array is: "+sum);
          System.out.println("Average of Array Elements is: "+(float)sum/n);
     }
    
}
