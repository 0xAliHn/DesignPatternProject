package com.example.AbstractFactory;

/**
 * Created by ali on 12/29/15.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
