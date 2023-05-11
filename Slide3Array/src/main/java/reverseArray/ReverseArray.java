package reverseArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.println("Enter the size");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + i + ": ");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        reveserArray(size, array);
    }

    public static void reveserArray(int size, int[] array) {
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size -1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reveser array: ","");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
