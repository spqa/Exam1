/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhvtAssignment;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author QuangAnh
 */
public class Hello {
    Locale lc=Locale.ENGLISH;
    int n1=100000;
    public void changeLanguage(){
        System.out.println("1.GB");
        System.out.println("1.VN");
        System.out.println("1.JP");
        System.out.println("Enter choice");
        Scanner sc=new Scanner(System.in);
        switch(sc.nextInt()){
            case 1:lc=new Locale("en", "GB");break;
            case 2:lc=new Locale("vi", "VN");break;
            case 3:lc=new Locale("ja", "JP");break;
        }
    }
    public void sayHello(){
        ResourceBundle rb=ResourceBundle.getBundle("minhvtAssignment.Language",lc);
        System.out.println(rb.getString("Hello"));
        NumberFormat n=NumberFormat.getInstance(lc);
        System.out.println(n.format(n1));
    }
    public static void main(String[] args) {
        Hello h=new Hello();
        while(true){
        h.changeLanguage();
        h.sayHello();
        }
    }
}
