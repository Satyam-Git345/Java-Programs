package AutomationLab;

import static AutomationLab.ShiftZeroRight.shiftZeroToRight;
import java.util.Arrays;


public class ShiftZeroRight 
{
   public  static int[] shiftZeroToRight(int[] a)
   {
      if(a.length==1)
      {
         return a;
      }
      
      int[] newArray=new int[a.length];
      int count=0;
     
      for(int number:a)
      {
         if(number==0)
         {
           newArray[count]=number;
           count++;
         }
      }
      
      System.out.println(Arrays.toString(a));
      return newArray;
   }    
}

class UseShiftZeroRight
{
    public static void main(String[] args) 
    {
       int[] i=new int[] {0,1,0,9,0,4,0,0,4,3,6,0};
       System.out.println(Arrays.toString(shiftZeroToRight(i)));
    }
}