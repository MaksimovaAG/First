package ru.academits.j2017.maksimova.range;

class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public void print() {
        System.out.printf("(%.1f; %.1f)\n", from, to);
    }

    public double getLength() {
        return (to - from);
    }

    public Range getIntersection(Range a, Range b) {
        if ((a.to < b.from) || (b.to < a.from)) {
            return null;
        } else if ((a.to >= b.from) && (a.from <= b.from)) {
            return new Range(b.from, Math.min(a.to, b.to));
        } else if ((b.to >= a.from) && (b.from <= a.from)) {
            return new Range(a.from, Math.min(a.to, b.to));
        }
        return null;
    }

    public Range[] getUnion(Range a, Range b) {
        if ((a.to < b.from) || (b.to < a.from)) {
            Range union[] = {a, b};
            return union;
        }

        Range union[] = {new Range(Math.min(a.from, b.from), Math.max(a.to, b.to))};
        return union;
    }

    public boolean isInside(double number) {
        return ((number >= from) && (number <= to));
    }
}
