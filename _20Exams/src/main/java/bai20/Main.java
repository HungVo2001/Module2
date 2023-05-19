package bai20;

import java.util.Scanner;

public class Main {
    //Liệt kê các dòng có tổng lớn nhất
    public static void main(String[] args) {
        ListedRowSumMax listedRowSumMax = new ListedRowSumMax();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hàng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cột: ");
        int column = Integer.parseInt(sc.nextLine());

        int[][]arr = listedRowSumMax.creatMatrix2Chieu(row,column,100,10);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int total = 0;
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                total += arr[i][j];
            }
            for (int k = 0; k < row; k++) {
                if (total > max) {
                    max = total;
                    total = 0;
                }else {
                    total = 0;
                }
            }
        }
        System.out.println("Dòng có tổng lớn nhất là: "+ max);
    }
}
