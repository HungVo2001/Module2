package showType;

import java.util.Scanner;

public class chayhihihi {
    public static void runtime(){
        Scanner sc = new Scanner(System.in);
        int choice = 89;
        while (choice != 4) {
            ShowMenu.showMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    HinhChuNhatt.veHinhChuNhat();
                    break;
                case 2:
                    TamGiac.veTamGiacc();
                    break;
                case 3:
                    TamGiacCan.veTamGiacCan();
                    break;
                default:
                    System.out.println("Chương Trình kết thúc");
                    break;
            }
        }
    }
}
