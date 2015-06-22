/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp2Exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QuangAnh
 */
public class OneFile extends Thread {

    StoreString s = new StoreString();
    boolean isAvail=true;
    public OneFile() {
    }

    public void Read() throws InterruptedException {
        try (
                BufferedReader b = new BufferedReader(new FileReader("test.txt"))) {
            synchronized (s) {
                while ((s.line = b.readLine()) != null&&isAvail==true) {
                    
                    s.notify();
                    s.wait();
                    
                }
                if(s.line==null){
                    isAvail=false;
                    
                }
            }
        } catch (IOException e) {

        }
    }

    public void display() throws InterruptedException {
        synchronized (s) {
            while (true) {
                System.out.println(s.line+"  "+isAvail);
                
                s.notify();
                s.wait();
                
            }
        }
    }

    Runnable th1 = new Runnable() {

        @Override
        public void run() {
            try {
                Read();
            } catch (InterruptedException ex) {
                Logger.getLogger(OneFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    Runnable th2 = new Runnable() {

        @Override
        public void run() {
            try {
                display();
            } catch (InterruptedException ex) {
                Logger.getLogger(OneFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    public static void main(String[] args) {
        OneFile o = new OneFile();
        Thread th = new Thread(o.th1);
        Thread th1 = new Thread(o.th2);
        th.start();
        th1.start();
    }
}
