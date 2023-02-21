package Lesson9Ex3Of3;

public class Cube extends ThreeDimensional {
    private double sideOfCube;

    public void setSideOfCube(double sideOfCube) {
        this.sideOfCube = sideOfCube;
    }

    public double getSideOfCube() {
        return sideOfCube;
    }

    @Override
    public double calculateArea(double sideOfCube) {
        return 6 * sideOfCube * sideOfCube;
    }

    public double calculateVolume(double sideOfCube) {
        return sideOfCube * sideOfCube * sideOfCube;
    }
}
