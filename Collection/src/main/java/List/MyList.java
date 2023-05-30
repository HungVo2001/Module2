package List;

import TestMyLickedList.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import static com.sun.glass.ui.Window.addFirst;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY]; // hẵn sẽ neew 1 cái list có sức chuaws = 5 phần tử
    }
    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize); // copy 1 mảng củ vs 1 độ dài mới
    }
    public void add(E e){
        if(size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }

    public void add (MyList list,int index, int value){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < index; i++){
            arrayList.add((Integer) list.get(i));
        }
        arrayList.add(value);
        for (int i = index; i < list.getSize(); i++){
            arrayList.add((Integer) list.get(i));
        }
        for (Integer num : arrayList){
            System.out.print(num + " " );
        }
        for (int i = 0; i < arrayList.size(); i++) {
//            list.set(i) = arrayList.get(i);
        }


    }
    public void remove(int index) {
        if(index < 0 || index > size) {
            throw new  RuntimeException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public int get(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index" + i + ",Size" + i);
        }
        return (int) elements[i];
    }
    public void set(int i) {

    }

    public int getSize() {
        return size;
    }

}
