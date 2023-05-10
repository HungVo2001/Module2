package changeMoney;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23.000;
        double usd;
        System.out.println("Nhập số tiền: ");

        usd = sc.nextDouble();
        double change = usd * 23.000;
        System.out.println("Giá tiền là ="+ change);
    }
}
