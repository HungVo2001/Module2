package accessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        System.out.println(cricle.getRadius());
        System.out.println();
        Cricle cricle1 = new Cricle();
        double result =cricle1.getArea();
        System.out.println("Diện tích hình tròn: "+result);
    }
}
