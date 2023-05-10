package greate_common_factor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a: ");
        a = Integer.parseInt(sc.nextLine());

        System.out.println("Enter b: ");
        b = Integer.parseInt(sc.nextLine());

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: "+ a);
    }

}
