package ru.academits.j2017.maksimova.shapes;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public String toString() {
        return new String("окружность со стороной " + r);
    }

    public boolean equals(Object a) {
        if (a == this) {
            return true;
        }
        if (a == null || a.getClass() != this.getClass()) {
            return false;
        }

        Circle b = (Circle) a;
        return r == b.r;
    }

    public int hashCode() {
        final int constant = 4; //число фигур
        return constant * (int) r - 3;
    }

    public double getR() {
        return r;
    }

    public double getWidth() {
        return 2 * r;
    }

    public double getHeight() {
        return 2 * r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
