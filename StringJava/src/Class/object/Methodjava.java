
package Class.object;

import static com.sun.javafx.animation.TickCalculation.sub;
import static java.lang.Double.sum;

public class Methodjava {
   int sum=0;
   
   public int sum(int x,int y)
   {
       sum=x+y;
       return sum;
   }  
   
   public int sub(int x,int y)
   {
       sum=x-y;
       return sum;
   } 
}


class UseAddition
{
    public static void main(String[] args) {
       Methodjava sum= new Methodjava();
       int s1=(int) sum(41,55);
       System.out.println("Sum Of numbers is :"+s1);
       
       int s2=  (int)sub(80,55);
       System.out.println("Sub. Of numbers is :"+s2);
       
    }

}