/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APJ2Test1;

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
public class ProductsImpl implements ProductsInterface{

    @Override
    public List<Products> loadData() {
        SingleDBConn s=new SingleDBConn();
        List<Products> list=new ArrayList<>();
        try(
                Connection conn=s.getConn();
            ){
            PreparedStatement pre=conn.prepareStatement("select * from tblproducts");
            ResultSet rs= pre.executeQuery();
            while(rs.next()){
            list.add(new Products(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return list;
        }catch(SQLException e){
        e.printStackTrace();
        }
        return list;
    }

    @Override
    public int addData(String code, String name, String desc) {
        SingleDBConn s=new SingleDBConn();
        try(
        Connection conn=s.getConn();
                ){
        PreparedStatement pre=conn.prepareStatement("insert into tblproducts values(?,?,?)");
        pre.setString(1, code);
        pre.setString(2, name);
        pre.setString(3, desc);
        int get= pre.executeUpdate();
        if(get>0){
        return 1;
        }
        }catch(SQLException e){
        e.printStackTrace();
        }
        return 0;
    }
    
}
