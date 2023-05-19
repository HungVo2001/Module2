package bai16;

import java.util.Scanner;

public class Main {
    //Kiểm tra ma trận có tồn tại số lẻ hay không
    public static void main(String[] args) {
        CheckMatrixDecreaseB checkMatrixDecreaseB = new CheckMatrixDecreaseB();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hàng ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhâp cột ");
        int column = Integer.parseInt(sc.nextLine());
        int[][]arr = checkMatrixDecreaseB.creatArrayMatrix(row,column,100,10);

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        boolean flag = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] %2 != 0) {
                    flag = true;
                }
            }
        }
        if (flag == true) {
            System.out.println("Mảng tồn tại sô lẻ");
        }else {
            System.out.println("Mảng không tồn tại sổ lẻ");
        }
    }

}
