/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prototype;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rick1
 */


public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);
        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Os corpos são objetos diferentes");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": E eles são idênticos");
                } else {
                    System.out.println(i + ": Mas não são idênticos");
                }
            } else {
                System.out.println(i + ": O corpo dos objetos é o mesmo");
            }
        }
    }
}