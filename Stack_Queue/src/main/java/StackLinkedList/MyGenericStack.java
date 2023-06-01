package StackLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

import static javafx.beans.binding.Bindings.isEmpty;

public class MyGenericStack <T>{
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element); //
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
    public static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        System.out.print("Kích thước ngăn xếp sau thao tác đẩy: " + stack.size() + " ");
        System.out.println("Các phần tử pop từ ngăn xếp");
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.print(" Kích thước ngăn xếp sau thao tác pop" + stack.size() + " ");

    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.print("Kích thước ngăn xếp sau thao tác đẩy: " + stack.size() + " ");
        System.out.println("Các phần tử pop từ ngăn xếp:");
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.print("Kích thước ngăn xếp sau thao tác pop: "+ stack.size()+ " ");

    }
}
