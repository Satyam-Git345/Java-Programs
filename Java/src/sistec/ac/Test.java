package sistec.ac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test 
{
   public static void main(String[] args) throws SQLException 
   {
        Connection conn=null;
        try 
        {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Loaded Sucessfully");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-MVRSCE9C:1521/xe",
                    "voteforchange", "vote");

            System.out.println("Connected Sucessfully to the DB");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM EMP");

            while (rs.next())
            {
                System.out.println(rs.getInt(1));
            }
        }
        
         catch(ClassNotFoundException cnfe)
         {
            System.out.println("Cannot load the driver class");
         }
        
         catch(SQLException ex)
         {
           System.out.println("Error in DB");
           ex.printStackTrace();       
         }
        
         finally
         {
               try
               {
                  if(conn!=null)
                  {
                    conn.close();
                    System.out.println("Connection Closed Sucessfully");
                  }  
               }
            
               catch(SQLException ex)
               {
                  ex.printStackTrace();
                  System.out.println("Problem in Closing the connection");
               }
          }
    }
}
