//Inserting Data in End Of The Array

//When array is Not Full

package Stack;

import java.util.Scanner;

public class Satyam
{
   public static int add_at_end(int [] arr,int freePos,int data)
   {
      arr[freePos]=data;    
      freePos++; 
      return freePos;
   }
   
   public static void main(String[] args) 
   {
       Scanner sc=new Scanner(System.in);
       int[] arr=new int[10];
       int i,n,freePos;
       
       System.out.println("Length Of Ayyay is: "+arr.length);
       System.out.println("Enter The Number Of Elements: ");
       n=sc.nextInt();
       
       System.out.println("Enter The Elements Of Array: ");
        
       for (int j = 0; j <n; j++) 
       {
            int y=sc.nextInt();
            arr[j]=y;
       }
       
       freePos=n;
       
       System.out.println("Before Calling Funcation : ");
       for (int j = 0; j < freePos; j++) 
                System.out.println("\t"+arr[j]);
           
       
       
       freePos=Satyam.add_at_end(arr,freePos,60);
       freePos=Satyam.add_at_end(arr,freePos,70);
       
       System.out.println("After Calling Funcation: ");
       
       for (int j = 0; j < 10; j++) 
                System.out.println("\t"+arr[j]);
           
       
    }

}