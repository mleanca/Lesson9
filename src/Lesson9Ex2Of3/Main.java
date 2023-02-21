package Lesson9Ex2Of3;

public class Main {
    public static void main(String[] args) {
        Parallelogram parallelogram1 = new Parallelogram();
        System.out.println("Calculating the: ");
        System.out.println("  perimeter of parallelogram using length & width: " + parallelogram1.calculatePerimeter(4, 5));
        System.out.println("  perimeter of parallelogram using side length: " + parallelogram1.calculatePerimeter(4));
        System.out.println("  area of parallelogram using length & width: " + parallelogram1.calculateArea(4, 4.0));
        System.out.println("  area of parallelogram using side length: " + parallelogram1.calculateArea(4));

//Calculating the:
//  perimeter of parallelogram using length & width: 18
//  perimeter of parallelogram using side length: 16
//  area of parallelogram using length & width: 16.0
//  area of parallelogram using side length: 14
    }
}
