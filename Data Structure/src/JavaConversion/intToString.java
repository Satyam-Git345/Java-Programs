
package JavaConversion;


public class intToString 
{
    public static void main(String[] args) 
    {
       //1.  
       int i=400;
       
       String s=String.valueOf(i);
       System.out.println(s);
       
       //2.
       
       String s1=Integer.toString(i);
       System.out.println(s1);
    }
    
}
