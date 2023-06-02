package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa trong mảng: ");
        int V = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++){ // dùng for duyệt mảng
            if (arr[i] == V){   // ta gán V nhập vào = vị trí i trong mảng
                for (int j = i; j < arr.length-1;j++){ //
//
                    arr[j] = arr[j + 1];
                }
                arr [arr.length-1] = 0;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
