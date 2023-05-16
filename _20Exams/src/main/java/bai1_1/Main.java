package bai1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Bài 1: Tính tổng các giá trị lớn hơn giá trị đứng liền trước nó trong mảng 1 chiều các số thực
        int [] arr1 = {4,5,2,7,1,9};
        int total = caculatorSum(arr1);
        System.out.println("Tổng giá trị trong mảng là: "+ total);

    }

    private static int caculatorSum(int[] arr) {
        int sum = 0;
        if (arr.length > 0) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i-1]) {
                    sum += arr[i];
                }
            }
        } else if (arr.length == 1) {
            return arr[0];
        }
        return sum;
    }
}
