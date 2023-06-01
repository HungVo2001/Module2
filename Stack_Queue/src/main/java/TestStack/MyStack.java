package TestStack;

public class MyStack<E> {
    private static final int INITIAL_SIZE = 16;
    private E[] elements;
    private int count = 0;
    public MyStack(){
        elements = (E[]) (new Object[INITIAL_SIZE]);    //Ép kiểu E[] = new Ob chứa mặc định 16 phần tử
    }
    public void push(E object){       //Thêm phần tử vào đỉnh của stack
        ensureCapacity();
        elements[count++] = object;
    }
    private void ensureCapacity(){     // tạo Pthuc tăng kich thước độ dài mảng
        if (count >= elements.length){
            E[] newElement = (E[]) (new Object[elements.length * 2 + 1]);
            System.arraycopy(elements,0,newElement,0,count);  //Sao chép lại mảng củ và in ra độ dài mới
            elements = newElement;
        }
    }
    public E pop(){
        if (count==0){   // kiểm tra xem stack co rỗng k
            throw new IndexOutOfBoundsException("Stack is empty"); // Nếu rỗng ném lỗi ngoại lệ
        }
        E element = elements[count-1]; //Lấy phần tử ở đỉnh của stack
        elements[count-1] = null;   // Gán vị trí null cho vị trí cuối cùng trong mảng elements
        count--;
        return element;  // trả ve phần tử bị xóa
    }

}
