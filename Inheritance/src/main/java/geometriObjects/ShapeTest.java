package geometriObjects;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("blue",false);
        System.out.println(shape);
    }
}
