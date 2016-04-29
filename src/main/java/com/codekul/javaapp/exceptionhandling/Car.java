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
public class Car {
    
    public void speedUp(int speed) throws ArithmeticException,Exception{
        
//checked exceptions i.e. who extends drrectly to Exception or its children but not RuntimeException are specified on the method by throws keyword       
        int torque = 100 /speed; // throw new ArithmaticException();
        System.out.println("Car Torque - "+torque);
    }
    
    public void speedUp(double speed){

// unchecked exceptions i.e. who extends RuntimeException directly or indirectly can be handled by try .. catch block
        try {
            int troque = (int) (1000/speed);
            
            int arr[] = {1,1,1,1};
            arr[10] = 12;
        } 
        
        /*catch(Throwable e){
            e.printStackTrace();
        }*/
       catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        catch(Throwable e){
            e.printStackTrace();
        }
        
        System.out.println("Application working");
    }
    
    public void validateName(String name){
        if(!(name.charAt(0) == 'm' || name.charAt(0) == 'M')){
            throw new InvalidNameException();
        }
        System.out.println("Car Name is - "+name);
    }
}
