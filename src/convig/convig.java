package convig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class convig {
    private static Connection mysqlconvig;
    
    public static Connection ConvigDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/aeon";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconvig = DriverManager.getConnection(url, user, pass);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal : " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        return mysqlconvig;
    }
}
