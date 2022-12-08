package Stack;

import java.util.Arrays;

public class DeleteFirstArray 
{
     static int Del_first(int []arr,int n)
     {
         if(n==0)
             System.out.println("Array is Empty.......");
         
         for (int i = 0; i < arr.length-1; i++) 
         {
           arr[i]=arr[i+1];     
         }
         
         return n-1; 
     }
     
     public static void main(String[] args) 
     {
         int [] arr={10,15,55,6,7,55,66,44,88};
        
         System.out.println("Original Array: ");
        
         for (int i = 0; i < arr.length; i++) 
         {
            System.out.print(arr[i]+"\t");   
         }
        
         int n=DeleteFirstArray.Del_first(arr, arr.length);
         System.out.println("");
         
         System.out.println("After Deleting First Element: ");
        
         for (int i = 0; i < n; i++) 
         {
            System.out.print(arr[i]+"\t");   
         }
     }
 }
