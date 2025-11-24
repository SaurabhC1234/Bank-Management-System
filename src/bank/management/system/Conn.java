package bank.management.system;

import java.sql.*;
public class Conn {
   public Connection connection;
   public Statement statement;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Root73020");
            statement = connection.createStatement();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
