/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javaapp.threading;

/**
 *
 * @author melayer
 */
public class ThreadingStarter {
    
    public void createThreadByExtendingThread() throws InterruptedException{
        
        MyThread threadMango = new MyThread();
        threadMango.setName("mango");
        threadMango.setPriority(Thread.MAX_PRIORITY);
        threadMango.start();
        //threadMango.join();
        Thread.yield();
        
        MyThread threadApple = new MyThread();
        threadApple.setName("apple");
        threadApple.setPriority(Thread.NORM_PRIORITY);
        threadApple.start();
    }
    
    public void creatingThreadByImplementingRunnable(){
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 100 ; i++){
                    System.out.println(" "+i);
                }
            }
        };
        
        Thread thread = new  Thread(runnable);
        thread.setName("run-mango");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }
}
