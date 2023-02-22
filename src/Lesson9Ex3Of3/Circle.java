package Lesson9Ex3Of3;

public class Circle extends TwoDimensional { // ?abstract class?
    private final double pi = Math.PI; //from MATH class
    private double radiusOfCircle;
    public void setRadiusCircle(double radiusCircle) {
        this.radiusOfCircle = radiusCircle;
    }
    public double getRadiusCircle() {
        return radiusOfCircle;
    }

    public double calculateArea(double radiusOfCircle) {
        return pi * radiusOfCircle * radiusOfCircle;
    }
}
