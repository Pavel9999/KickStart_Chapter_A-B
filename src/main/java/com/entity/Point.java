package com.entity;

import java.util.Objects;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void setX(double m) {
        m = x;
    }

    void setY(double n) {
        n = y;
    }

    @Override
    public String toString() {
        return "Point: [" +
                "x=" + x +
                ", y='" + y + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}
