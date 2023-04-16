package jdbcIntro;

import staticDemo.DatabaseHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DpHelper {
    private String username = "root";
    private String password = "'\"-LhCB'.%k[4S]z";
    private String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error :"+exception.getMessage());
        System.out.println("Error code :"+exception.getErrorCode() );
    }

}
