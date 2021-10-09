/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinh Van
 */
public class MyThread implements Runnable{
    private String txt;

    public MyThread(String txt) {
        this.txt = txt;
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread( new MyThread("Số tự nhiên Thread one: ")),
                t2 = new Thread( new MyThread("Số tự nhiên Thread two: "));
        t1.setPriority(10);
        t2.setPriority(1);
        t2.start();
        t1.start();        
    }

    @Override
    public void run() {
        System.out.println(txt);
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
