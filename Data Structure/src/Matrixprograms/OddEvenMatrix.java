package Matrixprograms;

public class OddEvenMatrix 
{
     public static void main(String[] args) 
     {
        int rows,cols;    
        int odd=0,even=0;
        
        int a[][]={
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5}
                   };
        
        rows=a.length;
        cols=a[0].length;
        
        for (int i = 0; i < rows; i++) 
        {
           for (int j = 0; j < cols; j++) 
           {
                 if(a[i][j]%2==0)
                     even++;                 
                 else
                     odd++; 
           }
        }
        
         System.out.println("Even Elements In The Matrix:  "+even);
         System.out.println("Odd Elements In The Matrix:  "+odd);
     } 
}
