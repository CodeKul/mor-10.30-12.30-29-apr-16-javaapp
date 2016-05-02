/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javaapp.threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melayer
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run(); 
        for(int i = 0; i < 100; i++){
            try {
                MyThread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(getName() + " - "+i);
        }
    }
}
