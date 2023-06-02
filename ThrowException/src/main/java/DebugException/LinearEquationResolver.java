package DebugException;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Trình giải phương trình: ");
        System.out.println("Cho 1 PT a * x + b = 0, vui lòng nhập các hằng số");

        System.out.println("Nhập a : ");
        double a = sc.nextDouble();

        System.out.println("Nhập b: ");
        double b = sc.nextDouble();

        if (a != 0) {
            double solution = -b/a;
            System.out.printf("PT có nghiệm : %f!", solution);
        }else {
            if (b ==0){
                System.out.println("PT có nghiệm là all x");
            }else {
                System.out.println("PT vô nghiệm");
            }
        }
    }
}
