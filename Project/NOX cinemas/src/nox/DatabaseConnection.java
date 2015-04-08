/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nox;
import java.sql.*;
import java.sql.Statement;
/**
 *
 * @author Vam
 */
public class DatabaseConnection {
   
    Connection Connect = null;
    DatabaseConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "passwd");
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    
}

