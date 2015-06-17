/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs2;

import java.util.Scanner;

/**
 *
 * @author QuangAnh
 */
public class Employee {

    String name;
    String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void input() {
        System.out.println("Name:");
        Scanner sc=new Scanner(System.in);
        this.name=sc.nextLine();
        if (this.name.contains("Van")) {
            this.sex = "Nam";
        } else if (this.name.contains("Thi")) {
            this.sex = "Nu";
        } else {
            this.sex = "Unknown";
        }
    }
    public void display(){
        System.out.println(this.name+"\t"+this.sex);
    }
}
