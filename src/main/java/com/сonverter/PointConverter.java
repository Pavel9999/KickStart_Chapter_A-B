package com.сonverter;

import com.entity.Point;

public class PointConverter {

    public Point convertToPoint(String x, String y){
        return new Point(Double.parseDouble(x),Double.parseDouble(y));
    }
}
