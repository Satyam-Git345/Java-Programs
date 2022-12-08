package JavaConversion;


public class StringToFloat 
{
    public static void main(String[] args) 
    {
       //String to float
       String s="99999.99";
       float f=Float.parseFloat(s);
       System.out.print("After Converting String to float : ");
       System.out.println(f);
       
       //Float to String
       float f2=87657898.99f;
       System.out.println(f2);
       String s2=String.valueOf(f2);
       System.out.println("After Converting float to String : ");
       System.out.println(s2);
       
       //String to double
       String s1="876897564786";
       double d=Double.parseDouble(s1);
       System.out.println("String to double " +d);
       
       //Double to String
       double d1=6765467.99999;
       String s3=String.valueOf(d1);
       System.out.println("double to string " +s3);
       
       System.out.println(Double.toString(d1));
        
    }
    
}
