package Stack;

import java.util.Scanner;

public class ArrayFull 
{
    public static int add_at_end(int[] arr,int[] brr,int freepos,int data)
    {
      int i;
      for(i=0;i<arr.length;i++)
              brr[i]=arr[i];
      
         brr[freepos]=data;
         freepos+=1;
         return freepos;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[3];
        int n,i,freepos;
        
        
        System.out.print("Enter the Number of elements of the Array: ");
        n=sc.nextInt();
        for ( i = 0; i < n; i++) 
                    arr[i]=i;    
        
        freepos=n;
       
        
        
        if(n==arr.length)
        {
           int [] brr=new int[arr.length+2];
           
           freepos=ArrayFull .add_at_end(arr, brr, freepos, 3);
           freepos=ArrayFull .add_at_end(arr, brr, freepos, 4);
           
           System.out.println("After Inserting Element Another Array");
           for ( i = 0; i < freepos; i++) 
                   System.out.println("\t"+ brr[i]);    
           
           System.out.println("");
            
           System.out.println("Actual Array is: ");
           for ( i = 0; i < arr.length; i++) 
                   System.out.println("\t"+ arr[i]);
        }
    }
    
}
