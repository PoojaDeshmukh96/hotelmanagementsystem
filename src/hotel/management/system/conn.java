package hotel.management.system;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hms?serverTimezone=UTC","root","");
            s=c.createStatement();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
//    public static void main(String arg[]){
//        conn a = new conn();
//    }
}
