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

/**
 *
 * @author QuangAnh
 */
public class check {
    public void read() throws FileNotFoundException, IOException{
        BufferedReader b=new BufferedReader(new FileReader("test.txt"));
        String line;
        while((line=b.readLine())!=null){
            
            System.out.println(line);
        }
    }
    public void read2() throws FileNotFoundException, IOException{
        BufferedReader b=new BufferedReader(new FileReader("test.txt"));
        String line;
        while(b.readLine()!=null){
            line=b.readLine();
            System.out.println(line);
        }
    }
    public static void main(String[] args) throws IOException {
        check c=new check();
        c.read();
        
    }
}
