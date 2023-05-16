package bai6;

public class Main {
    //Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện lớn hơn giá trị tuyệt đối của giá trị đứng liền sau nó

    public static void main(String[] args) {
        int [] arr = {100,90,55,40,120,60};
//        ValueMathAbs valueMathAbs = new ValueMathAbs();
//        valueMathAbs.valueAbsInArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        int result = ValueMathAbs.valueAbsInArray(arr);
        System.out.println("Ket qua la: "+ result);

    }
}
