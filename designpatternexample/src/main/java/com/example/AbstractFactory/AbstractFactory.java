package com.example.AbstractFactory;

/**
 * Created by ali on 12/29/15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
