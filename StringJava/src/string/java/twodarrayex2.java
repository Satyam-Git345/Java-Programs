package string.java;

import java.util.Scanner;


public class twodarrayex2 
{
    public static void main(String[] args) 
    {
       Scanner kb=new Scanner(System.in);
       int [][]arr;
       int sum=0;
       System.out.println("Enter the values of row and column: ");
       int row=kb.nextInt();
       int col=kb.nextInt();
       arr=new int[row][col];
       
       for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter numbers in row "+(i+1));
	    for(int j=0;j<arr[0].length;j++)
       	     {
	        arr[i][j]=kb.nextInt();
		sum=sum+arr[i][j];
             }
        }
       
        System.out.println(" ");
       
        
	for(int i=0;i<arr.length;i++)
	{
	    for(int j=0;j<arr[0].length;j++)
	    {
	        System.out.print(arr[i][j]+"\t ");
	    }
        	System.out.println("\n");
	}
        
        
       System.out.println("\n\nSum of all numbers is ="+sum+"\nAverage= "+((float)sum/(row*col)));
    }

       
 }
    

