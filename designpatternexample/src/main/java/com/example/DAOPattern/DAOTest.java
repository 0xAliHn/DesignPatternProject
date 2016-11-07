package com.example.DAOPattern;

import java.io.Serializable;

// Circle.java
class Circle {
    private int xPos, yPos;
    private int radius;
    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }
    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    public CircleTransfer getCircleTransferObject() {
        CircleTransfer circleTransfer = new CircleTransfer();
        circleTransfer.setRadius(radius);
        circleTransfer.setxPos(xPos);
        circleTransfer.setyPos(yPos);
        return circleTransfer;
    }
// other members
}

// CircleDAO.java
interface CircleDAO {
    public void insertCircle(CircleTransfer circle);
    public CircleTransfer findCircle(int id);
    public void deleteCircle(int id);
}

// RDBMSDAO.java
class RDBMSDAO implements CircleDAO {
    @Override
    public void insertCircle(CircleTransfer circle) {
// insertCircle implementation
        System.out.println("insertCircle implementation");
    }
    @Override
    public CircleTransfer findCircle(int id) {
// findCircle implementation
        return null;
    }
    @Override
    public void deleteCircle(int id) {
// deleteCircle implementation
    }
}

// DAOFactory.java
class DAOFactory {
    public static CircleDAO getCircleDAO(String sourceType) {
// This is a simple example, so we have listed only "RDBMS" as the only source type
// In a real-world application, you can provide more source types
        switch(sourceType){
            case "RDBMS":
                return new RDBMSDAO();
        }
        return null;
    }
}

class CircleTransfer implements Serializable {
    private int xPos;
    private int yPos;
    private int radius;
    public int getxPos() {
        return xPos;
    }
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }
    public int getyPos() {
        return yPos;
    }
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}

// Test.java
public class DAOTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 20);
        System.out.println(circle);
        CircleTransfer circleTransfer = circle.getCircleTransferObject();
        CircleDAO circleDAO = DAOFactory.getCircleDAO("RDBMS");
        circleDAO.insertCircle(circleTransfer);
    }
}

