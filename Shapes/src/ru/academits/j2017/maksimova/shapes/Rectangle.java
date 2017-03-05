package ru.academits.j2017.maksimova.shapes;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return new String("прямоугольник со сторонами " + a + " и " + b);
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Rectangle q = (Rectangle) o;
        return (a == q.a) && (b == q.b);
    }

    public int hashCode() {
        final int constant = 4; //число фигур
        return constant * (int) (a + b) - 2;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getWidth() {
        return Math.max(a, b);
    }

    public double getHeight() {
        return Math.min(a, b);
    }

    public double getArea() {
        return a * b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }
}

