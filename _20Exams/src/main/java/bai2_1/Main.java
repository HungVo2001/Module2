package bai2_1;

public class Main {
    //Tính trung bình cộng các số dương trong mảng 1 chiều các số thực
    public static void main(String[] args) {
        float [] arr = {1.3f,2.4f,-3,5f,6};
        float total = avgPositiveNumber(arr);
        System.out.println("Tổng trung bình các số thực lớn hơn 0: "+total);
    }

    private static float avgPositiveNumber(float[] arr) {
        float sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        return sum/count;
    }
}
