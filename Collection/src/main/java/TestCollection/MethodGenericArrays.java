package TestCollection;

public class MethodGenericArrays {
    public static void main(String[] args) {
        Integer[]integers = {1, 2, 3, 4, 5};
        String[] strings = {"Hung","Dat","Bao"};
        MethodGenericArrays.<Integer>print(integers);
        MethodGenericArrays.<String>print(strings);
        //Có thể rút gọn, không cần chỉ rõ kieu dữ liệu: bỏ cần <Integer> và <String>
        //MethodGenericArrays.print(integers);
        //MethodGenericArrays.print(strings);
    }

//    Định nghĩa phương thức "print" có kiểu trả về là void và
//    nhận một đối số kiểu generic là "E" và một mảng "list" kiểu "E[]".
    public static<E> void print(E[] list) {
        for (int i = 0; i < list.length;i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}
