
/**
 *
 * @author rosevell
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection sqliteConfig;

    public static Connection koneksi() {
        try {
            String url = "jdbc:sqlite:perpusjav.db"; // url database
            // String user = "root"; // user database
            // String pass = ""; // password database
            DriverManager.registerDriver(new org.sqlite.JDBC());
            sqliteConfig = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak Connect ke Database"); // perintah menampilkan error pada koneksi
        }
        return sqliteConfig;
    }
}