package findMaxValueArray;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.println("Enter the size: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);
        int i = 0;
        array = new int[size];
        while (i < array.length) {
            System.out.println("Enter element " + i + " : ");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " is position " + index);
    }
}
