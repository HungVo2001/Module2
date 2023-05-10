package changeMoney;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double vnd = 23000;
//        double usd;
//        System.out.println("Nhập số tiền USD: ");
//
//        usd = sc.nextDouble();
//        double change = usd * 23.000;
//        System.out.println("Giá tiền VND là ="+ change);

        System.out.println("Nhập số luoượng muốn thêm");
//        double huy = Double.parseDouble(sc.nextLine());
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++){
            System.out.println("Nhập phần tử thứ" + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "    ");
        }
        System.out.println();
        for (int num : array){
            System.out.print(num + ", ");


        }
    }
}
