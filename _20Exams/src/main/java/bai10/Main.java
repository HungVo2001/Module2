package bai10;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //Hãy xác định số lượng phần tử kề nhau mà cả 2 đều chẵn
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int MAX = 100;
        int MIN = 20;
        System.out.println("Nhập số lượng phần tử: ");
        int size = sc.nextInt();
        int[]arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int result = IdentifyEvenNumber.identifyEvenNumber(arr);
        System.out.println("Kết quả : " + result);
    }
}
