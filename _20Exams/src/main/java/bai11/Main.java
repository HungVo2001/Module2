package bai11;

import static bai11.IsSymmetric.isSymmetricArray;

public class Main {
    // Kiểm tra mảng có đối xứng không? Có trả về 1, không có trả về 0
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,6,7};

        System.out.println("arr1 có đối xứng không? " + isSymmetricArray(arr1));
        System.out.println("arr2 có đối xứng không? " + isSymmetricArray(arr2));

    }
}
