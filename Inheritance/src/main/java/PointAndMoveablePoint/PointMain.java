package PointAndMoveablePoint;

public class PointMain {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(2.5f,3.5f);
        System.out.println(point);

        System.out.println("------------------");
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(1.5f,2.5f,3.5f,4.5f);
        System.out.println(movablePoint);
        movablePoint = movablePoint.move();
        System.out.println(movablePoint);

    }
}
