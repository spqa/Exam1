/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhvtAssignment;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QuangAnh
 */
public class MyBank implements Runnable{
    private float amount=10;
    public synchronized void withDrawAmount() throws InterruptedException{         
        while(amount>0){
            Thread.sleep(1000);
        amount--;
            System.out.println(amount);
        }
        if(amount == 0){
            System.out.println("Your account is Empty!");            
        }
        amount =10;
    }

    @Override
    public void run() {
        try {
            withDrawAmount();
        } catch (InterruptedException ex) {
            Logger.getLogger(MyBank.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        MyBank m=new MyBank();
        
        Thread t1=new Thread(m);
        Thread t2=new Thread(m);
        t1.start();
        t2.start();
    }
}
