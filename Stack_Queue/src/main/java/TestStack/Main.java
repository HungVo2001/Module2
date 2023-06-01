package TestStack;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1); //Thêm phần tử 1 vào đỉnh của stack
//        stack.push(2); //Thêm phần tử 1 vào đỉnh của stack
//        stack.push(3); //Thêm phần tử 1 vào đỉnh của stack
//        System.out.println(stack.toString());
//
//        while (!stack.isEmpty()){  // check stack đến khi stack rỗng
//            System.out.println(stack.pop());
//        }

        //dảo ngược mảng bằng stack
        int [] numbers = {1,2,3,4,5};
        reverserArray(numbers);
        System.out.println(Arrays.toString(numbers));


    }
    public static void reverserArray(int[] numbers){

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length;i++) {
            stack.push(numbers[i]);
        }
        int i = 0 ;
//        System.out.println("dueet mảng bằng isEMpty");
        while (!stack.isEmpty()){
//            System.out.println(stack.pop());  // Dòng này xóa đi vì trong while sẽ có 2 pop nên sai
            numbers[i] = stack.pop();
            i++;
        }
//        System.out.println(Arrays.toString(numbers));

    }
}
