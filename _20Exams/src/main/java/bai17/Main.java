package bai17;

import java.util.Scanner;

public class Main {
    //Liệt kê các dòng giảm dần trong ma trận
    public static void main(String[] args) {
        MatrixArray matrixArray = new MatrixArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hàng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cột");
        int column = Integer.parseInt(sc.nextLine());

        int[][]arr = matrixArray.Matrix2Chieu(row,column, 100,10);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int countNotDown = 0;
        int countDown = 0;

        for (int i = 0; i < row; i++) {
            boolean check = true;
            for (int j = 0; j <column-1; j++) {
                if (arr[i][j] < arr[i][j +1]){
                    check = false;
                    countNotDown++;
                    break;
                }
            }
            if (check) countDown++;
        }
            System.out.println("Matrix có " + countNotDown + " hàng không giảm dần");
            System.out.println("Matrix có " + countDown + " hàng giảm dần");
//        System.out.println("Matrix có " + (row - countNotDown) + " hàng giảm dần");  thu cong

    }
}
