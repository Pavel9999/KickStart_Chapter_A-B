package com.entity;

import java.util.Objects;


public class Rectangle {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle() {
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }







    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(a, rectangle.a) &&
                Objects.equals(b, rectangle.b) &&
                Objects.equals(c, rectangle.c) &&
                Objects.equals(d, rectangle.d);
    }


    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }



    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }



}
