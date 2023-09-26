package session3.Exercises.Ex3;

public class Triangle implements Shape{
    double radius;

    public Triangle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumfrence() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public int getNumOfEdges() {
        return 0;
    }
}
