package ru.academits.j2017.maksimova.shapes;

public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public String toString() {
        return new String("треугольник с координатами вершин (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + ")");
    }

    public boolean equals(Object a) {
        if (a == this) {
            return true;
        }
        if (a == null || a.getClass() != this.getClass()) {
            return false;
        }

        Triangle b = (Triangle) a;
        return (x1 == b.x1) && (y1 == b.y1) && (x2 == b.x2) && (y2 == b.y2) && (x3 == b.x3) && (y3 == b.y3);
    }

    public int hashCode() {
        final int constant = 4; //число фигур
        return constant * (int) this.getPerimeter() - 1;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    private double getMax(double... numbers) {
        double a = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (a < numbers[i]) {
                a = numbers[i];
            }
        }
        return a;
    }

    private double getMin(double... numbers) {
        double a = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (a > numbers[i]) {
                a = numbers[i];
            }
        }
        return a;
    }

    private double getLength(double x1, double y1, double x2, double y2) {
        double a = Math.sqrt((x1 - x2) * (x1 - x2)) + Math.sqrt((y1 - y2) * (y1 - y2));
        return a;
    }

    public double getWidth() {
        return (getMax(x1, x2, x3) - getMin(x1, x2, x3));
    }

    public double getHeight() {
        return (getMax(y1, y2, y3) - getMin(y1, y2, y3));
    }

    public double getArea() {
        double length1 = getLength(x1, y1, x2, y2);
        double length2 = getLength(x3, y3, x2, y2);
        double length3 = getLength(x1, y1, x3, y3);
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - length1) * (p - length2) * (p - length3));
    }

    public double getPerimeter() {
        return (getLength(x1, y1, x2, y2) + getLength(x3, y3, x2, y2) + getLength(x1, y1, x3, y3));
    }
}
