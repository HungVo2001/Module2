package ArrayList;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity() {
        if (size >= elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void addElement(E object) {
//        if (size == elements.length) {
//            ensureCapacity();
//        }
//        elements[size] = object;
//        size++;
        if (size == elements.length) ensureCapacity();
        elements[size++] = object;
    }

    public void add(int index, E object) {
//        if (size == elements.length) {
//            ensureCapacity();
//        }
//        for (int i = size - 1; i >= index; i--) {
//            elements[i + 1] = elements[i];
//        }
//        elements[size] = object;
//        size++;
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index : " + index + ", Size: " + size);
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[size++] = object;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException();
        }
        E removeElement = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return removeElement;
    }

    public int size() {
        return size;
    }

    public boolean add(E object) {
        ensureCapacity();
        elements[size] = object;
        size++;
        return true;
    }

    public boolean contains(E object) {
        for (int i = 0; i < size; i++)
            if (object.equals(elements[i]))
                return true;
        return false;
    }
    public int indexOf(E object){
        if (object == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        }
        else{
            for (int i = 0; i < size; i++) {
                if (object.equals(elements[i])) return i;
            }
        }
        return -1;
    }
    public E get(int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }
    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public E Clone() {
        MyList<E> cloneList = new MyList<>(size);
        System.arraycopy(elements, 0, cloneList.elements, 0, size);
        cloneList.size = size;
        return (E) cloneList;
    }
    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}

