package com.example.AbstractFactory;

/**
 * Created by ali on 12/29/15.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
