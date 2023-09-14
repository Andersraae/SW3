package session2.Exercises.Problem1;

public class Rectangle {
    private double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getCircumfrence(){
        return this.height * 2 + this.width * 2;
    }

    public double getArea(){
        return this.height * this.width;
    }
}
