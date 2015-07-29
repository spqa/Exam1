/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APJ2Test2;

/**
 *
 * @author QuangAnh
 */
public class products {
    private int id;
    private String name;
    private int price;
    private int manuId;

    public products() {
    }

    public products(int id, String name, int price, int manuId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manuId = manuId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getManuId() {
        return manuId;
    }

    public void setManuId(int manuId) {
        this.manuId = manuId;
    }
    public String[] toStringArray(){
    String[] temp={this.id+"",this.name,this.price+"",this.manuId+""};
    return temp;
    }
}
