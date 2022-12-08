package Matrixprograms;

public class SumOfEachRoCol 
{
     public static void main(String[] args) 
     {
        int rows,cols;    
        int SumRow,SumCol;
        
        int a[][]={
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5}
                   };   
        
         rows = a.length;
         cols = a[0].length;
         
         
         for (int i = 0; i < rows; i++) 
         {
             SumRow=0;
             for (int j = 0; j < cols; j++) 
             {
                 SumRow=SumRow+a[i][j];
             }
             
             System.out.println("Sum of "+(i+1)+" Row= "+SumRow);
          }
         
         
         System.out.println("");
         
         for (int i = 0; i < rows; i++) 
         {
             SumCol=0;
             for (int j = 0; j < cols; j++) 
             {
                 SumCol=SumCol+a[j][i];
             }
             
             System.out.println("Sum of "+(i+1)+" Col= "+SumCol);
          }
     }
    
}
