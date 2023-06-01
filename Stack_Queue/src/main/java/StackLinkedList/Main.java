package StackLinkedList;

public class Main {
    public static void main(String[] args) {
        MyGenericStack<Integer> myGenericStack = new MyGenericStack();
        System.out.println("Stack of integers");
        myGenericStack.stackOfIntegers();


        MyGenericStack<String> myGenericStack1 = new MyGenericStack();
        System.out.println();
        System.out.println("Stack of Strings");
        myGenericStack1.stackOfIStrings();
    }
}
