
package sistec.ac;
public class Bike 
{
   int speed;

    public Bike()
    {
        System.out.println("Constructor is invocked");
        System.out.println(speed);
    }
    
    static
    {
        System.out.println("Good Evening!!");
    }
   
}


class UseBike
{
    public static void main(String[] args) 
    {
      Bike a=new Bike();
      Bike b=new Bike();
       
    }
}