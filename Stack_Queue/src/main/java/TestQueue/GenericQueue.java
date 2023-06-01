package TestQueue;

import java.util.LinkedList;

public class GenericQueue <E>{
    private LinkedList<E> elements;  //Ds các phần tử đc lưu trữ trong queue
    public GenericQueue(){
        elements = new LinkedList<>();  // tạo mới Ds liên kết để sử dụng trong queue
    }
    public void enqueue(E object){
        elements.addLast(object);   // thêm đối tượng vào cuối hàng đợi
    }
    public E dequeue(){  //Xóa 1 phần tử ở hàng đợi
        return elements.removeFirst();   // Xóa phần tử đầu tiên của hàng đợi
    }
    public int getSize(){   // Trả về số lượng hiện tại phần tử của hang đợi
        return elements.size();
    }
    public boolean isEmpty(){  // kiếm tra xem queue có trông hay k
        return elements.size() == 0;  //
    }
}
