package bai19;

import java.util.Scanner;

public class Main {

    //Tìm số chẵn lớn nhất trong ma trận

    public static void main(String[] args) {
        FindEvenInMatrix findEvenInMatrix = new FindEvenInMatrix();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hàng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhâp cột: ");
        int column = Integer.parseInt(sc.nextLine());

        int[][]arr = findEvenInMatrix.creatArrayMatrix(row,column,100,10);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] %2 == 0) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }
        }
        System.out.println("Số chẵn lớn nhất trong Matrix là: " + max);

    }
}
