package TestArrayList;

import List.MyList;

public class Main {
    public static void main(String[] args) {
        MyArrayList1<String> list = new MyArrayList1<>();

        list.add(0, "Demo0");
        list.add(1, "Demo1");
        list.add(2, "Demo2");


//        list.clear();    //Xóa Danh Sách

        System.out.println("List add(): " + list.toString());   //In ra danh saách add

        System.out.println("List Contains(element): " + list.contains("Demo1"));  // Trả về true nếu danh sách này chứa phần tử
        System.out.println("list get(index): " + list.get(2));    // Trả về phần tử tại chỉ số đã chỉ định
//        list.contai();
        System.out.println("List indexOf: " + list.indexOf("Demo3")); // Trả về chỉ số của phần tử khớp đầu tiên
                                                              // * trong danh sách này. Trả về -1 nếu không khớp.

        list.remove(1);  //Loại bỏ phần tử tại vị trí xác định 84* trong danh sách này.
                // Dịch chuyển mọi phần tử tiếp theo sang bên trái. 85 * Trả lại phần tử đã bị xóa khỏi danh sách.

        System.out.println("List remove(): " + list.toString()); // sau khi xóa thì dùng lại dùng sout(to.String) này để in ra
                                                                // mảng mới mà phần tử đã bị remove


        list.set(1,"Baba");   //Thay thế phần tử tại vị trí đã chỉ định
                              //trong danh sách này với phần tử được chỉ định
        System.out.println("List set(index, E e): " + list.toString()); // sau khi set() xong thì lại dùng sout(to.String()
                                                                        // để in ra lại mảng mới sau khi đã set()


        list.trimToSize();

        System.out.println("----------------------");
//        MyList<String> list1 = new MyArrayList1();

    }
}
