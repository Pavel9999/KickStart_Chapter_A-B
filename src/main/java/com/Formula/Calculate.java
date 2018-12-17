package com.Formula;

import com.entity.Point;
import com.entity.Rectangle;

public class Calculate {

    public double lengthSide(Point a, Point b){
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2)
                + Math.pow((a.getY() - b.getY()), 2));
    }
    public double perimeter(Rectangle rec){
        Point a = rec.getA();
        Point b = rec.getB();
        Point c = rec.getC();
        Point d = rec.getD();
        return lengthSide(a,b)+lengthSide(b,c)+lengthSide(c,d)+lengthSide(d,a);
    }

    public double area(Point a, Point b, Point c, Point d){
        double p=Math.abs((a.getX()*b. getY()-a.getY()*b.getX())+(b.getX()*c.getY()-b.getY()*c.getX())+
                (c.getX()*d.getY()-c.getY()*d.getX())+(d.getX()*a.getY()-d.getY()*a.getX()));
        return p/2;
    }





}
