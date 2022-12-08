
package Class.object;

public class ArrayReturn 
{
   public int[] createArray(int n) 
   {
      int[] brr=new int[n];
      return brr;
   }
}


  class  UseArrayReturn
  {
      public static void main(String[] args) 
      {
          ArrayReturn  arr=new ArrayReturn ();
          int[] krr =arr.createArray(12);
         
          System.out.println("Ayyay Length="+krr.length);
      }
  } 
