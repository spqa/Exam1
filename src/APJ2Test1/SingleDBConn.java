/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APJ2Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QuangAnh
 */
public class SingleDBConn {
    public Connection getConn(){
    Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Products", "root", "");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(SingleDBConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
