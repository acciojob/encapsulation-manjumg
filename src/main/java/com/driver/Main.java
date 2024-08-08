package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        
        // Using setter to set the name
        obj.setName("John");

        // Using getter to access the name
        System.out.println(obj.getName());  // Output will be "John"
    }
}
