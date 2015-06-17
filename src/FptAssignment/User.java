/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FptAssignment;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author QuangAnh
 */
public class User implements Serializable {

    String name;
    String pass;

    public User() {
    }

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void input() {
        System.out.println("Enter name:");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.println("Enter Password:");
        this.pass = sc.nextLine();
    }

    public void display() {
        System.out.println("Name:" + this.name);
        System.out.println("Password:" + this.pass);
    }
}
