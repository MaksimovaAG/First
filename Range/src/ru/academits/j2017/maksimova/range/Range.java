package ru.academits.j2017.maksimova.range;

class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from >= to) {
            throw new IllegalArgumentException("Начало больше конца.");
        }
        this.from = from;
        this.to = to;
    }

    public boolean equals(Object a) {
        if (a == this) {
            return true;
        }
        if (a == null || a.getClass() != this.getClass()) {
            return false;
        }

        Range b = (Range) a;
        return (from == b.from) && (to == b.to);
    }

    public void print() {
        System.out.printf("(%.1f; %.1f)%n", from, to);
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double getLength() {
        return (to - from);
    }

    public Range getIntersection(Range a) {
        if (isInside(a) || a.isInside(this) || equals(a)) {
            return new Range(Math.max(a.from, from), Math.min(a.to, to));
        } else {
            return null;
        }
    }

    public Range[] getUnion(Range a) {
        if (isInside(a) || a.isInside(this) || equals(a)) {
            return new Range[]{new Range(Math.min(a.from, from), Math.max(a.to, to))};
        }

        return new Range[]{new Range(a.from, a.to), new Range(from, to)};
    }

    public Range[] getDifference(Range a) {
        if (equals(a) || ((a.isInside(from) || (a.from == from)) && (a.isInside(to)) || (a.to == to))) {
            return null;
        } else if (!isInside(a)) {
            return new Range[]{new Range(from, to)};
        } else if (isInside(a.to) && isInside(a.from)) {
            return new Range[]{new Range(from, a.from), new Range(a.to, to)};
        } else if (isInside(a.from)) {
            return new Range[]{new Range(from, a.from)};
        } else {
            return new Range[]{new Range(a.to, to)};
        }
    }

    public boolean isInside(double number) {
        return ((number > from) && (number < to));
    }

    public boolean isOnBorder(double number) {
        return ((number == from) || (number == to));
    }

    public boolean isInside(Range a) {
        return (isInside(a.to) || isInside(a.from));
    }

    public boolean isOnBorder(Range a) {
        return (isOnBorder(a.to) || isOnBorder(a.from));
    }
}
