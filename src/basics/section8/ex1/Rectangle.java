package basics.section8.ex1;

import java.util.Scanner;

public class Rectangle {
    float height;
    float width;

    public Rectangle(){}

    public Rectangle(float height, float width){
        this.height = height;
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float area(float height, float width){
        return this.getHeight()*this.getWidth();
    }

    public float perimeter(float height, float width){
        return (this.getHeight()*2)+(this.getWidth()*2);
    }

    public double diagonal(float height, float width){
        return Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2));
    }

}