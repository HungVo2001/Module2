package showType;

import java.util.Scanner;

public class HinhChuNhatt {
    public static void veHinhChuNhat() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        int choice;
        Input0ToBack.input0ToBack();
    }
}
