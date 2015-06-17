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
public class Main {
    public static void main(String[] args) {
        ItemMagager im=new ItemMagager();
        int choice;
        while(true){
            System.out.println("1. Input Item list");
            System.out.println("2. Display Item list");
            System.out.println("3. Find Item");
            System.out.println("4. Exit");
            System.out.println("Input choice:");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            switch(choice){
                case 1:im.setItem();break;
                case 2:im.getItem();break;
                case 3:im.findItem();
                case 4:System.exit(0);
            }
        }
    }
}
