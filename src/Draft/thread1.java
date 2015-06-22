/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draft;

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
public class thread1 extends Thread{
    String line;

    public thread1(String line) {
        this.line = line;
    }
    
    public void read() throws FileNotFoundException, IOException{
        BufferedReader b= new BufferedReader(new FileReader("text.txt"));
        synchronized (line){
            line=b.readLine();
            line.notify();
        }
    }

    @Override
    public void run() {
        try {
            read(); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
