
package sistec.ac;

public class A 
{
    public A()
    {
        System.out.println("Parent class constructor invocked");
    }
    
    
}

class B extends A
{
    public B()
    {
        //super();
        System.out.println("Child class constructor invocked");
    } 
    
    {
        System.out.println("Instance Initializer Block is Invocked");
    }
}

class UseA
{
    public static void main(String[] args) 
    {
       B a=new B();        
    }
}