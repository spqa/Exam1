/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp2Exam;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QuangAnh
 */
public class ThreadTwo extends Thread{
String line;

    public ThreadTwo(String line) {
        this.line=line;
    }

    public void Display(String line) throws InterruptedException {
        while (true) {
            synchronized (line) {
                System.out.println(line);
                line.notify();
                line.wait();
            }
        }
    }

    @Override
    public void run() {
    try {
        Display(this.line); //To change body of generated methods, choose Tools | Templates.
    } catch (InterruptedException ex) {
        Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    

}
