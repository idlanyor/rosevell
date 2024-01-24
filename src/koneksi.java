

/**
 *
 * @author rosevell
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection mysqlconfig;
    public static Connection koneksi(){
        try {
            String url="jdbc:mysql://localhost:3306/perpusjav"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Tidak Connect ke Database"); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
}