package bai15;

import java.util.Random;

public class CheckMatrixDecrease {
    public int[][] creatMang2Chieu(int row, int column, int MAX, int MIN){
        Random random = new Random();
        int[][]arr = new int[row][column];

        for (int i = 0; i < row;i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = random.nextInt(MAX - MIN +1)+MIN;
            }
        }

//        for (int i = 0; i < row;i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        return arr;
    }
}
