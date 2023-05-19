package bai15;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kiểm tra một cột ma trận có giảm dần hay không
        CheckMatrixDecrease checkMatrixDecrease = new CheckMatrixDecrease();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hàng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cột");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] array = checkMatrixDecrease.creatMang2Chieu(row,column,100,10);
        for (int i = 0; i < row;i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int count = 0;
        int columnDown = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
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
