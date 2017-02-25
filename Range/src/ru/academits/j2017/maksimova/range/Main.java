package ru.academits.j2017.maksimova.range;

public class Main {
    public static void main(String[] args) {
        double from = -11.2;
        double to = 4.5;
        Range fromTo = new Range(from, to);
        Range a = new Range(1.2, 3.0);
        Range b = new Range(7.6, 17);

        a.print();
        b.print();

        System.out.println("Длина интервала " + fromTo.getLength());

        if (fromTo.getIntersection(a, b) == null) {
            System.out.println("Интервалы не пересекаются.");
        } else {
            System.out.print("Пересечение интервала ");
            fromTo.getIntersection(a, b).print();
        }

        if (fromTo.getUnion(a, b).length == 1) {
            System.out.print("Объединение интервалов ");
            fromTo.getUnion(a, b)[0].print();
        } else {
            System.out.print("Объединение интервалов ");
            fromTo.getUnion(a, b)[0].print();
            fromTo.getUnion(a, b)[1].print();
        }

        double number = 2.0;
        if (fromTo.isInside(number)) {
            System.out.print("Число входит в интервал.");
        } else {
            System.out.print("Число не принадлежит интервалу.");
        }
    }
}
