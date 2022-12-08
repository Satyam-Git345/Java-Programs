package Matrixprograms;

import java.util.Scanner;

public class Matrixmulti 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        
        System.out.println("Enter the Value for Row and Column for matrix1: ");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        
        
        System.out.println("Enter the Value for Row and Column for matrix2: ");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        
        int [][] arr=new int[row1][col1];
        int [][] brr=new int[row2][col2]; 
        
        if(col1!=row2)
        {
            System.out.println("Cannot Multiply Matrix..... ");
          
        }
        else
        {
           
        System.out.println("Enter The Element For First Matrix :");
        for(int i = 0; i < row1; i++) 
        {
            for(int j = 0; j < col1; j++)
            {
                int x=sc.nextInt();
                arr[i][j]=x;
            }
            System.out.println("\t");
        }
        
        
        
        System.out.println("Enter The Element For Second Matrix :");
        for(int i = 0; i < row2; i++) 
        {
            for(int j = 0; j < col2; j++)
            {
                int x=sc.nextInt();
                brr[i][j]=x;
            }
            System.out.println("\t");
        }
        
        
        System.out.println("First Matrix :");
        for(int i = 0; i < row1; i++) 
        {
            for(int j = 0; j < col1; j++)
            {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println("");
        }
        
        
        System.out.println("Second Matrix :");
        for(int i = 0; i < row2; i++) 
        {
            for(int j = 0; j < col2; j++)
            {
                System.out.print(brr[i][j]+"   ");
            }
            System.out.println("");
        }
        
        
        System.out.println("Matrix Multiplication is: ");
        int [][] product=new int[10][10];
      
        
       
        for (int i = 0; i < row1; i++) 
        {
            for (int j = 0; j <  col2; j++) 
            {
                for (int k = 0; k < row2; k++) 
                {
                   sum+=arr[i][k]*brr[k][j];            
                }
               product[i][j]=sum; 
               sum=0;
            }
        }
        
        
        for(int i = 0; i < row1; i++) 
        {
            for(int j = 0; j < col2; j++)
            {
                System.out.print(product[i][j]+"   ");
            }
            System.out.println("");
        }
    }
    }
}
