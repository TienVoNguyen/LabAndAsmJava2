/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.model;

import java.util.Scanner;

/**
 *
 * @author Dinh Van
 */
public class Product{

    private String name;
    private double price;
    static Scanner sc = new Scanner(System.in);

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getImportTax() {
        return 0.1 * price;
    }

    @Override
    public String toString() {
        return name + "\t" + price + "\t" + getImportTax();
    }
    
}
