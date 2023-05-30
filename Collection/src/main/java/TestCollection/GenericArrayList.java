package TestCollection;
 class GenericArrayList<T> {

     //Khai báo lớp Generic
     private static final int INITIAL_SIZE = 16;
     private T[] elements;
     private int count = 0;

//     Phương thức khởi tạo (constructor) của lớp "GenericArrayList".
//     Trong phương thức này, một mảng mới được tạo với kích thước ban đầu là "INITIAL_SIZE" và gán cho biến "elements".
//     Để tạo một mảng kiểu T[], ta sử dụng ép kiểu (casting) từ một mảng kiểu Object[].
     public GenericArrayList() {
         this.elements = (T[]) new Object[INITIAL_SIZE];
     }

//     Phương thức "add" dùng để thêm một phần tử vào danh sách.
//     Phương thức này nhận một tham số "element" kiểu T, đại diện cho phần tử cần thêm.
     public void add(T element) {
         //TODO: Ensure capacity //
         this.elements[count++] = element;
     }

//  Phương thức printElements sẽ duyệt qua từng phần tử trong mảng elements (chỉ duyệt đến count - 1, vì chỉ có
//  count phần tử đã được thêm vào danh sách) và in ra từng phần tử bằng lệnh System.out.println(elements[i]).
     public void printElements(){
         for (int i = 0; i < count; i++) {
             System.out.println(elements[i]);
         }
     }

     public static void main(String[] args) {
         GenericArrayList<Integer> list = new GenericArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.printElements();
     }

}
