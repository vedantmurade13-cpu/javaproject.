package employee.manage.system;
import java.sql.*;
public class connectsql {
    Connection c;
    
    Statement s;  
    public connectsql(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///employeemanager","root","Vedant@13");
            s=c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }  
}
