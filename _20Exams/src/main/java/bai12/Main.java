package bai12;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kiểm tra mảng có tăng dần hay không
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int MAX = 100;
        int MIN = 20;
        System.out.println("Nhập số lươg phần tử: ");
        int size = sc.nextInt();
        int[]arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        boolean result = IsAscending.isAscendingArray(arr);
        System.out.println("Kết quả là : " + result);
    }
}
