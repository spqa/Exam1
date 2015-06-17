/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Market;

import java.util.Scanner;

/**
 *
 * @author QuangAnh
 */
public class Item {
    int id;
    String name;
    double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item() {
    }

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void display(){
        System.out.println(this.id+"\t"+this.name+"\t"+this.price);
    }
    public void input(){
        System.out.println("Enter ID:");
        Scanner sc=new Scanner(System.in);
        this.id=sc.nextInt();sc.nextLine();
        System.out.println("Enter NAME:");
        this.name=sc.nextLine();
        System.out.println("Enter Price");
        this.price=sc.nextDouble();
                
    }
}
