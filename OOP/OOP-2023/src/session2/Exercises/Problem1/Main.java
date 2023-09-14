package session2.Exercises.Problem1;

import session2.Exercises.Problem1.Circle;
import session2.Exercises.Problem1.Rectangle;
import session2.Exercises.Problem1.Square;

public class Main {

    public static void main(String[] args) {
        Circle circ = new Circle(4);
        System.out.println("Circle c: " + circ.getCircumfrence());
        System.out.println("Circle a: " + circ.getArea());
        Rectangle rec = new Rectangle(4, 2);
        System.out.println("Rectangle c: " + rec.getCircumfrence());
        System.out.println("Rectangle a: " + rec.getArea());
        Square sq = new Square(4);
        System.out.println("Square c: " + sq.getCircumfrence());
        System.out.println("Square a: " + sq.getArea());
    }
}
