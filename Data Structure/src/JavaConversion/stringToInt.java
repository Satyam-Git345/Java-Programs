package JavaConversion;

public class stringToInt 
{
    public static void main(String[] args) 
    {
        String s1="Satyam";
        String s2="Satyam";
        System.out.println(s1==s2);
        
        //1.
        String s="200";
       
       int i=Integer.parseInt(s);
       System.out.println("After Converting to int i="+i);
       
       System.out.println(s+i);
       System.out.println(i+s);
       System.out.println(100+"100");
       System.out.println(i+100);
       
       //2.
       String s1="400";
       
       int j=Integer.valueOf(s1);
       System.out.println(j);
       
       //3.
       String s2="Good Morning";
       try
       {
           int k=Integer.parseInt(s2);
       }
       catch(Exception ex)
       {
          System.out.println("Not Convert String To int");
       }
        System.out.println((100/25.0)*Integer.parseInt("5") +50));
    }
}
