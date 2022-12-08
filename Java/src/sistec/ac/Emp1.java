
package sistec.ac;

public class Emp1 
{
  public Emp1()
  {
      System.out.println("Constructor Called......");
  }
  
  static
  {
      System.out.println("Static block called.....");
  }
}

class UseEmp
{
    public static void main(String[] args) 
    {
       try
       {
          Class.forName("Emp1");
          Class.forName("Emp1");
          System.out.println("Class Loaded");
       }
       
       catch(ClassNotFoundException ex)
       {
           ex.printStackTrace();
           System.out.println("Class Not Found");
       }
    }
}