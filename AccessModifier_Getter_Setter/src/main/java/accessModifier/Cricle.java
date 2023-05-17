package accessModifier;

public class Cricle {
    private double radius = 1.0;
    private String color = "red";

    public Cricle(){

    }
    public Cricle(double r) {
        this.radius = r;
    }
    double getRadius() {
        return this.radius;
    }
    String getColor() {
        return color;
    }
    double getArea() {
        return 2 * Math.PI * Math.pow(radius,2);
    }
}
