package interfaceResizeable;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println("Circle radius: " +circle.getRadius());
        circle.resize(50);
        System.out.println("Circle radius after resize: " +circle.getRadius());
        System.out.println("Area Circle: " + circle.getArea());

        System.out.println("-----------------");
        Rectangle rectangle = new Rectangle(2.5,3.5);
        System.out.println("\nRectangle width: " + rectangle.getWidth() + "\nRectangle heigth: " + rectangle.getHeigth());
        rectangle.resize(50);
        System.out.printf("Rectangle width after resize: %.2f " + "\nRectangle heigth after resize: %.2f\n", rectangle.getWidth(), rectangle.getHeigth());
        System.out.println("Area Rectangle: " +rectangle.getArea());
        System.out.println("Perimeter Rectangle: " + rectangle.getPerimeter());

        System.out.println("------------------");
        Square square = new Square(4.5);
        System.out.println("\nSquare side: " + square.getSide());
        square.resize(50);
        System.out.printf("Square side after resize: %.3f\n", square.getSide());
        System.out.println("Area Square: " + square.getArea());
        System.out.println("Perimeter Square: " + square.getPerimeter());
        square.howToColor();


    }
}
