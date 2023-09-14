package session2.Exercises.Problem1;

public class Square {

    private double width;

    public Square(double width){
        this.width = width;
    }

    public double getCircumfrence(){
        return this.width * 4;
    }

    public double getArea(){
        return Math.pow(this.width, 2);
    }
}
