/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.javaapp.filehandling;

import java.io.Serializable;

/**
 *
 * @author melayer
 */
public class FileCar /*extends Object -> every class is subclass of Object */ implements Serializable{
    
    private String name;
    private int type;
    private double  price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FileCar{" + "name=" + name + ", type=" + type + ", price=" + price + '}';
    }
}
