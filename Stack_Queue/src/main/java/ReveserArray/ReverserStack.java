package ReveserArray;

import java.util.Arrays;
import java.util.Stack;

public class ReverserStack {
    public static int[] reverseInArray(int []arr){
        Stack<Integer> stack = new Stack<>();
        for (int num : arr){
            stack.push(num);
        }
        int i = 0;
        while (!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }
        return arr;
    }
    public static String reverseString(String string){
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < string.length(); i++){
            myStack.push(string.charAt(i));
        }
        String outPut = "";
        for (int i = 0; i < string.length();i++){
            outPut += myStack.pop();
        }
        return outPut;
    }

}
