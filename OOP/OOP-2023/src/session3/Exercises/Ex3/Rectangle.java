package session3.Exercises.Ex3;

public class Rectangle implements Shape {

    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getCircumfrence() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public int getNumOfEdges() {
        return 4;
    }
}
