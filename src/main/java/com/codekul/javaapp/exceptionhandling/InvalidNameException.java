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
public class InvalidNameException extends RuntimeException{

    @Override
    public synchronized Throwable getCause() {
        return super.getCause(); 
    }

    @Override
    public String toString() {
        return super.toString() +" : Car name must start with M"; 
    }
}
