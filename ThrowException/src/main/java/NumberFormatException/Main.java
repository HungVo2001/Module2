package NumberFormatException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x : ");

        do {
            try {
                int x = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập y : ");
                int y = Integer.parseInt(sc.nextLine());
                CalculationExample cal = new CalculationExample();
                cal.caculate(x,y);
            } catch(Exception e) {
                System.out.println("Vui lòng đúng định dạng số");
            }
        }while (true);



    }
}
