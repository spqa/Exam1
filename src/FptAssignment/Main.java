/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FptAssignment;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author QuangAnh
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserManager um = new UserManager();
        int choice;
        while (true) {
            System.out.println("1.Create a new Account");
            System.out.println("2.Login System");
            System.out.println("3.Exit");
            System.out.print("Enter choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    um.CreateAcount();
                    break;
                case 2:
                    um.LoginSystem();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
