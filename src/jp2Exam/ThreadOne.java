/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp2Exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QuangAnh
 */
public class ThreadOne extends Thread{
String line;

    public String getLine() {
        return line;
    }

    public ThreadOne(String line) {
        this.line=line;
    }         
    
    public void read() throws FileNotFoundException, IOException, InterruptedException {
        synchronized (line) {
            BufferedReader b = new BufferedReader(new FileReader("test.txt"));
            while (b.readLine() != null) {
                line = b.readLine();
                
                line.notify();
                line.wait();
            }
        }
    }

    @Override
    public void run() {
    try {
        read(); //To change body of generated methods, choose Tools | Templates.
    } catch (IOException ex) {
        Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InterruptedException ex) {
        Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    

  
    

}
