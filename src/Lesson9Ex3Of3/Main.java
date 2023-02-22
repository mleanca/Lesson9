package Lesson9Ex3Of3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area of circle is: " + circle.calculateArea(4.5));

        Square square = new Square();
        System.out.println("Area of square is: " + square.calculateArea(7.0));

        Sphere sphere = new Sphere();
        System.out.println("Area of sphere is: " + sphere.calculateArea(4.9));
        System.out.println("Volume of sphere is: " + sphere.calculateVolume(4.9));

        Cube cube = new Cube();
        System.out.println("Area of cube is: " + cube.calculateArea(9.0));
        System.out.println("Volume of cube is: " + cube.calculateVolume(9.0));

    }
}

//Area of circle is: 63.61725123519331
// Area of square is: 49.0
// Area of sphere is: 301.7185584507638
// Volume of sphere is: 369.60523410218565
// Area of cube is: 486.0
// Volume of cube is: 729.0
