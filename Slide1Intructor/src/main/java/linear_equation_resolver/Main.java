package linear_equation_resolver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("linear equation solver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        double a,b,c,answer;

        System.out.println("a:");
        a = sc.nextDouble();

        System.out.println("b:");
        b = sc.nextDouble();

        System.out.println("c:");
        c = sc.nextDouble();

        if(a != 0) {
            answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else {
            if (b == c) {
                System.out.print("The solution is all x!");
            }else {
                System.out.print("Not solution");
            }
        }


    }
}
