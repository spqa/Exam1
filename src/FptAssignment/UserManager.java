/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FptAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QuangAnh
 */
public class UserManager {

    List<User> ListUser = new ArrayList<>();

    public void CreateAcount() throws IOException {
        File f = new File("user.dat");
        if (f.exists()) {
            System.out.println("File already exists!!");
        } else {
            f.createNewFile();
            System.out.println("user.dat has been created!");
        }
        User temp = new User();
        System.out.println("Enter user information");
        temp.input();
        ListUser.add(temp);
        FileOutputStream fi = new FileOutputStream("user.dat");
        ObjectOutputStream o = new ObjectOutputStream(fi);
        o.writeObject(ListUser);
        o.close();
    }

    public void LoginSystem() throws IOException, ClassNotFoundException {
        boolean isExist = false;
        try {
            FileInputStream fi = new FileInputStream("user.dat");
            ObjectInputStream o = new ObjectInputStream(fi);
            List<User> temp = (ArrayList<User>) o.readObject();
            User u = new User();
            u.input();
            for (User temp1 : temp) {
                if (temp1.name.equals(u.name) && temp1.pass.equals(u.pass)) {
                    isExist = true;
                }
            }
            if (isExist == true) {
                System.out.println("Login Successfully!!!!");
            } else {
                System.out.println("Not Success!");
            }
            o.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!!!");
        }

    }
}
