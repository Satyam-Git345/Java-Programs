package Matrixprograms;

public class transposeMatrix 
{
    public static void main(String[] args)
    {
       int[][]arr={
                    {1,2,3,8},
                    {6,7,9,3},
                    {2,9,9,2},
                    {1,4,6,7}
                  };    
       
       int row=arr.length;
       int cols=arr[0].length;
       
       int[][]brr=new int[row][cols];
       
       for (int i = 0; i < row; i++) 
       {
            for (int j = 0; j < cols; j++)
            {
               brr[i][j]=arr[j][i];
            }    
       }
        
        System.out.println("Matrix is: ");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j]+" ");
            }    
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matrix is after transpose: ");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(brr[i][j]+" ");
            }    
            System.out.println("");
        }
    }
}
