/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APJ2Test1;

/**
 *
 * @author QuangAnh
 */
public class Products {
    private String code;
    private String name;
    private String desc;

    public Products() {
    }

    public Products(String code, String name, String desc) {
        this.code = code;
        this.name = name;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String[] toStringArr(){
        String[] temp={this.code,this.name,this.desc};
        return temp;
    }
}
