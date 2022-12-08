package Stack;

import java.util.Scanner;

public class LinearSearch 
{
    public static void main(String[] args) 
    {
      int[] arr={10,23,15,8,4,3,25,30,34,2,19};   
      int item,flag=0;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enrer Item ?");
      item=sc.nextInt();
      
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i]==item)
            {
               flag=i+1;
               break;
            }
            else
                flag=0;
        }
        
        if(flag!=0)
            System.out.println("Item Found at Location: "+flag);
        
        else
            System.out.println("Item Not Found.......");
    }
}