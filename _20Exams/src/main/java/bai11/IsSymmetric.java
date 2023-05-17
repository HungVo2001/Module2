package bai11;

public class IsSymmetric {
    public static int isSymmetricArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return 0;
            }
        }
        return 1;
    }
}
