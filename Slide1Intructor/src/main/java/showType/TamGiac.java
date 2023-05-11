package showType;

import java.util.Scanner;

public class TamGiac {

    public static void veTamGiacc() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
        int choice;
        Input0ToBack.input0ToBack();
    }


}
