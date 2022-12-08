package satyam;

public class A {

}

 class B extends A {

}

 class C extends B {

}

 class OverLoadingScenarios
{
   void m1(A a)
   {
       System.out.println("I am in m1-A");
   }
   
   void m1(B b)
   {
       System.out.println("I am in m1-B");
   }
   
   void m1(C c)
   {
       System.out.println("I am in m1-C");
   }

}

 class OverloadingTest
 {
    public static void main(String[] args) 
    {
       OverLoadingScenarios obj=new OverLoadingScenarios();  
       A a=new A();
       obj.m1(a);
       
       B b=new B();
       obj.m1(b);
       
       C c=new C();
       obj.m1(c);
       
       B bc=new C();
       obj.m1(bc);
       
       A ab=new B();
       obj.m1(ab);
    }
 
 }