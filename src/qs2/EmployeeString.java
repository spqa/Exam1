/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangAnh
 */
public class EmployeeString {
    public static void main(String[] args) {
        ArrayList<Employee> emp;
        emp=new ArrayList<>();
        int n;
        System.out.println("Input n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
        Employee e=new Employee();
        e.input();
        emp.add(e);
        }
        System.out.println("Name\tSex");
        for(int k=0;k<n;k++){
            emp.get(k).display();
        }
    }
}
