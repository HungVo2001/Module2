package bai7;

import java.util.Random;
import java.util.Scanner;

import static bai7.PerfectSquareNumber.perfectSquareNumber;

public class Main {
    // Hãy liệt kê các vị trí mà giá trị tại đó là số chính phương trong mảng 1 chiều các số nguyên
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int MAX = 100;
        int MIN = 20;

        System.out.println("nhập số lượng phần từ: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        perfectSquareNumber(arr);
    }
}
