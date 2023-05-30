package TestArrayList;

 import java.util.ArrayList;
 import java.util.Iterator;


public class MyArrayList1<E> extends MyAbstractList<E>{
    public static final int INITIAL_CAPACITY = 16;
    public int size = 0;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];


    /**s
     * Create a default list
     */
    public MyArrayList1() {
    }

    /**
     * Create a list from an array of objects
     */
    public MyArrayList1(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(i, objects[i]); // Warning: don't use super(objects)!
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }

    /**
     * Tạo một mảng mới lớn hơn, gấp đôi kích thước hiện tại + 1
     */
    public void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }


    @Override
    //Thêm một phần tử mới tại chỉ mục đã chỉ định
    void add(int index, E e) {
        ensureCapacity();
// Di chuyển các phần tử sang bên phải sau chỉ mục đã chỉ định
        for (int i = size - 1; i >= index; i--) data[i + 1] = data[i];
// Chèn phần tử mới vào dữ liệu[index]
        data[index] = e;
// Tăng kích thước lên 1
        size++;
    }

    @Override
    //Clear: Xoa danh sách trong mảng (Xóa hết)
    void clear() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
// Trả về true nếu danh sách này chứa phần tử */
    boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;
        return false;
    }

    @Override
/** Trả về phần tử tại chỉ số đã chỉ định */
     E get(int index) {
        checkIndex(index);
        return data[index];
    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }
    @Override
    int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return i;
            return -1;

    }

    @Override
    //Loại bỏ phần tử tại vị trí xác định 84* trong danh sách này.
        // Dịch chuyển mọi phần tử tiếp theo sang bên trái. 85 * Trả lại phần tử đã bị xóa khỏi danh sách.
    E remove(int index) {
        checkIndex(index);

        E e = data[index];

        //Dịch chuyển dữ liệu sang trái
        for (int j = index; j < size-1; j++) {
            data[j] = data[j+1];
        }
        data[size-1] = null;  //Phần tử này hiện là null

        //giảm kích thước
        size--;
       return  e;
    }

    @Override
    //Thay thế phần tử tại vị trí đã chỉ định
        // trong danh sách này với phần tử được chỉ định (Swap)
    E set(int index, E e) {
        checkIndex(index);
        E old = data[index];   // thay thế E cũ bằng 1 data[index]
        data[index] = e;
        return old;
    }


    //Cắt công suất theo kích thước hiện tại
    public void trimToSize() {
         if (size != data.length) {
             E[] newData = (E[]) (new Object[size]);
             System.arraycopy(data,0,newData,0,size);
             data = newData;
         }//Nếu size == dung lượng thì không cần trim
    }

    @Override
    Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {
        private int current = 0; // Current index

        @Override
        public boolean hasNext() {
            return (current < size);
        }

        @Override
        public E next() {
            return data[current++];
        }

        @Override
        public void remove() {
            MyArrayList1.this.remove(current);
        }
    }
}
