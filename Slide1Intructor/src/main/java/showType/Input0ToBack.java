package showType;

import java.util.Scanner;

public class Input0ToBack {
    public static void input0ToBack() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Nhập 0 để quay lại menu chính");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) System.out.println("Quay lại");
            else System.out.println("Mời nhap lai");
        } while (choice != 0);
    }
}
