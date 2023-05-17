package bai13;

public class ArrInside {
    public static boolean isInSideArray(int[]arrA, int[]arrB) {
        int count = 0;
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count == arrA.length) {
            return true;
        }else {
            return false;
        }

    }
}
