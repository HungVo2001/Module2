package bai1;
//Bài 1: Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 1000) + Math.random() * (-1000));
        }
        System.out.println(Arrays.toString(numbers));
        for (int value : numbers) {
            String num = Integer.toString(value);
            boolean flag = true;
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) % 2 == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.printf("%4d", value);
            }
        }
    }
}
