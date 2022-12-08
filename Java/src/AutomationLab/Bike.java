
package AutomationLab;

abstract class Bike 
{
    abstract void run();
    public void run2()
    {
        System.out.println("Good Morning.......");
    }
}

class Honda extends Bike
{
    void run() 
    {
        System.out.println("Running safely.......");
    }
    
    public static void main(String[] args) 
    {
       Honda H=new Honda();
       H.run2();
    }
}