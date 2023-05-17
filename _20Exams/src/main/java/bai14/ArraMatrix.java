package bai14;

public class ArraMatrix {
    public static boolean arraMaTrix(int[][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if (arr[i][j] <= 0 ) {
                    return false;
                }
            }
        }
        return true;
    }
}
