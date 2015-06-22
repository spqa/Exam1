/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhvtAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QuangAnh
 */
public class EmpManager {
    List<Employee> listEmp=new ArrayList<>();
    public void input() throws IOException{
        for(int i=0;i<2;i++){
            System.out.println("============");
            System.out.println("Enter Employee number "+i+" :");
            Employee e=new Employee();
            e.input();
            listEmp.add(e);
        }
    }
    public void display(){
        for (Employee listEmp1 : listEmp) {
            listEmp1.display();
        }
    }
    public void writeToFile() throws IOException{
        File f=new File("test.txt");
        if(f.exists()){
            System.out.println("file is created");
        }else{
            System.out.println("Creating file...");
            f.createNewFile();
        }
        try(BufferedWriter b=new BufferedWriter(new FileWriter("test.txt"));){
            for (Employee listEmp1 : listEmp) {
                String temp=listEmp1.getName()+listEmp1.getYob()+listEmp1.getEmail();
                b.write(temp);
            }
        }
        
    }
}
