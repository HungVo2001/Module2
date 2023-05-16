package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hãy liệt kê các số trong mảng 1 chiều các số thực thuộc đoạn [x, y] cho trước
        Scanner sc = new Scanner(System.in);
        int [] array = {2,4,5,6,30,-2,-4};
        int x, y;
        do {
            System.out.println("x =");
            x = Integer.parseInt(sc.nextLine());
            System.out.println("y =");
            y = Integer.parseInt(sc.nextLine());

        }while (x >= y);
        int [] subArr = getElement(array, x, y);
        if (subArr.length == 0) {
            System.out.printf("Không có phần tử thuôc đoạn [%d;%d]" , x,  y);
        }else {
            System.out.printf("Phần tử thuộc đoạn [%d;%d]: \n", x, y);
            for (int i = 0; i <subArr.length;i++) {
                System.out.println(subArr[i] + "\t");
            }
        }

    }
    public static int[] getElement(int[] array, int x, int y) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= y && array[i] >= x) {
                count++;
            }
        }
        int [] subArr = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= y && array[i] >= x) {
                subArr[j++] = array[i];
            }
        }
        return subArr;
    }
}
