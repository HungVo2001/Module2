package TestCollection;

import java.util.ArrayList;
import java.util.List;

public class Test {
    //Test ArrayList:
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();   //Khởi tạo 1 đối tượng ArrayList lưu trữ kiểu chuỗi.
        arrayList.add("Hung");arrayList.add("Vo");
        arrayList.add("Bao");arrayList.add("Nguyễn");
        System.out.println(arrayList);

        System.out.println("---------------------");

        //Khởi tạo đối tượng ArrayList lưu trữ kiểu dữ liệu số nghuyên
        List<Integer> numbers = new ArrayList<>();

        // Thêm các số vào ArrayList:
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        //In ra số lượng phần tử trong ArrayList:
        System.out.println("Số phần tử trong ArrayList:" + numbers.size()); //Số lượng 3 phần tử

        System.out.println("-----------------------");

        // Truy cập vào phần tử ArrayList:
        int firstNumber = numbers.get(0);
        int thirdNumber = numbers.get(2);
        System.out.println("Phần tử đầu tiên " + firstNumber);
        System.out.println("Phân tử thứ 3 " + thirdNumber);

        System.out.println("--------------------------");

        //Xóa phần tử khỏi ArrayList:
        numbers.remove(0);
        System.out.println(numbers);  // Còn lai : [20,30] đã xóa phần tử [10]

        System.out.println("----------------------------");

        //Duyệt qua từng phần tử trong ArrayList và in ra màn hình:
        System.out.println("Cac phần tử trong ArrayList: ");
        for (int i = 0; i<numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println(number);
        }

    }
}
