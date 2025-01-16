package basics.section8.ex1;

import java.util.Scanner;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(){}

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(double height, double width){
        return this.getHeight() * this.getWidth();
    }

    public double perimeter(double height, double width){
        return (this.getHeight() * 2) + (this.getWidth() * 2);
    }

    public double diagonal(double height, double width){
        return Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2));
    }
}