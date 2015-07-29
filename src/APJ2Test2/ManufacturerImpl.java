/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APJ2Test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QuangAnh
 */
public class ManufacturerImpl {
    public List<Manufacturers> getManuData(){
        SingleDbConn s=new SingleDbConn();
        List<Manufacturers> lst=new ArrayList<>();
        try(Connection conn=s.getConn()){
            PreparedStatement pre=conn.prepareStatement("select * from manu");
            ResultSet rs= pre.executeQuery();            
            while(rs.next()){
                lst.add(new Manufacturers(rs.getInt(1), rs.getString(2)));
            }
            return lst;
        }catch(SQLException e){
        e.printStackTrace();
        }
        return lst;
    }
    public Manufacturers getManu(int manuId){
        SingleDbConn s=new SingleDbConn();
        try(Connection conn=s.getConn()){
            PreparedStatement pre=conn.prepareStatement("select * from manu where manuid=?");
            pre.setInt(1, manuId);            
            ResultSet rs= pre.executeQuery();
            rs.next();
            return new Manufacturers(rs.getInt(1), rs.getString(2));
        }catch(SQLException e){
        e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        ManufacturerImpl m=new ManufacturerImpl();
        Manufacturers mm=m.getManu(2);
        System.out.println(mm.getName());
    }
}
