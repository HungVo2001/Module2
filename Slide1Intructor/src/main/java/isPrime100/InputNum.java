package isPrime100;

import java.util.Scanner;

public class InputNum {
    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên n:");
        int number = Integer.parseInt(sc.nextLine());
        System.out.printf("Tất ca số nguyên tố nhỏ hon %d là: \n",number);
        return number;
    }
}
