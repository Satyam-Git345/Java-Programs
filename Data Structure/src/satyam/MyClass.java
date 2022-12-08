package satyam;

public class MyClass 
{
   int var;  

   public MyClass(int param) 
   {
        var = param;
   }
   
   public static void main(String[] args)
   {
       MyClass a=new MyClass();
       MyClass b=new MyClass(5);
   }
}
