package ru.academits.j2017.maksimova.shapes;

public class Main {
    public static void firstArea(Shape... shapes) {
        int k = 0;
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[k].getArea() < shapes[i].getArea()) {
                k = i;
            }
        }
        System.out.printf("Наибольшая площадь: %s.%n", shapes[k]);
    }

    public static void secondPerimeter(Shape... shapes) {
        if (shapes.length == 1) {
            System.out.printf("Недостаточно данных.%n");
            return;
        }

        int first = 1;
        int second = 0;
        if (shapes[0].getPerimeter() >= shapes[1].getPerimeter()) {
            first = 0;
            second = 1;
        }

        for (int i = 2; i < shapes.length; i++) {
            if (shapes[first].getPerimeter() <= shapes[i].getPerimeter()) {
                second = first;
                first = i;
            } else if (shapes[second].getPerimeter() < shapes[i].getPerimeter()) {
                second = i;
            }
        }
        System.out.printf("Второй периметр: %s.%n", shapes[second]);
    }

    public static void main(String[] args) {
        Shape s1 = new Square(3);
        Shape s2 = new Square(4.7);
        Shape s3 = new Triangle(1.1, 2, 7, 7, 4, 4);
        Shape s4 = new Triangle(71, 0, 73, 10, 74, 4);
        Shape s5 = new Rectangle(2, 4.4);
        Shape s6 = new Rectangle(4, 1.4);
        Shape s7 = new Circle(0.7);
        Shape s8 = new Circle(2.14);

        firstArea(s1, s2, s3, s4, s5, s6, s7, s8);
        secondPerimeter(s1, s2, s3, s4, s5, s6, s7, s8);
    }
}
