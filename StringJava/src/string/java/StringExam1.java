
package string.java;
        
import static java.awt.PageAttributes.MediaType.A;
import java.nio.charset.Charset;

public class StringExam1 {
      @SuppressWarnings("empty-statement")
      public static void main(String[] args) 
      {
            String s1="GeeksForGeeks";
            System.out.println("\nstring are:="+s1);
            
            String s2= new String("SatyamShukla\n");
            System.out.println("\nstring are:="+s2);            
            
            //First Constructor in String
            byte[] b_arr = {65,66,67,68,69,70};//Byte array
            
            String s=new String(b_arr);
            System.out.println("First con.= " + s);
            
             //Second Constructor in String
            byte[] b_arr2 = {65,66,67,68,69,70};
            Charset cs = Charset.defaultCharset();
            String s_byte_char = new String(b_arr, cs);
            System.out.println("\nSecond con: "+ s_byte_char);
            
            //Third Constructor in String
            
            byte[] b_arr3 = {65,66,67,68,69,70};
            String s4 = new String(b_arr, 1, 3);
            System.out.println("\nThird con: "+ s4);
            
            //Fourth Constructor in String
           
             byte[] b_arr4 = {65,66,67,68,69,70};
             String s5 = new String(b_arr, 1,4);
             System.out.println("\nFourth con: "+ s4);
             
             char[] a1={65,66,67,68,69,70,71};
             String s6= new String(a1);
             System.out.println("\nFifth con: "+ s6);
             
             char[] a2={65,66,67,68,69,70,71};
             String s7= new String(a2,1,6);
             System.out.println("\nSixth con: "+ s7);
             
             
             
             StringBuffer s8=new  StringBuffer("SatyamShukla");
             String s9=new String(s8);
             System.out.println("\nSeventh con: "+ s9);             
      }
    
}
