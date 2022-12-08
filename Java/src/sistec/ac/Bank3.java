package sistec.ac;

public class Bank3 {

    public Bank3()
    {
        System.out.println("Constructor Called......");
    }

    static 
    {
        System.out.println("Static block called.....");
    }

    public static void main(String[] args) 
    {
      try 
        {
          Class<?> forName = Class.forName("Bank3");
            Class.forName("Bank3");
            System.out.println("Class Loaded");
        } 
        catch (ClassNotFoundException ex) 
        {
            ex.printStackTrace();
            System.out.println("Class Not Found");
        }
    }
}
