package test;

import java.awt.Color;
import java.util.ArrayList;

import model.Circle;
import model.Rectangle;
import model.Shape;

public class ShapeTest 
{
    public static void main(String[] args) 
    {
        float f1 = 1 + 0.01f + .01f + .01f + .01f + 0.01f;
        System.out.println("value of f1 = " + f1);
        System.out.printf("%5.10f", f1);
        Circle c1 = new Circle(1 + 0.01f + .01f + .01f +0.01f + 0.01f, 1, Color.white, 2);
        assert isEqual(c1.getX(), 1.05F);
        assert isEqual(c1.getArea(), (float)(2*2*Math.PI));

        Rectangle r1 = new Rectangle(10, 12.5F, Color.red, 5, 7);
        assert isEqual(r1.getArea(), (float)(5*7));
        assert isEqual(12.5F, r1.getY());

        ArrayList<Shape> shapes = new ArrayList<>();    
        shapes.add(new Circle(0, 0, Color.WHITE, 1));
        shapes.add(new Circle(1, 1, Color.WHITE, 2));
        shapes.add(new Rectangle(10, 10, Color.YELLOW, 5, 5));

        for(var s: shapes)
        {
            System.out.println(s);
        }
    }    

    public static boolean isEqual(float x , float y )
    {
        final float SMALL = .000000001f;
        // | x - y|  < SMALL_NUMBER
        if(Math.abs(x - y) < SMALL){
            return true;
        }
        else
        {
            return false;
        }
    }
}
