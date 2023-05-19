package bai18;

import java.util.Scanner;

public class Main {

    //Tìm số chẵn đầu tiên trong ma trận
    public static void main(String[] args) {
        FindEvenMatrix findEvenMatrix = new FindEvenMatrix();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hàng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cột");
        int column = Integer.parseInt(sc.nextLine());

        int[][]arr = findEvenMatrix.creatMatrix2ChieuArray(row,column,100,10);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] %2 == 0) {
                    count++;
                }else {
                    System.out.println("Số chẵn trong Matrix nằm tại ví trí:  [" + i + "][" + j + "]");
                    break;
                }
            }
            break;
        }
    }
}
