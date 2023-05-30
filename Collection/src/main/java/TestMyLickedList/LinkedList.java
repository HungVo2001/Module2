package TestMyLickedList;

import com.sun.xml.internal.ws.api.server.Adapter;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addFirst(E e) {
        Node newNode = new Node<>(e);
        newNode.setNext(head);
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);

        Node<Integer> currentNode = linkedList.head;
        while (currentNode != null) {
            System.out.println(currentNode.getElement());
            currentNode = currentNode.getNext();
        }
    }
}
