/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draft;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QuangAnh
 */
public class thread2 extends Thread{
    String line;

    public thread2(String line) {
        this.line = line;
    }
    
    public void display() throws InterruptedException{
        synchronized (line){
        System.out.println(line);
        line.wait();
        }
    }

    @Override
    public void run() {
        try {
            display(); //To change body of generated methods, choose Tools | Templates.
        } catch (InterruptedException ex) {
            Logger.getLogger(thread2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
