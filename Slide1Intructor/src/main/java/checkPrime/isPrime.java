package checkPrime;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số, kiểm tra xem có phải là số nguyên tố không");
        int num = Integer.parseInt(sc.nextLine());

//        boolean flag = true;
//        if(num < 2) {
//            System.out.println(num + "Không phải là số nguyên tố");
//        }
//        for (int i = 2; i < num; i++) {
//            if (num %i == 0) {
//                flag = false;
//                break;
//            }
//        }
//        if (flag == true) {
//            System.out.println(num + "là số nguyên tố");
//        }else {
//            System.out.println(num + "Không phải là số nguyên tố");
//        }
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int num) {
        boolean flag = true;
        if (num < 2) {
            flag = false;

        }
        for (int i = 2; i < num; i++) {
            if (num %i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
