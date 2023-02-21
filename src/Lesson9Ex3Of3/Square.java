package Lesson9Ex3Of3;

public class Square extends TwoDimensional {

    private double sideOfSquare;

    public void setSideOfSquare(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    public double getSideOfSquare() {
        return sideOfSquare;
    }

    @Override
    public double calculateArea(double sideOfSquare) {
        return (sideOfSquare * sideOfSquare);
    }
}
