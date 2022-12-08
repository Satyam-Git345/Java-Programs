
package sistec.ac;

public class Bike1 
{
    final int speedLimit;
    
    public Bike1(int speedLimit) 
    {
       this.speedLimit = speedLimit;
    }
   
    public final void run()
    {
        System.out.println("Good Night Everyone");
    }
 }

 class Bike2 extends Bike1
  {

    public Bike2(int speedLimit) 
    {
        super(speedLimit);
    }
    
    @Override
    void run()
    {
       System.out.println("Good Morning Everyone");
    }

    
   public static void main(String[] args) 
    {
        Bike1 b=new Bike1(20);
        b.run();
    }
}



