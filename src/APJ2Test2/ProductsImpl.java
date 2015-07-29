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
public class ProductsImpl implements ProductsInterface {

    @Override
    public List<products> loadData() {
        SingleDbConn s = new SingleDbConn();
        List<products> list=new ArrayList<>();
        try(Connection conn=s.getConn()){
            PreparedStatement pre=conn.prepareStatement("select * from products");
            ResultSet rs=pre.executeQuery("select * from products");
            while(rs.next()){
                list.add(new products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
            }
            return list;
        }catch(SQLException e){
        e.printStackTrace();
        }
        return list;
    }


    @Override
    public int AddData(int id, String name, int price, int manuid) {
        SingleDbConn s=new SingleDbConn();
        try(Connection conn=s.getConn()){
            PreparedStatement pre=conn.prepareStatement("insert into products values(?,?,?,?)");
            pre.setInt(1, id);
            pre.setString(2, name);
            pre.setInt(3, price);
            pre.setInt(4, manuid);
            int get= pre.executeUpdate();
            if(get>0){
            return 1;
            }
        }catch(SQLException e){
        e.printStackTrace();
        }
        return 1;
    }

    @Override
    public int UpdateData(int id, String name, int price, int manuid) {
        SingleDbConn s=new SingleDbConn();
        try(Connection conn=s.getConn()){
            PreparedStatement pre=conn.prepareStatement("update products set productname=?,price=?,manuid=? where productid=?");
            pre.setString(1, name);
            pre.setInt(2, price);
            pre.setInt(3, manuid);
            pre.setInt(4, id);
            int get=pre.executeUpdate();
            if(get>0){
            return 1;
            }
        }catch(SQLException e){
        e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int DelData(int id) {
        SingleDbConn s=new SingleDbConn();
        try(Connection conn=s.getConn()){
            PreparedStatement pre=conn.prepareStatement("Delete from products where productid=?");
            pre.setInt(1, id);
            int get=pre.executeUpdate();
            if(get>0){
                return 1;
            }
        }catch(SQLException e){
        e.printStackTrace();
        }
        return 0;
    }

    @Override
    public products findData(int id) {
        SingleDbConn s=new SingleDbConn();
        try(Connection conn=s.getConn()){
            PreparedStatement pre=conn.prepareStatement("select * from products where productid=?");
            pre.setInt(1, id);
            ResultSet rs=pre.executeQuery();
            rs.next();
            return new products(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
        }catch(SQLException e){
        e.printStackTrace();
        }
        return null;
    }
    
}
