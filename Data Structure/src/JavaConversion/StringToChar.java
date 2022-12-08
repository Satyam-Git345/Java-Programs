package JavaConversion;

public class StringToChar 
{
    public static void main(String[] args) 
    {
       //1. Using charat methood of String Class 
       String s="SATYAM SHUKLA";
       char c=s.charAt(0);
       char clast=s.charAt(s.length()-1);
       
       System.out.println("First Character is: "+c);
       System.out.println("Last Character is: "+clast);
       System.out.println("Length Of the String is: "+s.length());
       
       System.out.println("");
       
       //2. reading Character Using Loop
       for (int i = 0; i < s.length(); i++) 
       {
           char c1=s.charAt(i);
           System.out.println("Char at " +i+ " Index is: "+c1);
       }
       
       //3. Using ToCharArray method of String class
       
       char [] ch=s.toCharArray();
        
       for (int i = 0; i < ch.length; i++) 
       {
            System.out.println("Char at " +i+ " Index is: "+ch[i]);  
       }
       
        for (char d : ch) {
            System.out.println(d);
        }
    }
    
}
