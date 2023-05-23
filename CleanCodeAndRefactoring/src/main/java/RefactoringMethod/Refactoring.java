package RefactoringMethod;

public class Refactoring {
    public static double getVolum(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimete(radius);
        double volum = getVolumCaculator(height, baseArea, perimeter);
        return volum;
    }

    public static double getVolumCaculator(int height, double baseArea, double perimeter) {
        return perimeter * height + 2 * baseArea;
    }

    public static double getPerimete(int radius) {
        return 2 * Math.PI * radius;
    }

    public static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
