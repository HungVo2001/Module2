package alertIsPrime;

import java.util.Scanner;

public class NhapSNT {
    public static int NhapSLSNT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số n: ");
        int numbers = Integer.parseInt(sc.nextLine());
        System.out.printf("%d số nguyên tố đầu tien là : \n", numbers);
        return numbers;
    }
}
