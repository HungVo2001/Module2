package bai6;

public class ValueMathAbs {

    public static int valueAbsInArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length -1 ; i++) {
            if (arr[i] > Math.abs(arr[i+1])) {
                count += 1;
            }
        }
       return count;
    }
}
