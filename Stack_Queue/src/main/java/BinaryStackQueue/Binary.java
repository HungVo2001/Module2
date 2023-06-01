package BinaryStackQueue;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên: ");
        int decimalNumber = Integer.parseInt(sc.nextLine());
        String binaryNumber = convertToBinary(decimalNumber);
        System.out.println("Biểu diễn nhi phần " + decimalNumber + " la " + binaryNumber);

    }
    public static String convertToBinary(int decimalNumber){
        StringBuilder binary = new StringBuilder(); //tạo một đối tượng StringBuilder
                                                    // để xây dựng chuỗi biểu diễn nhị phân.
        while (decimalNumber > 0) {
            int remainder = decimalNumber %2;    //tính phần dư của decimalNumber khi chia cho 2
                                                // và lưu giá trị vào biến remainder.

            binary.insert(0,remainder);   // Dòng này chèn giá trị phần dư vào đầu của đối tượng
                                                // StringBuilder binary.

            decimalNumber = decimalNumber / 2;  //chia decimalNumber cho 2 để tiếp tục
                                                // quá trình chuyển đổi sang dạng nhị phân.
        }
        return binary.toString();
    }
}
