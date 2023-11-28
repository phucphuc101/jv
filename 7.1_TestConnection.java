import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class 7.1_TestConnection
{
    public static void main (String[] args) {
        Connection connection = null;
        if(args.length !=1)
        {
            System.out.println("Syntax:java TestConnection " +"DSN");
            return;
        }
        try 
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Loading the drive...");
        } catch(Exception e) 
        {
            e.printStackTrace();
            return;
        }
        try{
            String dbURL = "jdbc:odbc:" + args[0];
            System.out.println("Establishing connection...");
            connection = DriverManager.getConnection(dbURL,"", "");
            System.out.println("connection to " + connection.getCatalog()+ "successfully!");
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();   
        }
        finally{
            if(connection!=null)
            {
                try{
                    connection.close();
                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
        
    }
}