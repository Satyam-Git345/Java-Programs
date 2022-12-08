package Matrixprograms;

import java.util.Scanner;

public class Example3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value for Row and Column: ");
        
        int row=sc.nextInt();
        int col=sc.nextInt();
        
        int [][] arr=new int[row][col];
        int [][] brr=new int[row][col];
        int [][] crr=new int[row][col];
        
        System.out.println("Enter The Element For First Matrix :");
        for(int i = 0; i < row; i++) 
        {
            for(int j = 0; j < col; j++)
            {
                int x=sc.nextInt();
                arr[i][j]=x;
            }
            System.out.println("");
        }
        
        System.out.println("Enter The Element For Second Matrix :");
        for(int i = 0; i < row; i++) 
        {
            for(int j = 0; j < col; j++)
            {
                int x=sc.nextInt();
                brr[i][j]=x;
            }
            System.out.println("");
        }
        
        for(int i = 0; i < row; i++) 
        {
            for(int j = 0; j < col; j++)
            {
                crr[i][j]=arr[i][j]+brr[i][j];
            }
        }

        System.out.println("");
        System.out.println("Sum of First and Second Matrix is: ");
        
        for(int i = 0; i < row; i++) 
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(crr[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
}
