package Basicprograms;
import java.util.Scanner;

public class ArmStrongNumber 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = sc.nextInt();
       
       int temp=n;
       int sum=0,r;
       
       while(temp>0) 
       {   
           r=temp%10;
           sum=sum+(r*r*r);
           temp=temp/10;
       }
       
         if(n==sum)
             System.out.println(n+" is a Armstrong Number....");
         else
             System.out.println(n+" is not a Armstrong Number....");
         
    }
    
}
