package showType;

import java.util.Scanner;

public class TamGiacCan {
    public static void veTamGiacCan() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int choice;
        Input0ToBack.input0ToBack();
    }
}
