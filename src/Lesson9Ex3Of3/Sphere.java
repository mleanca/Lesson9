package Lesson9Ex3Of3;
public class Sphere extends ThreeDimensional {
    final double pi = Math.PI;
    private double radiusSphere;
    public void setRadiusSphere(double radiusSphere) {
        this.radiusSphere = radiusSphere;
    }
    public double getRadiusSphere() {
        return radiusSphere;
    }

    public double calculateArea(double radiusSphere) {
        return 4 * pi * radiusSphere * radiusSphere;
    }

    public double calculateVolume(double radiusSphere) {
        return (4/3) * pi * radiusSphere * radiusSphere * radiusSphere;
    }

}
