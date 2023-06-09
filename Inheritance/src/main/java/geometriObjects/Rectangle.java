package geometriObjects;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {

    }

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }
    public Rectangle(double w, double h, String color, boolean filled) {
        super(color, filled);
        this.width = w;
        this.height = h;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return 2 * (width + this.height);
    }
    @Override

    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + " and length = "
                + getHeight()
                + ", which is a subclass of "
                +super.toString();
    }
}
