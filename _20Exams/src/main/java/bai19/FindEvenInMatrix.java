package bai19;

import java.util.Random;

public class FindEvenInMatrix {
    public int[][] creatArrayMatrix(int row, int column, int MAX, int MIN) {
        Random random = new Random();
        int[][]arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = random.nextInt(MAX - MIN + 1) + MIN;
            }
        }
        return arr;
    }
}
