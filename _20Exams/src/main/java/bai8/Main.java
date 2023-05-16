package bai8;

public class Main {
    //Đếm số dương chia hết cho 7 trong mảng
    public static void main(String[] args) {
        int [] arr = {21,10,49,50,5};
        int result = countPositiveMod7(arr);
        System.out.println("kêt quả: " + result);

    }

    private static int countPositiveMod7(int[] arr) {
        int count = 0;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) count++;
        }
        return count;
    }
}
