
package Stack;

import java.util.Arrays;

public class DeletelastArray 
{
    public static void main(String[] args) 
    {
        int [] arr={10,15,55,6,7,55,66,44,88};
        
        int [] brr=new int[arr.length-1];
        
        System.out.println("Original Array : "+Arrays.toString(arr)); 
        
        for (int i = 0; i < arr.length-1; i++) 
        {
           brr[i]=arr[i];     
        }
        
         System.out.println("After Deleting Last Element : "+Arrays.toString(brr));  
    }
 }

   