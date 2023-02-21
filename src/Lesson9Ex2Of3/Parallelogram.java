package Lesson9Ex2Of3;

public class Parallelogram {

    public int calculatePerimeter(int length, int width) {
        return (2 * length) + (2 * width);
    }
    public int calculatePerimeter(int sideLength) {
        return (4 * sideLength);
    } //assuming all sides have equal lengths

    public double calculateArea(int length, double width) {
        return length * width;
    } //assuming width means height

    public int calculateArea(int sideLength) {
        return (int) ((sideLength * sideLength) * Math.sin(90));
    } //assuming all parallelograms the method will use have 60 degrees angle, and equal length of sides
    //Math class has methods for basic math operations
    //sin() method return cosine value of angle
}
