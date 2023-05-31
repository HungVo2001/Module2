package LinkedList;

import java.util.NoSuchElementException;


public class MyLinkedLisT<E> {
    public class Node {
        private Node next;
        private E data;

        public Node(E data){
            this.data = data;
        }

        public E getData(){
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    private Node head;

    private int numNodes = 0;

    public MyLinkedLisT() {
    }

    ;

    public void add(int index, E element) {
        if (index < 0 || index > numNodes)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        Node temp = head;
        Node holder;

        if (index == 0) {
            holder = new Node(element);
            holder.next = temp;
            head = holder;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) temp = temp.next;
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
        }
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        Node holder = new Node(element);

        if (head == null) {
            head = holder;
            numNodes++;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = holder;
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes)
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + numNodes);

        Node temp = head;

        if (index == 0) head = temp.next;
        else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
        }
        return temp.getData();
    }

    public boolean checkRemove(Object element) {
        Node temp = head;

        if (element == null) {
            for (int i = 0; i < numNodes; i++) {
                if (temp.getData() == null) {
                    remove(i);
                    return true;
                }
                temp = temp.next;
            }
        } else {
            for (int i = 0; i < numNodes; i++) {
                if (element.equals(temp.getData())) {
                    remove(i);
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public E clone() {
        MyLinkedLisT<E> clone = new MyLinkedLisT<>();
        Node temp = head;
        while (temp != null) {
            clone.addLast(temp.getData());
            temp = temp.next;
        }
        return (E) clone;
    }

    public boolean contains(E object) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(object)) return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E object) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData().equals(object)) return index;
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E element) {
        addLast(element);
        return true;
    }

    public void ensureCapacity() {

    }

    public E get(int i) {
        if (i < 0 || i > numNodes) throw new IndexOutOfBoundsException("Index: " + i + ", size: " + numNodes);
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        if (numNodes == 0) throw new NoSuchElementException("No ♥♥");
        return (E) head.data;
    }

    public E getLast() {
        if (numNodes == 0) throw new NoSuchElementException("No ♥♥");
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "head=" + head +
                ", numNodes=" + numNodes +
                '}';
    }
}
