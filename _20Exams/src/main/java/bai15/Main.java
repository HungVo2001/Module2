package bai15;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckMatrixDecrease checkMatrixDecrease = new CheckMatrixDecrease();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hàng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cột");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] array = checkMatrixDecrease.creatMang2Chieu(row,column,100,10);
        for (int i = 0; i < 5;i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int count = 0;
        int columnDown = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (array[i][j] > array[i][j + 1]) {
                    count++;
                }else {
                    count = 0;
                    break;
                }
            }
        }
        if (count == 6) {
            columnDown++;
        }
        System.out.println("Matrix có " + columnDown + " cột giảm dần");
    }
}
