package RefactoringMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Refactoring refactoring = new Refactoring();
        System.out.println("Kết quả Volum: " + Refactoring.getVolumCaculator(3,3,3));
        System.out.println("Kết quả Area: " + Refactoring.getBaseArea(3));
        System.out.println("Kết quả Perimeter: " + Refactoring.getPerimete(5));
    }
}
