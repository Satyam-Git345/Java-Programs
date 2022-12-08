package com.sistec;
import java.sql.*;
import java.util.Scanner;
public class JDBC {
      public static void main(String[] args)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded ");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-MVRSCE9C:1521/XE","satyam", "12345");
            Statement st = con.createStatement();
            Scanner kb = new Scanner(System.in);
            for(int i=1; i<=2 ; i++)
            {
                System.out.println("Enter the id , name ,sal = ");
                int id = kb.nextInt();
                String name = kb.next();
                double sal = kb.nextDouble();
                String qry ="insert into employee values ("+id+",'"+name+"',"+sal+")";
                System.out.println("qry = "+qry);
            int c = st.executeUpdate(qry);
            if(c==0)
                System.out.println("Not row updated");
            else
                System.out.println("No of row Updated = "+ c);
            } 
            con.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("error ="+e);
        }
        catch(SQLException e)
        {
            System.out.println("ERROR = "+e);
        }
    }
    
}


 