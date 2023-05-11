package drawMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Tùy chọn 1");
            System.out.println("2. Tùy chọn 2");
            System.out.println("3. Tùy chọn 3");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Bạn đã chọn Tùy chọn 1");

                    System.out.println("╔═══════════════╗");
                    System.out.println("║      Menu     ║");
                    System.out.println("╠═══════════════╣");
                    System.out.println("║ 1. Tùy chọn 1 ║");
                    System.out.println("║ 2. Tùy chọn 2 ║");
                    System.out.println("║ 3. Tùy chọn 3 ║");
                    System.out.println("║ 4. Thoát      ║");
                    System.out.println("╚═══════════════╝");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Tùy chọn 2");
                    System.out.println("╔════════════════════════════╗");
                    System.out.println("║         MENU OPTIONS        ║");
                    System.out.println("║                            ║");
                    System.out.println("║      1. Option 1           ║");
                    System.out.println("║      2. Option 2           ║");
                    System.out.println("║      3. Option 3           ║");
                    System.out.println("║      4. Option 4           ║");
                    System.out.println("║      5. Option 5           ║");
                    System.out.println("║                            ║");
                    System.out.println("╚════════════════════════════╝");

                    break;
                case 3:
                    System.out.println("Bạn đã chọn Tùy chọn 3");
                    System.out.println("     *");
                    System.out.println("    ***");
                    System.out.println("   *****");
                    System.out.println("  *******");
                    System.out.println(" *********");
                    System.out.println("    ***");
                    System.out.println("    ***");
                    System.out.println("    ***");

                    break;
                case 4:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }

            System.out.println(); // Tạo ra một dòng trống giữa các lần lặp
        }

        sc.close();



    }
}
