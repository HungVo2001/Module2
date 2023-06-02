package ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatArray(){
        Random random = new Random(); //Tạo phương thức createRandom Trả về mảng số nguyễn ngẫu nhiên từ 0 đến 100.
        Integer[]arr = new Integer[100];
        for (int i = 0; i < 100; i++){
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
            if(i%20==0 && i!=0){
                System.out.println("");
            }
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayExample arrayExample = new ArrayExample();
        Integer[]arr = arrayExample.creatArray();

        System.out.println("Vui lòng nhập chỉ so bất kì từ bàn phím : ");
        int number = Integer.parseInt(sc.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + number + " là " + arr[number]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
