package JavaConversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class stringToDate 
{
    public static void main(String[] args) throws ParseException 
    {
       try
       {
         String sDate="31/FEB/1998";
         SimpleDateFormat formatter1=new SimpleDateFormat("dd/MMM/yyyy"); 
         Date date=formatter1.parse(sDate);
         
         System.out.println(date);
         System.out.println(sDate);
       }
       
       catch(ParseException e)
       {
          System.out.println("Not Converted: ");
          e.printStackTrace();
       }
    }
}
