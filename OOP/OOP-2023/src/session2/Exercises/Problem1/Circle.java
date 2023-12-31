package session2.Exercises.Problem1;

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getCircumfrence(){
        return 2 * Math.PI * this.radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

}
