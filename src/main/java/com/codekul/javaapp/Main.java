/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javaapp;

import com.codekul.javaapp.exceptionhandling.ExceptionStater;
import com.codekul.javaapp.filehandling.FileStarter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melayer
 */
public class Main {
    
    public static void main(String[] args) {

        try {
            fileStarter();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static void exceptionStarter() throws Exception{
        
        ExceptionStater starter = new ExceptionStater();
        //starter.fundamentals();
        
        starter.customException();
    }
    
    public static void fileStarter() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        FileStarter starter = new FileStarter();
        starter.fundamentals();
        starter.createNewFile("/home/melayer/Desktop/android.java");
        starter.deleteFile("/home/melayer/Desktop/Our.java");
        starter.makeFileDirectry("/home/melayer/Desktop//Vitthal/oracle.txt");
        
        starter.writeUsingOutputStream();
        starter.writeUsingWriter();
        starter.readUsingInputSteram();
        starter.readUsingReader();
        
        starter.writePrimitiveTypesUsingDataOutputStream();
        starter.readPrimitiveTypesUsingDataInputStream();
        
        starter.writeObjectUsingObjectOutputStream();
        starter.readObjectUsingObjectInputStream();
    }
}
