/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javaapp.exceptionhandling;

/**
 *
 * @author melayer
 */
public class ExceptionStater {
    
    public void fundamentals() throws Exception{
        
        Car car = new Car();
        car.speedUp(0);
        car.speedUp(12d);
    }
    
    public void customException(){
        
        Car car = new Car();
        try {
            car.validateName("mandroid");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
