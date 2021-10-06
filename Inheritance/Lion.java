package Inheritance;

import java.awt.*;

public class Lion extends Animal{
    private Color maneColor;

    public Lion(Color color, int size) {
        super(color, size);
    }

//    public void eat() {
//        super.eat();
//    }

    public void eat() {
        System.out.println("Animal eating");
        super.eat();
        }

    @Override
    public void name() {
        super.name();
    }
}



