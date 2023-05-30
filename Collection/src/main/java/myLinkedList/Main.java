package myLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(5);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(8);

        myLinkedList.add(4,4);
        myLinkedList.add(4,4);


        myLinkedList.printList();

    }
}
