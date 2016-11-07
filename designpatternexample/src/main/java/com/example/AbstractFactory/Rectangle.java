package com.example.AbstractFactory;

/**
 * Created by ali on 12/29/15.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
