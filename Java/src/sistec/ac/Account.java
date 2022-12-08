
package sistec.ac;

import java.util.Scanner;

public class Account 
{
   private int accid;
   private String name;
   private double Balance;
   private static double rate_of_interst;
   
   static 
   {
      System.out.println("Static Block 1 Executed"); 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Rate Of Interst: ");
      rate_of_interst =sc.nextDouble();
   }

   static
   {
      System.out.println(" "); 
      System.out.println("Static Block 2 Executed");
   }

   static
   {
      System.out.println(" "); 
      System.out.println("Static Block 3 Executed");
   }

    public Account() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter Accountid,Name and Balance: ");
        accid=sc.nextInt();
        name=sc.next();
        Balance=sc.nextDouble();
    }
    
    public void show()
    {
        System.out.println("");
        System.out.println(accid+","+name+","+Balance);
    }
    
    public static void ShowRateOfInterst()
    {
        System.out.println("");
        System.out.println("Rateofinterst: "+rate_of_interst);
    } 
      
}

  class UseAccount  
  {
     public static void main(String[] args)
     {
         Account a=new Account();
         a.show();
         Account.ShowRateOfInterst();
         
       
     }
  }

