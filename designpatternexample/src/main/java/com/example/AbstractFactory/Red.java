package com.example.AbstractFactory;

/**
 * Created by ali on 12/29/15.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
