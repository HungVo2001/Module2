package BaiTapRefactoring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TennisGame tennisGame = new TennisGame();
//        String result = TennisGame.getScore("Ha","Hung",400,301); // biến cố định nên không thể khai nhiều(Toàn cục)
//        System.out.println("Kết qua là: " + result);
        System.out.println("Muốn nhập bao nhiêu dữ liệu");
        int size = Integer.parseInt(sc.nextLine());
        int i = 0;
        while (i < size){
            System.out.println("Nhập tên người choi 1");
            String playerName1 = sc.nextLine();
            System.out.println("Nhập tên người choi 2");
            String playerName2 = sc.nextLine();
            System.out.println("Nhập điểm người choi 1");
            int playerScore1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập điểm người choi 2");
            int playerScore2 = Integer.parseInt(sc.nextLine());
            String result = tennisGame.getScore(playerName1, playerName2, playerScore1, playerScore2);// biến tennisgame cục bộ nên khai bao nhiêu cũng k bị trùng
            System.out.println(result);
            i++;
        }
    }
}
