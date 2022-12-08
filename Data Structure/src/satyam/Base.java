package satyam;

public class Base 
{
   int x;

    public Base(int _x) 
    {
        x = _x;
    }
}

class Derived extends Base
{
    int _y;
    
    public Derived(int y, int _x) 
    {
        y = _y;
        super(_x);
    }
    
    void Display(int x,int y)
    {
       System.out.println(x);
       System.out.println(y);
    }
}

 class Main
{
    public static void main(String[] args) 
    {
       Derived d=new Derived(10,20);
       d.Display(12,55);
    }
}