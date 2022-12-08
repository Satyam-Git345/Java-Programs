package JavaPatternPrograms;

import java.util.Scanner;

public class Program6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int i,j;
        
        for (i = n; i>0; i--)
        {
           for (j = 0; j<i; j++)
           {
               System.out.print("*"+" ");
           }
           
           System.out.println("");
        }
    }
}
