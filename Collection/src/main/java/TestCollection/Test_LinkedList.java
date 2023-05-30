package TestCollection;

import java.util.*;

public class Test_LinkedList {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Hoang");
        linkedList.add("Xuan");
        linkedList.add("Bao");
        linkedList.add("Dat");

//        ListIterator<String> listIterator = linkedList.listIterator();
//        while (listIterator.hasNext()) {  //Dung PT hasNext() để kiểm tra xem DS của linkedList có còn phần tử tiếp theo hay k
//            System.out.print(listIterator.next() + " ");  // next() In ra phần tử tiếp theo trong DS
//        }

        //Hoặc dùng for(i) chỉ sài được ở List.
        //Còn Set dùng for(set : sets) chỉ sài đc ở Set
//        for (int i = 0; i< linkedList.size(); i++) {
//            System.out.println(linkedList.get(i)); // Thằng get() bản thân thuộc thằng "List"

            // Biết được 1 Pthuc từ lớp khác mà ra.

        Set<String> sets1 = new HashSet<>();
        sets1.add("Doan");
        sets1.add("Bien");

        linkedList.addAll(sets1); //  =>> Dùng Pthuc addAll()


        }

    }


