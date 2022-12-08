
package sistec.ac;

public class Bank 
{
   final int Rate_of_interst=99;
   
   static void Run()
   {
       System.out.println("Static Method running.......");
   }
   
   final void run()
   {
       System.out.println("Running....");
   }
   
   
}



class Honda extends Bank
{
    public static void main(String[] args) 
    {
       //new Honda().run();
       Honda d= new Honda();
       d.run();
       Bank b=new Bank();
       System.out.println(b.Rate_of_interst);
       Bank.Run();
    }
}