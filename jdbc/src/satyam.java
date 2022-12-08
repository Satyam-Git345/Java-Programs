
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



class satyam
{
   public static void main(String args[])
    {
              
        try
          {
               Class.forName("oracle.jdbc.OracleDriver");

               System.out.println("Driver Loaded Sucessfully!!");
               Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","naman","satyam");
               System.out.println("Connected Sucessfully  to the DB!!");   
               Statement st =conn.createStatement();
               ResultSet rs=st.executeQuery("select bookname,bookprise ,subject from allbooks");
               System.out.println(" ");
                
               while(rs.next())
                {
                      String name=rs.getString(1);
                      Double price=rs.getDouble(2);
                      String subjectname=rs.getString(3);
                     System.out.println(name+"\t"+price+"\t"+subjectname);
                 }
                       conn.close();
                      System.out.println("Disconnected Sucessfully  to the DB!!");   


          }

                 catch(SQLException ex)
                   {
                      System.out.println("DB Error!!");  
                      ex.printStackTrace();
                   }
          
                 catch(ClassNotFoundException cnf)
                  {
                     System.out.println("Cannot load the driver");
                     cnf.printStackTrace();
                  }

                 

            }

}