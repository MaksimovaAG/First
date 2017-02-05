package ru.academits.j2017.maksimova.range;

public class Main {
    public static void main(String[] args) {
        double from = -11.2;
        double to = 4.5;
        Range fromTo = new Range(from, to);

        System.out.println("Длина интервала " + fromTo.getLength());

        double number = 2.0;
        if (fromTo.isInside(number)) {
            System.out.print("Число входит в интервал.");
        } else {
            System.out.print("Число не принадлежит интервалу.");
        }
    }
}
