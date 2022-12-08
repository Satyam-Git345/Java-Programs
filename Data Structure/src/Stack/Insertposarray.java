package Stack;

import java.util.Scanner;

public class Insertposarray 
{
    
    public void insertCerPoArray(int[] arr,int[] brr,int data,int pos)
    {
        int i;
        int index=pos-1;
       
        for (i = 0; i <= index-1; i++) 
        {
           brr[i]=arr[i]; 
        }
        brr[index]=data;
         
//        for (int j = pos; j < brr.length; j++) 
//        {
//            brr[i]=arr[i];
//        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Insertposarray s=new Insertposarray();
        
        int[] arr={2,34,21,6,7,8,90,67,23,39};
        int[] brr=new int [arr.length+1];
        
        int pos,data;
        
        System.out.println("Enter the position to insert array element: ");
        pos=sc.nextInt();
        
        System.out.println("Enter the data to insert in array: ");
        data=sc.nextInt();
        
        s.insertCerPoArray(arr,brr,data,pos);
        
        
        System.out.println("First array is: ");
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+"\t");
        }
        
        System.out.println("");
        
        System.out.println("Second array is: ");
        
        for (int i = 0; i < brr.length; i++) 
        {
            System.out.print(brr[i]+"\t");
        }
    }
    
}
