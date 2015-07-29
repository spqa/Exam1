/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APJ2Test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QuangAnh
 */
public class SingleDbConn {
    public Connection getConn(){
    Connection conn=null;
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/products", "root", "");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(SingleDbConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    return conn;
    }
    
}
