package ru.academits.j2017.maksimova.range;

public class Main {
    public static void main(String[] args) {
        double from = -11.2;
        double to = 4.5;
        Range fromTo = new Range(from, to);
        Range a = new Range(1.2, 7.8);
        Range b = new Range(0.6, 17);

        a.print();
        b.print();

        System.out.println("Длина интервала " + fromTo.getLength());

        if (b.getIntersection(a) == null) {
            System.out.println("Интервалы не пересекаются.");
        } else {
            System.out.print("Пересечение интервала ");
            b.getIntersection(a).print();
        }

        if (b.getUnion(a).length == 1) {
            System.out.print("Объединение интервалов ");
            b.getUnion(a)[0].print();
        } else {
            System.out.print("Объединение интервалов ");
            b.getUnion(a)[0].print();
            b.getUnion(a)[1].print();
        }

        if (b.getDifference(a).length == 1) {
            System.out.print("Разность интервалов ");
            b.getDifference(a)[0].print();
        } else {
            System.out.print("Разность интервалов ");
            b.getDifference(a)[0].print();
            b.getDifference(a)[1].print();
        }

        double number = 2.0;
        if (fromTo.isInside(number)) {
            System.out.print("Число входит в интервал.");
        } else {
            System.out.print("Число не принадлежит интервалу.");
        }
    }
}
