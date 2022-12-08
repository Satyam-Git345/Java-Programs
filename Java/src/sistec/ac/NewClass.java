
package sistec.ac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewClass 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
      try
         {
              int count=0;
              Class.forName("oracle.jdbc.OracleDriver");
              
              System.out.println("Driver loaded Sucessfully!!!");
        
              Connection Conn= DriverManager.getConnection("jdbc:oracle:thin:@//"
                      + "LAPTOP-MVRSCE9C:1521/xe","voteforchange","vote");
              
              System.out.println("Connected Sucessfully to DB!!");
       
              Statement st=Conn.createStatement();
              
              ResultSet rs=st.executeQuery("Select * from users");
        
              System.out.println("Users table record: ");
              
              System.out.println(" ");
            
              while(rs.next())
              {
                  System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));   
                  count++;
              }
              
              Conn.close();
              System.out.println(count);
              
              
        }
        
              catch(Exception e)
              {
                  e.printStackTrace();
              }
    }
}
