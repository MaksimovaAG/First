package ru.academits.j2017.maksimova.shapes;

import java.util.Objects;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public String toString() {
        return new String("квадрат со стороной " + side);
    }

    public boolean equals(Object a) {
        if (a == this) {
            return true;
        }
        if (a == null || a.getClass() != this.getClass()) {
            return false;
        }

        Square b = (Square) a;
        return side == b.side;
    }

    public int hashCode() {
        final int constant = 4; //число фигур
        return constant * (int) side - 4;
    }

    public double getSide() {
        return side;
    }

    public double getWidth() {
        return side;
    }

    public double getHeight() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}
