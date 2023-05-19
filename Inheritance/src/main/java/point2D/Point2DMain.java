package point2D;

public class Point2DMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2.2f,3.2f);
        System.out.println(point2D);

        System.out.println("-----------------");
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(3.3f,4.3f,5.3f);
        System.out.println(point3D);
    }
}
