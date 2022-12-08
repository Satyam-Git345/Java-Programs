package satyam;

public class Base2 
{
    public void Print()
    {
       System.out.println("Base");
    }    
}

class Devived2 extends Base2
{
      public void Print()
      {
         System.out.println("Derived");
      }
}

 class UseBase2
  {
     public static void DoPrint(Base2 o)
     {
        o.Print();
     }
    
     public static void main(String[] args) 
     {
        Base2 a=new Base2();
        
        Base2 b=new Devived2();
        
        Devived2 c=new Devived2(); 
        
        DoPrint(a);
        DoPrint(b);
        DoPrint(c);
     }
}