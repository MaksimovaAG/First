package ru.academits.j2017.maksimova.shapes;

public class Triangle {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double side) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private double max(double... numbers) {
        double a = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (a < numbers[i]) {
                a = numbers[i];
            }
        }
        return a;
    }

    private double min(double... numbers) {
        double a = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (a > numbers[i]) {
                a = numbers[i];
            }
        }
        return a;
    }

    private double length(double x1, double y1, double x2, double y2) {
        double a = Math.sqrt((x1 - x2) * (x1 - x2)) + Math.sqrt((y1 - y2) * (y1 - y2));
        return a;
    }

    public double getWidth() {
        return (max(x1, x2, x3) - min(x1, x2, x3));
    }

    public double getHeight() {
        return (max(y1, y2, y3) - min(y1, y2, y3));
    }

    public double getArea() {
        double length1 = length(double x1, double y1, double x2, double y2);
        double length2 = length(double x3, double y3, double x2, double y2);
        double length3 = length(double x1, double y1, double x3, double y3);
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - length1) * (p - length2) * (p - length3));
    }

    public double getPerimeter() {
        return 4 * side;
    }
}
