package operator_expression;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width, height, area;
        System.out.println("Nhập chiều dài width: ");
        width = sc.nextFloat();

        System.out.println("Nhập chiều rộng height: ");
        height = sc.nextFloat();

        area = width * height;
        System.out.println("Kết quả = "+area);

    }
}
