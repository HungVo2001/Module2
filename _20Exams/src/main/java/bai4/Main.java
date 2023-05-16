package bai4;

import java.util.Arrays;

public class Main {
    //Đảo ngược mảng ban đầu
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        reveserArray(array);
    }

    private static void reveserArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {

                int temp = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
