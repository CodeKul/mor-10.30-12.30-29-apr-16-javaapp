/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javaapp.filehandling;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author melayer
 */
public class FileStarter {

    public void fundamentals() {

        File file = new File("/home/melayer/Desktop/Our.java");

        if (file.exists()) {

            StringBuilder builder = new StringBuilder();
            builder.append("\n Name - ").append(file.getName());
            builder.append("\n Path -").append(file.getPath());

            System.out.println(builder.toString());
        } else {
            System.out.println("File does not exists ..");
        }
    }

    public void showRoots() {
        File[] roots = File.listRoots();
        for (File file : roots) {
            System.out.println("Root - " + file.getPath());
        }
    }

    public void createNewFile(String pathWithName) throws IOException {
        File file = new File(pathWithName);
        if (file.createNewFile()) {
            System.out.println("File created successfully ... ");
        } else {
            System.out.println("Problem in creating file ... ");
        }
    }

    public void deleteFile(String path) {
        File file = new File(path);
        System.out.println(file.delete() ? "file deleted successfully" : "File not found");
    }

    public void makeFileDirectry(String dir) throws IOException {
        File file = new File(dir);
        //file.mkdir();
        System.out.println(file.mkdir() ? "file directry created successfully" : "File directry not createted");

    }

    // writer or reader based classes manipulate character stream
    // output stream or input stream based classes manipulate byte stream
    public void writeUsingWriter() throws IOException {
        Writer writer = new FileWriter(new File("/home/melayer/Desktop/Our.java"));
        writer.write("Hello to file handling");
        writer.close();
    }

    public void writeUsingOutputStream() throws FileNotFoundException, IOException {
        OutputStream outputStream = new FileOutputStream(new File("/home/melayer/Desktop/Your.java"));
        outputStream.write("Hello world".getBytes());
        outputStream.close();
    }

    public void readUsingReader() throws FileNotFoundException, IOException {

        Reader reader = new FileReader(new File("/home/melayer/Desktop/Our.java"));
        StringBuilder builder = new StringBuilder();
        while (true) {
            int ch = reader.read();
            if (ch == -1) {
                break;
            } else {
                builder.append((char) ch);
            }
        }
        System.out.println("Data From file - " + builder.toString());
        reader.close();
    }

    public void readUsingInputSteram() throws FileNotFoundException, IOException {

        InputStream inputStream = new FileInputStream(new File("/home/melayer/Desktop/Our.java"));
        StringBuilder builder = new StringBuilder();

        while (true) {
            int ch = inputStream.read();
            if (ch == -1) {
                break;
            } else {
                builder.append((char) ch);
            }
        }
        System.out.println("Input Stream file data - "+builder.toString());
        inputStream.close();
    }
    
    public void writePrimitiveTypesUsingDataOutputStream() throws FileNotFoundException, IOException{

        FileOutputStream fos = new FileOutputStream(new File("/home/melayer/Desktop/primitive.txt"));
        DataOutputStream dos = new DataOutputStream(fos);
        
        dos.writeInt(10);
        dos.writeBoolean(true);
        dos.writeUTF("This is utf string");
        
        dos.close();
        fos.close();
    }
    
    public void readPrimitiveTypesUsingDataInputStream() throws FileNotFoundException, IOException{
        
        FileInputStream fis = new FileInputStream(new File("/home/melayer/Desktop/primitive.txt"));
        DataInputStream dis = new DataInputStream(fis);
        
        int _int = dis.readInt();
        boolean _boolean = dis.readBoolean();
        String _string = dis.readUTF();
        
        System.out.println(" Int - "+_int+" Boolean - "+_boolean+" String - "+_string);
        
        dis.close();
        fis.close();
    }
    
    public void writeObjectUsingObjectOutputStream() throws FileNotFoundException, IOException{
        
        FileOutputStream fos = new FileOutputStream(new File("/home/melayer/Desktop/oo.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        FileCar car = new FileCar();
        car.setName("Android");
        car.setPrice(13.56d);
        car.setType(2);
        
        oos.writeObject(car);
        
        fos.close();
        oos.close();
    }
    
    public void readObjectUsingObjectInputStream() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        FileInputStream fis = new FileInputStream(new File("/home/melayer/Desktop/oo.txt"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        FileCar car = (FileCar) ois.readObject();
        System.out.println(" Car is - "+car.toString());
        
        ois.close();
        fis.close();
    }
    
    public void takeInputFromUser() throws IOException{
        
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.println("You typed - "+reader.readLine());
    }
}
