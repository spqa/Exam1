/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhvtAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author QuangAnh
 */
public class Employee {

    private String name;
    private int yob;
    private String address;
    private String phoneNo;
    private String email;
    static final String phone_regex = "^[0-9]{4}.[0-9]{3}.[0-9]{3}$";

    public Employee() {
    }

    public Employee(String name, int yob, String address, String phoneNo, String email) {
        this.name = name;
        this.yob = yob;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void input() throws IOException {
        boolean isValid = false;
        System.out.println("Enter name:");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        this.name = b.readLine();
        while (isValid == false) {
            try {
                System.out.println("Enter yob:");
                this.yob = Integer.parseInt(b.readLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.err.println("Wrong input pls reenter!!");
            }
        }
        System.out.println("Enter Address:");
        this.address = b.readLine();
        while (true) {
            System.out.println("Enter phoneNumber:");
            this.phoneNo = b.readLine();
            Pattern p = Pattern.compile(phone_regex);
            Matcher m = p.matcher(phoneNo);
            if (m.matches()) {
                break;
            }
        }
        System.out.println("Enter Email:");
        this.email = b.readLine();
    }

    public void display() {
        System.out.println(this.name + " - " + this.yob + " - " + this.address + " - " + this.email + " - " + this.phoneNo);
    }
}
