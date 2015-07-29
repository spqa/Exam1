/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APJ2Test2;

import java.util.List;
import java.util.Vector;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author QuangAnh
 */
public interface ProductsInterface {
    public List<products> loadData();
    public int AddData(int id,String name,int price,int manuid);
    public int UpdateData(int id,String name,int price,int manuid);
    public int DelData(int id);
    public products findData(int id);
}
