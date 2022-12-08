package JavaConversion;

 class StringToDate2 
{

    
   StringToDate2(int x)
   {
        System.out.println("Constructor called "+x);
   }
    
    
}
  
public class test2
{
   StringToDate2  s=new StringToDate2(10);
   
   test2(int i)
   {
      s=new StringToDate2(i);
   }
   
    public static void main(String[] args) 
    {
         test2 t2=new test2(5);
         
    }
}
