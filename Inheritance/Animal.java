package Inheritance;

import java.awt.*;

public class Animal {
    private Color color;
    private int size;

    public Animal(Color color, int size) {
        this.color = color;
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void eat() {
        System.out.println("yum yum");
    }

    public void name() {
        System.out.println("Animal Name");
    }
}
