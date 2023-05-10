package readNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers;
        System.out.println("Nhập số cần đọc");
        numbers = sc.nextInt();

        if(numbers <= 10 && numbers >= 0){

        }else {
            System.out.println("out of ability");
        }
    }
}
