/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhvtAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author QuangAnh
 */
public class SingleDBconn {

    static final String JDBC = "com.mysql.jdbc.Driver";
    static final String DBURL = "jdbc:mysql://localhost:3306/qlsinhvien";
    static final String User = "root";
    static final String Pass = "";
    Connection conn = null;

    public Connection getconn() {

        try {
            Class.forName(JDBC);
            conn = DriverManager.getConnection(DBURL, User, Pass);
            System.out.println("connect successfully");
        } catch (SQLException ex) {
            System.err.println("Err database!");
        } catch (ClassNotFoundException e) {
            System.err.println("err driver jdbc!");
        }

        return conn;
    }
    
}
