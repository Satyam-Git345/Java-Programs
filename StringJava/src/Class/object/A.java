
package Class.object;

public class A 
{
    public static void main(String[] args) 
    {
      try
    {
      Float f1 =new Float("3.0");
      int i=f1.intValue();
      byte b=f1.byteValue();
      /*double d=f1.doubleValue();*/*/
        System.out.println(i+b+d);
    }
     catch (NumberFormatException ex)
     {
         /*System.out.println("Bad number");**** */
     }
  }
}
