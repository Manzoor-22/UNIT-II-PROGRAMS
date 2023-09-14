
import java.sql.*;

public class SQL1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/New";
            String username = "root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url,username,password);
            
            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connection created");
            }
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
