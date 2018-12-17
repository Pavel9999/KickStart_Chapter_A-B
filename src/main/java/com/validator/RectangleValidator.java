package com.validator;




import com.entity.Point;
import com.exception.RectangleValidatorException;

import java.util.List;




public class RectangleValidator implements Validator<List<Point>> {


    @Override
    public void fullValidation(List<Point> object) {
        checkCountPoint(object);
        checkRectangle(object.get(0),object.get(1),object.get(2),object.get(3));


    }

    public void checkCountPoint(List<Point> object) {
        if (object.size() <4) {
            throw new RectangleValidatorException("Rectangle points size incorrect "+object.size());
        }
    }

    public void checkLine(Point t, Point m, Point k){
        if ((t.getX()==m.getX()&&t.getX()==k.getX())||(t.getY()==m.getY()&&t.getY()==k.getY())){
            throw new RectangleValidatorException("Figure is not rectangle.");
        }

    }

    public void checkRectangle(Point a, Point b, Point c, Point d){
        checkLine(a,b,c);
        checkLine(b,c,d);
        checkLine(c,d,a);
        checkLine(a,b,d);
    }

    public boolean checkRightAngle(Point a, Point b, Point c){
        boolean isRightAngle=false;
        Point aB=new Point(b.getX()-a.getX(),b.getY()-a.getY());
        Point bC=new Point(c.getX()-b.getX(),c.getY()-b.getY());

        if ((aB.getX()*bC.getX()+aB.getY()*bC.getY())==0){
            isRightAngle=true;
        }
        return isRightAngle;
    }








}
