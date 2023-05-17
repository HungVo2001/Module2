package bai12;

public class IsAscending {
    public static boolean isAscendingArray(int[]arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
