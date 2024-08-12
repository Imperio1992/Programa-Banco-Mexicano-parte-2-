package pkg2024_2_actividad2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public Connection getConnection() {
        Connection con = null;
        String base = "bancobd";
        String url = "jdbc:mysql://localhost:3306/"+base;
        String user = "root";
        String password = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
        return con;
    }
}
